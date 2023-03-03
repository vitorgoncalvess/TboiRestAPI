package sptech.school.tboiapi.character;

import sptech.school.tboiapi.entity.Entity;

public class Character extends Entity {

    private Integer health;
    private Double damage;
    private Double damageMultiplier;
    private Double shotSpeed;
    private Double luck;
    private Inventory inventory;

    public Character(String name, Integer health, Double damage, Double damageMultiplier, Double tears, Double shotSpeed, Double range, Double speed, Double luck, Inventory inventory) {
        super(name, tears+2.73, range, speed);
        this.health = health;
        this.damage = damage;
        this.damageMultiplier = damageMultiplier;
        this.shotSpeed = shotSpeed;
        this.luck = luck;
        this.inventory = inventory;
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

    public Double getShotSpeed() {
        return shotSpeed;
    }

    public void setShotSpeed(Double shotSpeed) {
        this.shotSpeed = shotSpeed;
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
