public class Main {
    public static void main(String[] args) {

        Product apple = new Product("Apple", 0.3,1.5);
        Product honey = new Product("Honey", 0.1,4);
        Product grape = new Product("Grape", 0.3,2.3);
        Product fish = new Product("Fish",1,5.4);
        Product oil = new Product("Oil",0.5,2.6);
        Product carrot = new Product("Carrot",0.2, 0.8);
        Product garlic = new Product("Garlic", 0.05,0.2);
        Product onion = new Product("Onion",0.3,1.1);
        Product potato = new Product("Potato",3,6);

        ProductList productList = new ProductList();
        productList.addProduct(apple);
        productList.addProduct(honey);
        productList.addProduct(grape);
        productList.addProduct(fish);
        productList.addProduct(oil);
        productList.addProduct(carrot);
        productList.addProduct(garlic);
        productList.addProduct(onion);
        productList.addProduct(potato);
        System.out.println(productList);
    }
}