import java.util.HashSet;
import java.util.Set;

public class ProductList {
    private Set<Product> products = new HashSet<>();
    public void addProduct(Product product){
        if (products.contains(product)){
            throw new ProductExistExeption("Продукт уже добавлен");
        }
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }

    @Override
    public String toString() {
        return "" + products;
    }
}
