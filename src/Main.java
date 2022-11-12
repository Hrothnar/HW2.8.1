import java.util.*;

public class Main {
    public static void main(String[] args) {

        Product apple = new Product("Яблоко", 64, 1.5);
        Product banana = new Product("Банан", 44, 1.6);
        Product strawberry = new Product("Клубника", 88, 0.8);
        Product yogurt = new Product("Йогурт", 55, 0.34);
        Product orange = new Product("Апельсин", 104, 1.3);

        ShoppingList.addProductToList(apple);
        ShoppingList.addProductToList(apple);
//        ShoppingList.addProductToList(banana);
        ShoppingList.addProductToList(strawberry);

        ShoppingList.buyProductFromList(apple);
//        ShoppingList.buyProductFromList(apple);

        Recipe fruitSalad = new Recipe("Фруктовый салат");
        fruitSalad.getRecipe().add(apple);
        fruitSalad.getRecipe().add(banana);
        fruitSalad.getRecipe().add(orange);
        fruitSalad.getRecipe().add(yogurt);

        Recipe fruitSalad1 = new Recipe("Ещё один фруктовый салат");
        fruitSalad1.getRecipe().add(apple);
        fruitSalad1.getRecipe().add(banana);
        fruitSalad1.getRecipe().add(orange);
        fruitSalad1.getRecipe().add(yogurt);

        System.out.println(fruitSalad.getCostOfRecipe());

        Recipe.addRecipeToCookbook(fruitSalad);
//        Recipe.addRecipeToCookbook(fruitSalad);
        Recipe.addRecipeToCookbook(fruitSalad1);


        Set<Integer> list = new HashSet<>();
        for (int i = 0; list.size() < 20; i++) {
            int num = (int) (Math.random() * 1000);
            list.add(num);
        }
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next() % 2 != 0)
                iter.remove();
        }
        System.out.println(Arrays.toString(list.toArray()) + "   Размер: " + list.size());


    }
}