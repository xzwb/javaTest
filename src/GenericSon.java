// 在父类事泛型的时候子类继承必须写明类型或者不写菱形括号
// 不加尖括号就是相当于<Object>
// public class GenericSon extends GenericFather<T> { }
public class GenericSon extends GenericFather<String> {
    public GenericSon(String info) {
        super(info);
    }

    public String getInfo() {
        return "子类" + super.getInfo();
    }
    // 下面写法是错误的, 重写父类方法时返回值类型应该与尖括号里的一致
    /*public Object getInfo(){
        return "zilei";
    }*/

    public static void main(String[] args) {

    }
}