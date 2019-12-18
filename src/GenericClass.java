public class GenericClass<T> {
    private T info;

    public GenericClass() { }

    public GenericClass(T info) {
        this.info = info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return this.info;
    }

    public static void main(String[] args) {
        GenericClass<String> a1 = new GenericClass<>("apple");
        System.out.println(a1.getInfo());
        // 尖括号里面必须是类
        // GenecicInterface<int> a2 = new GenecicInterface<int>(5);
        // 自动装箱机制
        GenericClass<Integer> a2 = new GenericClass<>(5);
        System.out.println(a2.getInfo());
    }
}
