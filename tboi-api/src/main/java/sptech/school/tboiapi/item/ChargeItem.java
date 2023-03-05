package sptech.school.tboiapi.item;

public class ChargeItem extends Item {

    private String chargeTime;

    public ChargeItem(Integer id, String name, String desc, String itemQuality, String detailDesc, String itemType, String itemRechargeTime,  String itemPool) {
        super(id, name, desc, itemQuality, detailDesc, itemType, itemPool);
        this.chargeTime = itemRechargeTime;
    }

    public ChargeItem() {

    }

    public String getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(String chargeTime) {
        this.chargeTime = chargeTime;
    }

    @Override
    public String toString() {
        return "ChargeItem{" +
                "chargeTime=" + chargeTime +
                "} " + super.toString();
    }
}
