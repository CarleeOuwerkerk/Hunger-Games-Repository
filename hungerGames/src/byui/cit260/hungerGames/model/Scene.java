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
public enum Scene implements Serializable {
    
    sand("Sandy Area", "You look around you, and it's sandy.", 3.0),
    forest("Forest Area", "You look around you, and it's a forest.", 5.0),
    grass("Grassy Area", "You look around you, and it's grassy.", 4.0);
        
        
    // class instance variables 
    private final String terrainType;
    private final String description;
    private final double stats;

    private Scene(String terrainType, String description, double stats) {
        this.terrainType = terrainType;
        this.description = description;
        this.stats = stats;
 
    }

//    public Scene() {
//    }
    
    public String getDescription() {
        return description;
    }

//    public void setDescription(String description) {
//        this.description = description;
//    }

    public String getTerrainType() {
        return terrainType;
    }
//
//    public void setTerrainType(String terrainType) {
//        this.terrainType = terrainType;
//    }

    public double getStats() {
        return stats;
    }

//    public void setStats(double stats) {
//        this.stats = stats;
//    }


    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", terrainType=" + terrainType + ", stats=" + stats + '}';
    }

//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 97 * hash + Objects.hashCode(this.description);
//        hash = 97 * hash + Objects.hashCode(this.terrainType);
//        hash = 97 * hash + (this.trap ? 1 : 0);
//        hash = 97 * hash + (int) (Double.doubleToLongBits(this.stats) ^ (Double.doubleToLongBits(this.stats) >>> 32));
//        hash = 97 * hash + (this.blocked ? 1 : 0);
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
//        final Scene other = (Scene) obj;
//        if (!Objects.equals(this.description, other.description)) {
//            return false;
//        }
//        if (!Objects.equals(this.terrainType, other.terrainType)) {
//            return false;
//        }
//        if (this.trap != other.trap) {
//            return false;
//        }
//        if (Double.doubleToLongBits(this.stats) != Double.doubleToLongBits(other.stats)) {
//            return false;
//        }
//        if (this.blocked != other.blocked) {
//            return false;
//        }
//        return true;
//    }
//    
//    
//    
}
