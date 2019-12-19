public enum SexEnum implements SexInfaceTest {
    MAN("男")
            {
                @Override
                public void info() {
                    System.out.println("这个枚举值代表男人");
                }
            },
    WOMAN("女")
            {
                @Override
                public void info() {
                    System.out.println("这个枚举值代表女人");
                }
            };
    private final String sex;

    /*public void info() {
        System.out.println("这是一个用于定义性别的枚举类");
    }*/

    private SexEnum(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return sex;
    }
}

