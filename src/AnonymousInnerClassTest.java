public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        test(new AnonymousDome() {
            @Override
            public int getPrice() {
                return 155;
            }

            @Override
            public String getName() {
                return "nice";
            }
        });
    }

    public static void test(AnonymousDome dome) {
        System.out.println("buy a " + dome.getName() + "price is " + dome.getPrice());
    }
}

interface AnonymousDome {
    public int getPrice();
    public String getName();
}

