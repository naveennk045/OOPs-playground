package models;

public class Taxi {

    private static long taxiCount;
    private long taxiId;
    private String taxiNumber;
    private User driver;
    private double collectedAmount;
    private long numberOfDrives;
    private boolean isFree = true;
    private boolean currentLocation;

    public Taxi(String taxiNumber, User driver) {
        this.taxiId = ++taxiCount;
        this.taxiNumber = taxiNumber;
        this.driver = driver;
    }
    public long getTaxiCount(){
        return taxiCount;
    }

    public long getTaxiId() {
        return taxiId;
    }

    public void setTaxiId(long taxiId) {
        this.taxiId = taxiId;
    }

    public String getTaxiNumber() {
        return taxiNumber;
    }

    public void setTaxiNumber(String taxiNumber) {
        this.taxiNumber = taxiNumber;
    }

    public User getDriver() {
        return driver;
    }

    public void setDriver(User driver) {
        this.driver = driver;
    }

    public double getCollectedAmount() {
        return collectedAmount;
    }

    public void setCollectedAmount(double collectedAmount) {
        this.collectedAmount = collectedAmount;
    }

    public long getNumberOfDrives() {
        return numberOfDrives;
    }

    public void setNumberOfDrives(long numberOfDrives) {
        this.numberOfDrives = numberOfDrives;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public boolean isCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(boolean currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Taxi(String taxiNumber) {
        this.taxiId = ++taxiCount;
        this.taxiNumber = taxiNumber;
    }
}
