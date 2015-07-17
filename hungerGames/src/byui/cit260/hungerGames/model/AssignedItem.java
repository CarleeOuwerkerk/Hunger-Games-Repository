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
    public class AssignedItem implements Serializable {
    
    //class instance variables
    private  Item item;
    private int amount;

    
    public AssignedItem() {
    }

    public AssignedItem(Item item, int amount) {
        this.item = item;
        this.amount = amount;
    }
    
    

    
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "AssignedItem{" + "item=" + item + ", amount=" + amount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.item);
        hash = 37 * hash + this.amount;
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
        final AssignedItem other = (AssignedItem) obj;
        if (this.item != other.item) {
            return false;
        }
        if (this.amount != other.amount) {
            return false;
        }
        return true;
    }


}
