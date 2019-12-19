public class SexEnumTest {
    public static void main(String[] args) {
        /*for (SexEnum sex : SexEnum.values()) {
            System.out.println(sex);
        }
        judge(SexEnum.MAN);
        SexEnum manEnum = SexEnum.valueOf(SexEnum.class, "MAN");
        System.out.println(manEnum);*/
        SexEnum man = SexEnum.valueOf("MAN");
        System.out.println(man);
        man.info();
    }

    public static void judge(SexEnum sex) {
        switch (sex) {
            case MAN:
                System.out.println("这是一个男人");
                break;
            case WOMAN:
                System.out.println("这是一个女人");
                break;
        }
    }
}
