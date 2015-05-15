/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Zack
 */
public class Item implements Serializable {
    
    //class instance variables
    private String description;
    private String type;
    private int stats;
    private int numberInStock;

    public Item() {
    }
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStats() {
        return stats;
    }

    public void setStats(int stats) {
        this.stats = stats;
    }

    public int getNumberInStock() {
        return numberInStock;
    }

    public void setNumberInStock(int numberInStock) {
        this.numberInStock = numberInStock;
    }

    @Override
    public String toString() {
        return "Items{" + "description=" + description + ", type=" + type + ", stats=" + stats + ", numberInStock=" + numberInStock + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + Objects.hashCode(this.type);
        hash = 37 * hash + this.stats;
        hash = 37 * hash + this.numberInStock;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (this.stats != other.stats) {
            return false;
        }
        if (this.numberInStock != other.numberInStock) {
            return false;
        }
        return true;
    }
    
    
   
    
}
