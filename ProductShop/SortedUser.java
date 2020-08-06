import java.util.ArrayList;
import java.util.Comparator;

public class SortedUser extends UserImpl {

    protected ArrayList<Thing> sortedUser = new ArrayList<>();

    private Comparator<Thing> comparator;

    public SortedUser(){
        comparator = new Comparator<Thing>() {
            @Override
            public int compare(Thing thing1, Thing thing2) {
                return thing1.getType().getName().compareTo(thing2.getType().getName());
            }
        };
    }

    //since we have the purchase method in shop, I don't see how I should get this one done
    //unless I implement a purchase method for user.

    //maybe it's worth trying a SortedUser with a TreeMap instead of a HashMap.
}
