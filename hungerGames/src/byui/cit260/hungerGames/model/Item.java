/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.model;

import java.io.Serializable;

/**
 *
 * @author Zack
 */
public enum Item implements Serializable {

    fruit("Fruit", 3.0, 0),
    meat("Meat", 5.0, 0),
    water("Water", 2.0, 0),
    bat("Bat", 1.0, 0),
    knife("Knife", 1.0, 0),
    sword("Sword", 3.0, 0),
    bowAndArrow("Bow & Arrow", 5.0, 1),
    spear("Spear", 5.0, 0);

    //class instance variables
    public String description;
    public double stats;
    public int amount;

    private Item(String description, double stats, int amount) {
        this.description = description;
        this.stats = stats;
        this.amount = amount;
    }

    private Location[] location;

    public String getDescription() {
        return description;
    }

    public double getStats() {
        return stats;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Items{" + "description=" + description + ", stats=" + stats + ", amount=" + amount + '}';
    }

    public int compareToIgnoreCase(Item item) {
        System.out.println("\n *** I hope this is right ****");
        return 0;
    }

    public Location[][] getLocations() {
        System.out.println("\n**** I hope this works ***");
        return null;
    }

}
