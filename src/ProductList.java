import java.util.HashMap;
import java.util.Map;

public class ProductList {
    private final Map<Product, Integer> products = new HashMap<>();
    public void addProduct(Product product, int weight){
        if (products.containsKey(product)){
            throw new ProductExistExeption("Продукт уже добавлен");
        }
        products.put(product, weight);
    }
    public void add(Product product){
        add(product);
    }
    public void print(){
        for (Map.Entry<Product, Integer> entry : products.entrySet()){
            System.out.println("Product: " + entry.getKey() + ", amount: " + entry.getValue() + "pcs");
        }
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    @Override
    public String toString() {
        return "Product list: " + products;
    }
}
