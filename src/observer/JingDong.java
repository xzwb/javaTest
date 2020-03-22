package observer;

import java.util.Observable;
import java.util.Observer;

public class JingDong implements Observer {

    @Override
    public void update(Observable observable, Object o) {
        String newProduct = (String) o;
        System.out.println("发送新差评 " + newProduct);
    }
}

class Test {
    public static void main(String[] args) {
        ProductList productList = ProductList.getInstance();
        JingDong jingDong = new JingDong();
        productList.addProductListObserver(jingDong);
        productList.addProduct("jjj");
    }
}
