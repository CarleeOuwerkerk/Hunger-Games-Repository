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
public enum Scene implements Serializable {

    start("Start Scene", "You're in a ship taking you to the arena", 0.0, "SS"),
    sand("Sandy Area", "You look around you, and it's sandy.", -3.0, "SA"),
    forest("Forest Area", "You look around you, and it's a forest.", 5.0, "FO"),
    grass("Grassy Area", "You look around you, and it's grassy.", 4.0, "GR"),
    mountain("Mountain Area", "You look around you, and it's rocky.", 3.0, "MO"),
    marsh("Marsh Area", "You look around you, and it's marshy.", -2.0, "MA"),
    field("Field Area", "You look around you, and it's a field.", -4.0, "FI"),
    finish("Finish Scene", "You beat the last tribute!!!", 2.0, "FS");

    // class instance variables 
    private final String terrainType;
    private final String description;
    private final double stats;
    private final String mapSymbol;

    private Scene(String terrainType, String description, double stats, String mapSymbol) {
        this.terrainType = terrainType;
        this.description = description;
        this.stats = stats;
        this.mapSymbol = mapSymbol;

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
    public String getMapSymbol() {
        return mapSymbol;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", terrainType=" + terrainType + ", stats=" + stats + ", mapSymbol=" + mapSymbol + '}';
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
    public void setDescription(String _Welcome_to_the_Hunger_Games_let_the_game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setMapSymbol(String _st_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //int i??
    public void setTravelTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
