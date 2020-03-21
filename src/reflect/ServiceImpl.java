package reflect;

public class ServiceImpl {
    private int id;
    private String name;

    public ServiceImpl(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(int id, String name) {
        System.out.println("hello : " + id + "  " + name);
    }
}
