/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

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
            bowAndArrow("Bow & Arrow", 5.0, 0),
            spear("Spear", 5.0, 0),
            rope("Rope", 0.0, 0);
   
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

//    public void setDescription(String description) {
//        this.description = description;
//    }


    public double getStats() {
        return stats;
    }

//    public void setStats(int stats) {
//        this.stats = stats;
//    }

    public int getAmount() {
        return amount;
    }

//    public void setAmount(int amount) {
//        this.amount = amount;
//    }

    @Override
    public String toString() {
        return "Items{" + "description=" + description + ", stats=" + stats + ", amount=" + amount + '}';
    }

}

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 37 * hash + Objects.hashCode(this.description);
//        hash = 37 * hash + this.stats;
//        hash = 37 * hash + this.amount;
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Item other = (Item) obj;
//        if (!Objects.equals(this.description, other.description)) {
//            return false;
//        }
//
//        if (this.stats != other.stats) {
//            return false;
//        }
//        if (this.amount != other.amount) {
//            return false;
//        }
//        return true;
//    }
    
