import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        // 向TreeSet中添加对象必须要实现Comparable接口
        ts.add(new TreeSetClass(-2));
        ts.add(new TreeSetClass(5));
        ts.add(new TreeSetClass(-1));
        System.out.println(ts);
    }
}

class TreeSetClass implements Comparable {
    public int count;
    public TreeSetClass(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "count = " + count;
    }

    @Override
    public int compareTo(Object o) {
        TreeSetClass ts = (TreeSetClass)o;
        return count > ts.count ? 1 : count < ts.count ? -1 : 0;
    }
}
