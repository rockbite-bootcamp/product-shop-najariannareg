public class Product {

    /**
     * Unique identifier
     */
    private String ID;

    /**
     * Category to which this product belongs
     */
    private String category;

    /**
     * Array of Things consisting of type and count that we take
     */
    private Thing[] payload;

    /**
     * Array of Things consisting of type and count that we give
     */
    private Thing[] cost;

    public Product(String ID, String category, Thing[] payload, Thing[] cost){
        this.ID = ID;
        this.category = category;
        this.payload = payload;
        this.cost = cost;
    }

    public String getID() {
        return ID;
    }

    public String getCategory() {
        return category;
    }

    public Thing[] getPayload() {
        return payload;
    }

    public Thing[] getCost() {
        return cost;
    }

}
