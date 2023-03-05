package sptech.school.tboiapi.item;

public class Item {

    private int id;
    private String name;
    private String desc;
    private String itemQuality;
    private String detailDesc;
    private String itemType;
    private String itemPool;

    public Item(int id, String name, String desc, String itemQuality, String detailDesc, String itemType, String itemPool) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.itemQuality = itemQuality;
        this.detailDesc = detailDesc;
        this.itemType = itemType;
        this.itemPool = itemPool;
    }

    public Item() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public void setItemQuality(String itemQuality) {
        this.itemQuality = itemQuality;
    }

    public String getDetailDesc() {
        return detailDesc;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemPool() {
        return itemPool;
    }

    public void setItemPool(String itemPool) {
        this.itemPool = itemPool;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", itemQuality='" + itemQuality + '\'' +
                ", detailDesc='" + detailDesc + '\'' +
                ", itemType='" + itemType + '\'' +
                ", itemPool='" + itemPool + '\'' +
                '}';
    }
}
