import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(new HashSetClass(5));
        hs.add(new HashSetClass(-3));
        hs.add(new HashSetClass(-2));
        hs.add(new HashSetClass(10));
        System.out.println(hs);
        Iterator it = hs.iterator();
        HashSetClass first = (HashSetClass)it.next();
        first.cont = -3;
        System.out.println(hs);
        hs.remove(new HashSetClass(-3));
        System.out.println(hs);
        System.out.println("hs是否包含-3 " + hs.contains(new HashSetClass(-3)));
        System.out.println("hs是否包含-2 " + hs.contains(new HashSetClass(-2)));
    }
}

class HashSetClass {
    public int cont;
    public HashSetClass(int cont) {
        this.cont = cont;
    }

    public String toString() {
        return "HashSetClass[cont:" + cont + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == HashSetClass.class) {
            HashSetClass hs = (HashSetClass)obj;
            return this.cont == hs.cont;
        }
        return false;
    }

    public int hasCode() {
        return this.cont;
    }
}
