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

    List<CharacterCollection> list = Main.listCharacterCollection();
    @GetMapping
    public List<CharacterCollection> listCharacter() {
        return list;
    }

    @GetMapping("/{index}")
    public CharacterCollection getCharacterCollection(@PathVariable int index) {
        if (index >= 0 && index <= list.size()) {
            return list.get(index);
        } else {
            return null;
        }
    }

    @GetMapping("/{collId}/{charId}")
    public Character getCharacter(@PathVariable int collId, @PathVariable int charId) {
        if (collId >= 0 && collId <= list.size()) {
            if (charId >= 0 && charId <= list.get(collId).getCharacters().size()) {
                return list.get(collId).getCharacters().get(charId);
            } else {
                return null;
            }
        }
        return null;
    }

}
