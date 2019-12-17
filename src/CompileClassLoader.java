import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class CompileClassLoader extends ClassLoader {
    // 读取全部文件
    private byte[] getBytes(String filename) throws IOException {
        File file = new File(filename);
        long len = file.length();
        byte[] raw = new byte[(int)len];
        try (FileInputStream fin = new FileInputStream(file)) {
            int r = fin.read(raw);
            if (r != len) {
                throw new IOException("无法读取全部文件: " + r + " != " + len);
            }
            return raw;
        }
    }
    // 定义编译制定java文件的方法
    private boolean compile(String javaFile) throws IOException {
        System.out.println("CompileClassLoader:正在编译 " + javaFile + "....");
        // 调用系统的javac命令
        Process p = Runtime.getRuntime().exec("javac " + javaFile);
        try {
            // 其他线程等待这个线程结束
            p.waitFor();
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        int ret = p.exitValue();
        return ret==0;
    }
    // 重写ClassLoader的findClass方法

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class clazz = null;
        // 将包路径的点（.）替换成斜杠（/）
        String fileStub = name.replace(".", "/");
        String javaFilename = fileStub + ".java";
        String classFilename = fileStub + ".class";
        File javaFile = new File(javaFilename);
        File classFile = new File(classFilename);
        // 当指定的java源文件存在, 且class文件不存在, 或者javac源文件的修改时间比Class文件
        // 的修改时间更晚时 重新编译
         if (javaFile.exists() && ((!classFile.exists()) || javaFile.lastModified() > classFile.lastModified())) {
             try {
                 // 如果编译失败, 或者class文件不存在
                 if (!compile(javaFilename) || !classFile.exists()) {
                     throw new ClassNotFoundException("ClassNotFoundException: " + javaFilename);
                 }
             } catch (IOException ex) {
                 ex.printStackTrace();
             }
        }
        // 如果Class文件存在
        if (classFile.exists()) {
            try {
                // 将Class文件的二进制数据读入数组
                byte[] raw = getBytes(classFilename);
                // 调用ClassLoader的defineClass方法将二进制数据转化为class对象
                clazz = defineClass(name, raw, 0, raw.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 如果clazz为null, 表明加载失败, 则抛出异常
        if (clazz == null) {
            throw new ClassNotFoundException(name);
        }
        return clazz;
    }
    // 定义一个主方法
    public static void main(String[] args)
        throws Exception {
        if (args.length < 1) {
            System.out.println("缺少目标类, 请按照如下格式输入");
            System.out.println("java CompileClassLoader Java源文件");
        }
        // 第一个参数是要运行的类
        String progClass = args[0];
        // 将剩下的参数作为运行时参数复制到一个新的数组
        String[] progArgs = new String[args.length-1];
        System.arraycopy(args, 1, progArgs, 0, progArgs.length);
        CompileClassLoader ccl = new CompileClassLoader();
        // 加载运行时需要的类
        Class<?> clazz = ccl.loadClass(progClass);
        // 获取需要运行的类的主方法
        Method main = clazz.getMethod("main", (new String[0]).getClass());
        Object argsArray[] = {progArgs};
        main.invoke(null, argsArray);
        String str = "hello";
    }
}
