package models;


public class Location {
    private String name;

    public Location(String name) {
        this.name = name.toUpperCase();  // Keep consistent
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Location)) return false;
        Location other = (Location) obj;
        return this.name.equalsIgnoreCase(other.name);
    }

    @Override
    public int hashCode() {
        return name.toUpperCase().hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
