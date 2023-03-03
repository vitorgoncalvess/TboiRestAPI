package sptech.school.tboiapi.character;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sptech.school.tboiapi.Main;
import sptech.school.tboiapi.character.Character;
import sptech.school.tboiapi.character.CharacterCollection;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    List<CharacterCollection> list = Main.listCharacterCollection();
    @GetMapping
    public List<CharacterCollection> listCharacter() {
        return list;
    }

    @GetMapping("/{index}")
    public CharacterCollection getCharacterCollection(@PathVariable int index) {
        if (index >= 0 && index <= list.size()-1) {
            return list.get(index);
        } else {
            return null;
        }
    }

    @GetMapping("/{collId}/{charId}")
    public Character getCharacter(@PathVariable int collId, @PathVariable int charId) {
        if (collId >= 0 && collId <= list.size()-1) {
            if (charId >= 0 && charId <= list.get(collId).getCharacters().size()-1) {
                return list.get(collId).getCharacters().get(charId);
            } else {
                return null;
            }
        }
        return null;
    }

}
