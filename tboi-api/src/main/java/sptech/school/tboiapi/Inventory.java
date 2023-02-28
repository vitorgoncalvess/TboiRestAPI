package sptech.school.tboiapi;

public class Inventory {

    private Item item;
    private Integer coins;
    private Integer bombs;
    private Integer keys;
    private Consumable consumable;

    public Inventory(Item item, Integer coins, Integer bombs, Integer keys, Consumable consumable) {
        this.item = item;
        this.coins = coins;
        this.bombs = bombs;
        this.keys = keys;
        this.consumable = consumable;
    }

    public Inventory() {
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getCoins() {
        return coins;
    }

    public void setCoins(Integer coins) {
        this.coins = coins;
    }

    public Integer getBombs() {
        return bombs;
    }

    public void setBombs(Integer bombs) {
        this.bombs = bombs;
    }

    public Integer getKeys() {
        return keys;
    }

    public void setKeys(Integer keys) {
        this.keys = keys;
    }

    public Consumable getConsumable() {
        return consumable;
    }

    public void setConsumable(Consumable consumable) {
        this.consumable = consumable;
    }
}
