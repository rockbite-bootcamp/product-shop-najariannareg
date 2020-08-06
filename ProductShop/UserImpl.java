public class UserImpl extends AbstractUser{

    @Override
    public int getThingCount(ThingType type) {
        return userMap.get(type).getCount();
    }

}
