package sptech.school.tboiapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    Character isaacN = new Character("Isaac", 6, 3.5, 1.0, 0.0, 1.0, 6.5, 1.0, 0.0, new Inventory(0,1,0), new ChargeItem("The D6", 6));
    CharacterCollection isaac = new CharacterCollection();
    Character magN = new Character("Magdalene", 8, 3.5, 1.0, 0.0, 1.0, 6.5, 0.85, 0.0, new Inventory(0,0,0), new ChargeItem("Yum Heart", 4));
    CharacterCollection mag = new CharacterCollection();
    Character cainN = new Character("Cain", 4, 3.5, 1.2, 0.0, 1.0, 4.5, 1.3, 0.0, new Inventory(0,0,1), new Item("Lucky Foot"));
    CharacterCollection cain = new CharacterCollection();
    Character normalJudas = new Character("Judas", 2, 3.5, 1.35, 0.0, 1.0, 6.5, 1.0, 0.0, new Inventory(3,0,0), new ChargeItem("The Book Of Belial", 3));
    Character darkJudas = new Character("Dark Judas", 4, 3.5, 2.0, 0.0, 1.0, 6.5, 1.1, 0.0, new Inventory(0,0,0));
    CharacterCollection judas = new CharacterCollection();
    Character blueBabyN = new Character("???", 6, 3.5, 1.05, 0.0, 1.0, 6.5, 1.1, 0.0, new Inventory(0,0,0), new ChargeItem("The Poop", 1));
    CharacterCollection blueBaby = new CharacterCollection();

    List<CharacterCollection> list = new ArrayList<>();
    @GetMapping
    public List<CharacterCollection> listCharacter() {
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

    @GetMapping("/{index}")
    public CharacterCollection getCharacter(@PathVariable int index) {
        if (index >= 0 && index <= list.size()) {
            return list.get(index);
        } else {
            return null;
        }
    }

}
