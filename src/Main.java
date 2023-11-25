import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new HotDrink ("Coffe", 20, 250, 70));
        productList.add(new HotDrink ("Coffe", 30, 500, 70));
        productList.add(new HotDrink ("Tea", 20, 250, 80));
        productList.add(new HotDrink ("Tea", 30, 500, 90));
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("Coffe",250, 70));
        System.out.println(vendingMachine.getProduct("Tea"));
        System.out.println(vendingMachine.getProduct("Tea",500));


    }
}