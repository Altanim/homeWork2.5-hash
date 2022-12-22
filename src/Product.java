import java.util.Objects;

public class Product extends ProductList {
    private String name;
    private int weight;
    private int price;

    public Product(String name, int weight, int price) {
      setName(name);
      setWeight(weight);
      setPrice(price);
    }


    public String getName() {
        if (name == null || name.isBlank() || name.isEmpty() ){
            throw new ProductExistExeption("Продукт не заполнен");
        } else {
            this.name = name;
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        if (weight == 0) {
            throw new EmptyProductExeption("Продукт не заполнен.");
        } else {
            this.weight = weight;
        }
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        if (price == 0) {
            throw new EmptyProductExeption("Продукт не заполнен.");
        } else {
            this.price = price;
        }
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public String toString() {
        return name +
                ", price " + price + "r.";
    }
}
