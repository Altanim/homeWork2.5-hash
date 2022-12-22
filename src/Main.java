public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        Product apple = new Product("Apple", 1, 150);
        Product honey = new Product("Honey", 1, 400);
        Product grape = new Product("Grape", 1, 230);
        Product fish = new Product("Fish", 1, 540);
        Product oil = new Product("Oil", 1, 260);
        Product carrot = new Product("Carrot", 1, 80);
        Product garlic = new Product("Garlic", 1, 20);
        Product onion = new Product("Onion", 1, 10);
        Product potato = new Product("Potato", 1, 60);

        ProductList fryFish = new ProductList();

        fryFish.addProduct(fish,2);
        fryFish.addProduct(oil,1);
        fryFish.addProduct(garlic,3);
        fryFish.addProduct(carrot,2);
        fryFish.print();

        System.out.println();

        Recipe carrotFish = new Recipe("Fish with carrot");
        carrotFish.addRecipe(fish, 2);
        carrotFish.addRecipe(carrot, 2);
        carrotFish.addRecipe(oil, 1);
        carrotFish.addRecipe(garlic,1);
        carrotFish.printRecipe();

        System.out.println();

        Recipe honeyApple = new Recipe("Honey apple");
        honeyApple.addRecipe(honey,1);
        honeyApple.addRecipe(apple, 3);
        honeyApple.printRecipe();

//        System.out.println("Задание 2");
//
//        Random random = new Random();
//        Set<Integer> nums = new HashSet<>();
//        while (nums.size() < 20) {
//            nums.add(random.nextInt(1000));
//        }
//        System.out.println(nums);
//        Iterator<Integer> iterator = nums.iterator();
//        while (iterator.hasNext()){
//            Integer number = iterator.next();
//            if (number%2==1){
//                iterator.remove();
//            }
//        }
//        System.out.println(nums);

        // HashMap Задание №1

        PhoneBook phoneBook = new PhoneBook();
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
        phoneBook.printPhone();
        }

    }
