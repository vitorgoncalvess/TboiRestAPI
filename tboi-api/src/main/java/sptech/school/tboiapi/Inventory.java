package sptech.school.tboiapi;

public class Inventory {

    private Integer coins;
    private Integer bombs;
    private Integer keys;

    public Inventory(Integer coins, Integer bombs, Integer keys) {
        this.coins = coins;
        this.bombs = bombs;
        this.keys = keys;
    }

    public Inventory() {
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
}
