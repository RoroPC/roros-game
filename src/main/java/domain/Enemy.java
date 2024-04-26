package domain;

import java.util.ArrayList;
import java.util.List;

public class Enemy {
	private String name;
    private String role;
    private List<Character> characterOwned;
    private List<Character> characterUsed;

    public Enemy(String name, String role) {
        this.name = name;
        this.role = role;
        this.characterOwned = new ArrayList<>();
        this.characterUsed = new ArrayList<>();
    }

    // Getters and setters
    //...

    public void addCharacterOwned(Character character) {
        characterOwned.add(character);
    }

    public void addCharacterUsed(Character character) {
        characterUsed.add(character);
    }

}
