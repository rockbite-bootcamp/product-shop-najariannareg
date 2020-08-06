import java.util.HashMap;

public abstract class AbstractUser implements IUser {

    protected HashMap<ThingType, Thing> userMap = new HashMap<>();

    @Override
    public HashMap<ThingType, Thing> getUser() {
        return userMap;
    }

    @Override
    public void outputUser() {
        for(ThingType type: userMap.keySet()){
            System.out.println(type.getName() + ": " + userMap.get(type).getCount());
        }
    }
}
