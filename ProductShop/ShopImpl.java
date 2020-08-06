import java.util.HashMap;

public class ShopImpl extends AbstractShop {

    @Override
    public void purchaseProduct(String category, String ID, IUser user) {
        HashMap<String, Product> productMap = getProducts(category);
        Product product = productMap.get(ID);
        Thing[] cost = product.getCost();
        Thing[] payload = product.getPayload();

        //to check if the user can afford the product
        boolean isPossible = true;

        for(Thing thing: cost){
            Thing userThing = user.getUser().get(thing.getType());
            if(userThing == null || userThing.getCount() > thing.getCount()){
                isPossible = false;
                break;
            }
        }


        //execute the transaction
        if(isPossible){
            //the user pays for the product
            for(Thing thing: cost){
                Thing userThing = user.getUser().get(thing.getType());
                int initialCount = userThing.getCount();
                int newCount = initialCount - thing.getCount();
                userThing.setCount(newCount);
            }
            //the user receives the product
            for(Thing thing: payload){
                user.getUser().putIfAbsent(thing.getType(), new Thing(thing.getType()));
                Thing userThing = user.getUser().get(thing.getType());
                int initialCount = userThing.getCount();
                int newCount = initialCount + thing.getCount();
                userThing.setCount(newCount);
            }
        }

    }

}
