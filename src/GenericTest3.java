import java.util.ArrayList;
import java.util.Collection;

// 这里的T就表示Number的子类
public class GenericTest3<T extends Number> {
    T col;
    public static void main(String[] args) {
        GenericTest3<Integer> ai = new GenericTest3<>();
        // String不是Number的子类
        // GenericTest3<String> as = new GenericTest3<String>();
        Object[] oa = new Object[100];
        Collection<Object> co = new ArrayList<>();
        GenericMethodTest.fromArrayToCollection(oa, co);
        String[] sa = new String[100];
        GenericMethodTest.fromArrayToCollection(sa, co);
        Collection<String> sc = new ArrayList<>();
    }
}

class GenericMethodTest {
    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o);
        }
    }

    static <T> void test(Collection<? extends T> from, Collection<T> to) {
        for (T ele : from) {
            to.add(ele);
        }
    }
    /*static <T> void test1(Collection<T> from, Collection<T> to) {
        for (T ele : from) {
            to.add(from);
        }
    }*/
}
