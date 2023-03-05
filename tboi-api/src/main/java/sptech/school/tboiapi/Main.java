package sptech.school.tboiapi;

import sptech.school.tboiapi.character.Character;
import sptech.school.tboiapi.character.CharacterCollection;
import sptech.school.tboiapi.character.Inventory;
import sptech.school.tboiapi.item.ChargeItem;
import sptech.school.tboiapi.item.Item;

import java.util.ArrayList;
import java.util.List;

public abstract class Main {

    static List<Item> itemsList = listItem();

    static Character isaacN = new Character("Isaac", 6, 3.5, 1.0, 0.0, 1.0, 6.5, 1.0, 0.0, new Inventory(itemsList.get(101), 0,1,0, null));
    static CharacterCollection isaac = new CharacterCollection();
    static Character magN = new Character("Magdalene", 8, 3.5, 1.0, 0.0, 1.0, 6.5, 0.85, 0.0, new Inventory(itemsList.get(43), 0,0,0, null));
    static CharacterCollection mag = new CharacterCollection();
    static Character cainN = new Character("Cain", 4, 3.5, 1.2, 0.0, 1.0, 4.5, 1.3, 0.0, new Inventory(itemsList.get(44), 0,0,1, null));
    static CharacterCollection cain = new CharacterCollection();
    static Character normalJudas = new Character("Judas", 2, 3.5, 1.35, 0.0, 1.0, 6.5, 1.0, 0.0, new Inventory(itemsList.get(33), 3,0,0, null));
    static Character darkJudas = new Character("Dark Judas", 4, 3.5, 2.0, 0.0, 1.0, 6.5, 1.1, 0.0, new Inventory(null, 0,0,0, null));
    static CharacterCollection judas = new CharacterCollection();
    static Character blueBabyN = new Character("???", 6, 3.5, 1.05, 0.0, 1.0, 6.5, 1.1, 0.0, new Inventory(itemsList.get(35), 0,0,0, null));
    static CharacterCollection blueBaby = new CharacterCollection();

    static List<CharacterCollection> list = new ArrayList<>();

    public static List<CharacterCollection> listCharacterCollection() {
        isaac.addCharacter(isaacN);
        list.add(isaac);
        mag.addCharacter(magN);
        list.add(mag);
        cain.addCharacter(cainN);
        list.add(cain);
        judas.addCharacter(normalJudas);
        judas.addCharacter(darkJudas);
        list.add(judas);
        blueBaby.addCharacter(blueBabyN);
        list.add(blueBaby);
        return list;
    }

    public static List<Item> listItem() {
        List<String> items = ScriptPython.runScript();
        List<Item> itemsList = new ArrayList<>();
        for(int i = 0; i < items.size(); i++) {
            while(!items.get(i+1).contains("ItemID")) {
                i++;
            }
            Item item;
            boolean isActive = false;
            String itemName = items.get(i); i++;
            String itemIdS = items.get(i); i++;
            itemIdS = itemIdS.replace("ItemID: ", "");
            Integer itemId = Integer.parseInt(itemIdS);
            String itemDesc = items.get(i); i++;
            String itemQuality = items.get(i); i++;
            itemQuality = itemQuality.replace("Quality: ", "");
            StringBuilder itemDescDetail = new StringBuilder();
            while(!items.get(i).contains("Type:")) {
                if(items.get(i+1).contains("Type:")) {
                    itemDescDetail.append(items.get(i)); i++;
                } else {
                    itemDescDetail.append(items.get(i)).append(", "); i++;
                }
            }
            String itemType = items.get(i); i++;
            itemType = itemType.replace("Type: ", "");
            String itemRechargeTime = "";
            if (items.get(i).contains("Recharge ")) {
                itemRechargeTime = items.get(i); i++;
                itemRechargeTime = itemRechargeTime.replace("Recharge Time: ", "");
                itemRechargeTime = itemRechargeTime.replace("Recharge time: ", "");
                isActive = true;
            }
            String itemPool = items.get(i); i++;
            itemPool = itemPool.replace("Item Pool: ", "");
            if (isActive) {
                item = new ChargeItem(itemId, itemName, itemDesc, itemQuality, itemDescDetail.toString(), itemType, itemRechargeTime,  itemPool);
            } else {
                item = new Item(itemId, itemName, itemDesc, itemQuality, itemDescDetail.toString(), itemType, itemPool);
            }
            itemsList.add(item);
        }
        return itemsList;
    }

}
