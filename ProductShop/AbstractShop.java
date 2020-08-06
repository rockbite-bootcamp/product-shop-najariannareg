import java.util.HashMap;

public abstract class AbstractShop implements IShop {

    protected HashMap<String, HashMap<String, Product>> shopMap = new HashMap<>();

    @Override
    public HashMap<String, HashMap<String, Product>> getShop() {
        return shopMap;
    }

    @Override
    public HashMap<String, Product> getProducts(String category) {
        return shopMap.get(category);
    }

    @Override
    public void outputShop() {
        for(String category: shopMap.keySet()){
            System.out.println(category);
        }
    }

    @Override
    public void outputProducts(String category) {
        HashMap<String, Product> products = getProducts(category);
        for(String id: products.keySet()){
            System.out.println(id);
        }
    }
}
