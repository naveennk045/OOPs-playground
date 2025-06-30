package models;

public class User {
    private static long counter = 1;
    private long userId ;
    private String firstName;
    private String lastName;
    private int age;
    private String mobileNumber;
    private String emailId;

    public User(String firstName, String lastName, int age, String mobileNumber, String emailId) {
        this.userId = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
    }


    @Override
    public String toString() {
        return "User{" +
                "ID=" + userId +
                ", Name='" + firstName + ' ' + lastName + '\'' +
                ", Age=" + age +
                ", Mobile='" + mobileNumber + '\'' +
                ", Email='" + emailId + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
