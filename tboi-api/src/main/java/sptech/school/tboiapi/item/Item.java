package sptech.school.tboiapi.item;

public class Item {

    private String name;
    private String resume;
    private String desc;
    private String type;
    private String itemPool;

    public Item(String name) {
        this.name = name;
    }

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
