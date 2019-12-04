public class Test {
    public static void main(String[] args) {
        B b = new B(10);
        System.out.println(b.x);
        b.smile();
    }
}

class A {
    protected int x;

    A(int x) {
        try {
            this.x = x;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    A() { }

    public /*final*/ void smile() {
        System.out.println("smile");
    }
}

class B extends A {
    B(int x) {
        super.x = x;
    }

    public void smile() {
        System.out.println("hahahah");
    }
}
