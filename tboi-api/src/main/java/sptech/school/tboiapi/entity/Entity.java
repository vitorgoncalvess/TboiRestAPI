package sptech.school.tboiapi.entity;

public abstract class Entity {

    private String name;
    private Double tears;
    private Double range;
    private Double speed;

    public Entity(String name, Double tears, Double range, Double speed) {
        this.name = name;
        this.tears = tears;
        this.range = range;
        this.speed = speed;
    }

    public Entity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTears() {
        return tears;
    }

    public void setTears(Double tears) {
        this.tears = tears;
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
}
