package observer;


import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * 被观察者
 */
public class ProductList extends Observable {
    private List<String> productList = null; // 产品列表

    private static ProductList instance; // 类唯一实例

    private ProductList() {} //构造方法私有化

    /**
     * 单例模式
     * @return
     */
    public static ProductList getInstance() {
        if (instance == null) {
            instance = new ProductList();
            instance.productList = new ArrayList<>();
        }
        return instance;
    }

    public void addProductListObserver(Observer observer) {
        this.addObserver(observer);
    }

    public void addProduct(String newProduct) {
        productList.add(newProduct);
        System.out.println("产品列表增加了新产品!!");
        this.setChanged(); // 被观察者发生变化
        this.notifyObservers(newProduct); // 通知观察者并传递新产品
    }
}


