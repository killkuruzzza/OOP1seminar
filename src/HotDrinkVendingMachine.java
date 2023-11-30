import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {

    private List<Product> productList = new ArrayList<>();

    public void initProduct(List<Product> productList) {
        this.productList = productList;
    }

    public Product getProduct(String name) {
        for (Product item : productList)
            if (item.getName().equals(name))
                return item;
        return null;
    }

    public Product getProduct(String name,int volume, int temperature) {
        for (Product item : productList)
            if (item.getName().equals(name) &&((HotDrink) item).getVolume() == volume && ((HotDrink)item).getTemperature() == temperature)
                return item;
        return null;
    }
    public Product getProduct(String name,int volume) {
        for (Product item : productList)
            if (item.getName().equals(name) &&((HotDrink) item).getVolume() == volume)
            return item;
        return null;
    }

}
