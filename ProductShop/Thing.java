public class Thing {

    /**
     * The type of this thing
     */
    private ThingType type;

    /**
     * The count of this thing
     */
    private int count = 0;

    public Thing(ThingType type){
        this.type = type;
    }

    public ThingType getType() {
        return type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
