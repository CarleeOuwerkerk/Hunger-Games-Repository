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
public class Tribute implements Serializable{
    
    private String name;
    private int district;
    private double stats;
    private Point location;
    private String gender;

    public Tribute() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public double getStats() {
        return stats;
    }

    public void setStats(double stats) {
        this.stats = stats;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Tributes{" + "name=" + name + ", district=" + district + ", stats=" + stats + ", location=" + location.toString() + ", gender=" + gender + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.name);
        hash = 73 * hash + this.district;
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.stats) ^ (Double.doubleToLongBits(this.stats) >>> 32));
        hash = 73 * hash + Objects.hashCode(this.location);
        hash = 73 * hash + Objects.hashCode(this.gender);
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
        final Tribute other = (Tribute) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.district != other.district) {
            return false;
        }
        if (Double.doubleToLongBits(this.stats) != Double.doubleToLongBits(other.stats)) {
            return false;
        }
        if (this.location != other.location) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        return true;
    }

    
    
    
    
    
    
}