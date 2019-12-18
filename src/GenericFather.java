public class GenericFather<T> {
    public T info;
    public GenericFather(T info) {
        this.info = info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }
}
