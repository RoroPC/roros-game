package domain;

import java.util.ArrayList;
import java.util.List;
import domain.Stats;
import domain.Item;


public class Character {
	private String name;
    private String category;
    private Stats stats;
    private List<Item> itemsUsed;

    public Character(String name, String category, Stats stats) {
        this.name = name;
        this.category = category;
        this.stats = stats;
        this.itemsUsed = new ArrayList<>();
    }

    // Getters and setters
    //...

    public void addItemUsed(Item item) {
        itemsUsed.add(item);
    }
}
