package sptech.school.tboiapi.character;

import sptech.school.tboiapi.character.Character;

import java.util.ArrayList;
import java.util.List;

public class CharacterCollection{

    List<Character> characters;

    public CharacterCollection() {
        this.characters = new ArrayList<>();
    }

    public void addCharacter(Character c) {
        characters.add(c);
    }

    public CharacterCollection(Character c) {
        this.characters = new ArrayList<>();
        characters.add(c);
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }
}
