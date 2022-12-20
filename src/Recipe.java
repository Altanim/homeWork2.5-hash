import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Recipe {
    private String name;
    private double summCost;
    private ProductList productList;
    public Recipe(String name, double summCost, ProductList productList) {
        this.name = name;
        this.summCost = summCost;
        this.productList = productList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSummCost() {
        return summCost;
    }

    public void setSummCost(double summCost) {
        this.summCost = summCost;
    }

    public ProductList getProductList() {
        return productList;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
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
        return "Recipe " + name + '\'' +
                ", Cost " + summCost +
                "\nproductList" + productList + "" + "\n";
    }
}
