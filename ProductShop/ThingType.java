public class ThingType {

    /**
     * Material name
     */
    private String name;

    /**
     * Unique identifier
     */
    private String ID;

    /**
     * Material description
     */
    private String description;

    /**
     * icon URL to be downloaded
     */
    private String icon;


    public ThingType(String name, int maxCount){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

}
