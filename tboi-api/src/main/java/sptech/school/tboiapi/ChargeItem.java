package sptech.school.tboiapi;

public class ChargeItem extends Item{

    private Integer charges;

    public ChargeItem(String name, Integer charges) {
        super(name);
        this.charges = charges;
    }

    public ChargeItem() {

    }

    public Integer getCharges() {
        return charges;
    }

    public void setCharges(Integer charges) {
        this.charges = charges;
    }
}
