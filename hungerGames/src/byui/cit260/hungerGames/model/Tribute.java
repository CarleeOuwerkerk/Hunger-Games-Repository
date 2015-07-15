/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Carlee Ouwerkerk
 */
public enum Tribute implements Serializable {

    george("George", 1, 5.0, new Point(3, 3), "Male"),
    fred("Fred", 2, 10.0, new Point(1, 4), "Male"),
    bill("Bill", 3, 15.1, new Point(2, 5), "Male"),
    ted("Ted", 4, 20.1, new Point(4, 0), "Male"),
    amber("Amber", 5, 25.5, new Point(0, 3), "Female"),
    ali("Ali", 6, 30.5, new Point(5, 2), "Female"),
    kate("Kate", 7, 35.5, new Point(3, 1), "Female"),
    suzy("Suzy", 8, 45.0, new Point(5, 0), "Female");

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
