import java.util.HashMap;

public interface IUser {

    /**
     *
     * @return map of things belonging to a uer
     */
    HashMap<ThingType, Thing> getUser();

    /**
     *
     * @param type
     * @return the count of the thing
     */
    int getThingCount(ThingType type);

    /**
     * prints the names and counts of things belonging to a user
     */
    void outputUser();
}
