package domain;

import java.util.ArrayList;
import java.util.List;

public class Player {
		private String name;
	    private Integer rp;
	    private Integer gold;
	    private List<Character> characterOwned;
	    private List<Character> characterUsed;
	    private Integer elo;

	    public Player(String name, Integer rp, Integer gold, Integer elo) {
	        this.name = name;
	        this.rp = rp;
	        this.gold = gold;
	        this.elo = elo;
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
