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
    bill("Bill", 1, 10.1, new Point(3,3), "Male");
    
    
    private final String name;
    private final int district;
    private final double stats;
    private final Point location;
    private final String gender;


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

    
    @Override
    public String toString() {
        return "Tributes{" + "name=" + name + ", district=" + district + ", stats=" + stats + ", location=" + location.toString() + ", gender=" + gender + '}';
    }


       
}