package sptech.school.tboiapi;

import java.util.ArrayList;
import java.util.List;

public abstract class Main {

    static Character isaacN = new Character("Isaac", 6, 3.5, 1.0, 0.0, 1.0, 6.5, 1.0, 0.0, new Inventory(new ChargeItem("The D6", 6), 0,1,0, null));
    static CharacterCollection isaac = new CharacterCollection();
    static Character magN = new Character("Magdalene", 8, 3.5, 1.0, 0.0, 1.0, 6.5, 0.85, 0.0, new Inventory(new ChargeItem("Yum Heart", 4), 0,0,0, null));
    static CharacterCollection mag = new CharacterCollection();
    static Character cainN = new Character("Cain", 4, 3.5, 1.2, 0.0, 1.0, 4.5, 1.3, 0.0, new Inventory(new Item("Lucky Foot"), 0,0,1, null));
    static CharacterCollection cain = new CharacterCollection();
    static Character normalJudas = new Character("Judas", 2, 3.5, 1.35, 0.0, 1.0, 6.5, 1.0, 0.0, new Inventory(new ChargeItem("The Book Of Belial", 3), 3,0,0, null));
    static Character darkJudas = new Character("Dark Judas", 4, 3.5, 2.0, 0.0, 1.0, 6.5, 1.1, 0.0, new Inventory(null, 0,0,0, null));
    static CharacterCollection judas = new CharacterCollection();
    static Character blueBabyN = new Character("???", 6, 3.5, 1.05, 0.0, 1.0, 6.5, 1.1, 0.0, new Inventory(new ChargeItem("The Poop", 1), 0,0,0, null));
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

}
