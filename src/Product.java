import java.util.Objects;

public class Product {
    private String name;
    private double weight;
    private double price;

    public Product(String name, double weight, double price) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new EmptyProductExeption("Продукт не заполнен.");
        } else {
            this.name = name;
        }
        if (weight == 0) {
            throw new EmptyProductExeption("Продукт не заполнен.");
        } else {
            this.weight = weight;
        }
        if (price == 0) {
            throw new EmptyProductExeption("Продукт не заполнен.");
        } else {
            this.price = price;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(getName(), product.getName());
    }

    @Override
    public String toString() {
        return "\nProduct " + name + ", weight " + weight +
                "kg, price " + price + "$";
    }
}
