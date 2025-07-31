package models;

import java.time.LocalDateTime;
import java.util.Date;

public class Booking {

    private static long bookingCount;
    private long bookingId;
    private Date bookingDate;
    private Taxi taxi;
    private User user;
    private long pickupTime;
    private long dropTime;
    private String pickupPoint;
    private String dropPoint;
    private Double amount;


    public Booking(Date bookingDate, Taxi taxi, User user, long pickupTime, long dropTime, String pickupPoint, String dropPoint, Double amount) {
        this.bookingId = ++bookingCount;
        this.bookingDate = bookingDate;
        this.taxi = taxi;
        this.user = user;
        this.pickupTime = pickupTime;
        this.dropTime = dropTime;
        this.pickupPoint = pickupPoint;
        this.dropPoint = dropPoint;
        this.amount = amount;
    }

    public long getBookingCount(){
        return bookingCount;
    }
    public long getBookingId() {
        return bookingId;
    }
    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getPickupPoint() {
        return pickupPoint;
    }

    public void setPickupPoint(String pickupPoint) {
        this.pickupPoint = pickupPoint;
    }

    public String getDropPoint() {
        return dropPoint;
    }

    public void setDropPoint(String dropPoint) {
        this.dropPoint = dropPoint;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
