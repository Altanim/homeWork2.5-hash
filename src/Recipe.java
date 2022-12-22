import java.util.*;

public class Recipe {
    private String name;
    private int summCost;
    private final Map<Product, Integer> products;
    private int amount;

    public Recipe(String name) {
        this.name = name;
        this.summCost = 0;
        this.products = new HashMap<Product, Integer>();
    }
    public void addRecipe(Product product, int amount){
        if (products.containsKey(product)){
            throw new ProductExistExeption("Продукт уже добавлен");
        }
        if (amount <= 0){
            this.amount = 1;
        } else {
            this.amount = amount;
        }
        this.products.put(product, amount);
        this.summCost += amount * product.getPrice();
    }
    public void printRecipe(){
        System.out.println(name);
        for (Map.Entry<Product, Integer> entry : products.entrySet()){
            System.out.println(entry.getKey() + ", amount: " + entry.getValue() + "pcs.");
        }
        System.out.println("total price: " + summCost + "r.");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSummCost() {
        return summCost;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(getName(), recipe.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Recipe " + name +
                ", products " + products;
    }
}
