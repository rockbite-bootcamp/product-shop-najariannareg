import java.util.HashMap;

public interface IShop {

    /**
     *
     * @return map of the shop
     */
    HashMap<String, HashMap<String, Product>> getShop();

    /**
     *
     * @param category
     * @return map of the products
     */
    HashMap<String, Product> getProducts(String category);

    /**
     * a user perchases a specific product
     * @param ID
     * @param user
     */
    void purchaseProduct(String category, String ID, IUser user);

    /**
     * prints the categories in a shop
     */
    void outputShop();

    /**
     * prints the IDs of products belonging to a category in a shop
     * @param category
     */
    void outputProducts(String category);
}
