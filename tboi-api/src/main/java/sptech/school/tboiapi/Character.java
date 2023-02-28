package sptech.school.tboiapi;

public class Character {

    private String name;
    private Integer health;
    private Double damage;
    private Double damageMultiplier;
    private Double tears;
    private Double shotSpeed;
    private Double range;
    private Double speed;
    private Double luck;
    private Inventory inventory;

    public Character(String name, Integer health, Double damage, Double damageMultiplier, Double tears, Double shotSpeed, Double range, Double speed, Double luck, Inventory inventory) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.damageMultiplier = damageMultiplier;
        this.tears = 2.73+tears;
        this.shotSpeed = shotSpeed;
        this.range = range;
        this.speed = speed;
        this.luck = luck;
        this.inventory = inventory;
    }

    public Character() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Double getDamage() {
        return damage;
    }

    public void setDamage(Double damage) {
        this.damage = damage;
    }

    public Double getDamageMultiplier() {
        return damageMultiplier;
    }

    public void setDamageMultiplier(Double damageMultiplier) {
        this.damageMultiplier = damageMultiplier;
    }

    public Double getTears() {
        return tears;
    }

    public void setTears(Double tears) {
        this.tears = tears;
    }

    public Double getShotSpeed() {
        return shotSpeed;
    }

    public void setShotSpeed(Double shotSpeed) {
        this.shotSpeed = shotSpeed;
    }

    public Double getRange() {
        return range;
    }

    public void setRange(Double range) {
        this.range = range;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getLuck() {
        return luck;
    }

    public void setLuck(Double luck) {
        this.luck = luck;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
