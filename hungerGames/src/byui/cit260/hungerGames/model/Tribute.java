/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Carlee Ouwerkerk
 */
public enum Tribute implements Serializable{
    
    george("George", 1, 10.0, new Point(3,3), "Male"),
    fred("Fred", 1, 10.0,new Point(3,3), "Male"),
    bill("Bill", 1, 10.1, new Point(3,3), "Male"),
    ted("Ted", 1, 10.1, new Point(3,3), "Male"),
    amber("Amber", 2, 10.5, new Point (2,2), "Female"),
    ali("Ali", 2, 10.5, new Point (2,2), "Female"),
    kate("Kate", 2, 10.5, new Point (2,2), "Female"),
    suzy("Suzy", 2, 10.5, new Point (2,2), "Female");
    
    
    private final String name;
    private final int district;
    private final double stats;
    private final Point location;
    private final String gender;
    
    private Inventory inventory;
    

    private Tribute(String name, int district, double stats, Point location, String gender) {
        this.name = name;
        this.district = district;
        this.stats = stats;
        this.location = location;
        this.gender = gender;
    }

    
    
    public String getName() {
        return name;
    }

  

    public int getDistrict() {
        return district;
    }


    public double getStats() {
        return stats;
    }


    public Point getLocation() {
        return location;
    }


    public String getGender() {
        return gender;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    
    
    @Override
    public String toString() {
        return "Tributes{" + "name=" + name + ", district=" + district + ", stats=" + stats + ", location=" + location.toString() + ", gender=" + gender + '}';
    }


       
}