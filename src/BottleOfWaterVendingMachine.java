import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine{
    private List<Product> productList = new ArrayList<>();
    @Override
    public void initProduct(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product item : productList)
            if(item.getName().equals(name))
                return item;
        return null;
    }

    public Product getProduct(String name, int volume){
        for (Product item : productList)
            if(item.getName().equals(name) && ((BottleOFWater) item).getVolume() == volume)
                return item;
        return null;
    }

    public Product getProduct(int volume){
        for (Product item : productList)
            if(((BottleOFWater) item).getVolume() == volume)
                return item;
        return null;
    }
}
