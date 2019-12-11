public class MainStart {
    public static void main(String[] args) {
        B1 b1 = new B1();
        A1 a1 = new B1();
        // 如果在一次程序中直接执行下面的语句是永远不会在打印出静态初始化块了
        /* B1 b1 = new B1();
        A1 a2 = new A1(); */
        /***************手动分割线*************************/
        //B1 b1 = new B1();
       /* A1 a1 = new A1();*/
    }
}

class A1 {
    static int a = 1;
    static {
        System.out.println("父类静态初始化块");
        a++;
        System.out.println(a);
    }

    // static int a = 1;

    {
        System.out.println(a);
        System.out.println("父类非静态初始化块");
    }

    A1() {
        System.out.println("父类构造器");
    }
}

class B1 extends  A1 {
    static {
        System.out.println("子类静态初始化块");
    }

    {
        System.out.println("子类费静态初始化块");
    }

    B1() {
        System.out.println("子类构造器");
    }
}


