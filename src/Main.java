import java.util.*;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        Product apple = new Product("Apple", 0.3, 1.5);
        Product honey = new Product("Honey", 0.1, 4);
        Product grape = new Product("Grape", 0.3, 2.3);
        Product fish = new Product("Fish", 1, 5.4);
        Product oil = new Product("Oil", 0.5, 2.6);
        Product carrot = new Product("Carrot", 0.2, 0.8);
        Product garlic = new Product("Garlic", 0.05, 0.2);
        Product onion = new Product("Onion", 0.3, 1.1);
        Product potato = new Product("Potato", 3, 6);


        ProductList productList = new ProductList();
        productList.addProduct(fish);
        productList.addProduct(oil);
        productList.addProduct(carrot);
        productList.addProduct(garlic);
        System.out.println(productList);

        Recipe friedFish = new Recipe("Fried fish", 10.2, productList);
        Recipe honeyApple = new Recipe("Honey apple", 5.5, productList);

        RecipeList recipeList = new RecipeList();
        recipeList.addRecipe(honeyApple);
        recipeList.addRecipe(friedFish);
        System.out.println();
        System.out.println(recipeList);


        System.out.println("Задание 2");

        Random random = new Random();
        Set<Integer> nums = new HashSet<>();
        while (nums.size() < 20) {
            nums.add(random.nextInt(1000));
        }
        System.out.println(nums);
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()){
            Integer number = iterator.next();
            if (number%2==1){
                iterator.remove();
            }
        }
        System.out.println(nums);
    }

}