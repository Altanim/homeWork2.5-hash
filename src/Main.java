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

        // HashMap Задание №1

        HashMap phoneBook = new HashMap();
        phoneBook.add("Антоненко Сергей Станиславович", "+79814754739");
        phoneBook.add("Кузьмина Ольга Семеновна", "+79238544573");
        phoneBook.add("Сотникова Наталья Александровна", "+73494982458");
        phoneBook.add("Раенко Михаил Николаевич", "+79814567343");
        phoneBook.add("Сергеев Николай Петпрович", "+78815678743");
        phoneBook.add("Устенко Сергей Николаевич", "+79845678787");
        phoneBook.add("Сытник Марина Андреевна", "+74578395987");
        phoneBook.add("Иванова Ольга Николаевна", "+73452348494");
        phoneBook.add("Алексеев Андрей Петрович", "+73428759484");
        phoneBook.add("Вихлянцев Руслан Александрович", "+78915845758");
        phoneBook.add("Моцак Наталья Евгеньевна", "+78884754747");
        phoneBook.add("Кучкаров Александр Дмитриевич", "+73492385938");
        phoneBook.add("Васильев Евгений Константинович", "+74538547575");
        phoneBook.add("Слесарева Екатерина Михайловна", "+73845763245");
        phoneBook.add("Фомин Максим Максимович", "+79812993484");
        phoneBook.add("Рудских Павел Андреевич", "+79842394583");
        phoneBook.add("Макаров Константин Алексеевич", "+79824328585");
        phoneBook.add("Вербилова Светлана Николаевна", "+79858458383");
        phoneBook.add("Ягина Анна Сергеевна", "+73948575474");
        phoneBook.add("Литвиненко Никита Петрович", "+79814958575");
        phoneBook.print();
        }

    }
