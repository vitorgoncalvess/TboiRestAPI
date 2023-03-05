package sptech.school.tboiapi.item;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sptech.school.tboiapi.Main;
import sptech.school.tboiapi.ScriptPython;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    List<Item> itemsList = Main.listItem();

    @GetMapping()
    public List<Item> getItems() {
        return itemsList;
    }

    @GetMapping("/{itemId}")
    public Item getItem(@PathVariable int itemId) {
        for (Item i : itemsList) {
            if (i.getId() == itemId) {
                return i;
            }
        }
        return null;
    }

}
