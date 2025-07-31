package service;

import models.Location;

import java.util.ArrayList;
import java.util.List;

public class LocationService {

    private final List<Location> locations = new ArrayList<>();

    public void addLocation(String name) {
        Location location = new Location(name);
        if (!locations.contains(location)) {
            locations.add(location);
            System.out.println("Added location: " + name);
        } else {
            System.out.println("Location already exists: " + name);
        }
    }

    public List<Location> getAllLocations() {
        return locations;
    }

    public Location findByName(String name) {
        for (Location loc : locations) {
            if (loc.getName().equalsIgnoreCase(name)) {
                return loc;
            }
        }
        return null;
    }

    public int calculateTime(Location l1, Location l2){
        int i1 = locations.indexOf(l1);
        int i2 = locations.indexOf(l2);
        if (i1 == -1 || i2 == -1) return -1;
        return Math.abs(i1 - i2);
    }

    public int distanceBetween(Location l1, Location l2) {
        int i1 = locations.indexOf(l1);
        int i2 = locations.indexOf(l2);
        if (i1 == -1 || i2 == -1) return -1;
        return Math.abs(i1 - i2) * 15;
    }
}
