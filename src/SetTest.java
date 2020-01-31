import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("xx");
        hashSet.add("vv");
        hashSet.add("bb");
        hashSet.add("tt");
        hashSet.add("ttt");
        hashSet.add("wrhetnr");
        System.out.println(hashSet.size());
    }
}
