package org.example;
import java.sql.Date;
import java.util.Scanner;

public class Person {
    private String firstname;
    private String lastname;
    private Date dateOfBirth;
    private String phoneNumber;
    private String city;
    private String country;
    private String homeAddress;

    public Person() {
    }

    public Person(String firstname,
                  String lastname,
                  Date dateOfBirth,
                  String phoneNumber,
                  String town,
                  String land,
                  String homeAddress) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.city = town;
        this.country = land;
        this.homeAddress = homeAddress;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public static Person inputPersonData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter firstname: ");
        String firstname = scanner.nextLine();

        System.out.print("Enter lastname: ");
        String lastname = scanner.nextLine();

        System.out.print("Enter date of birth: ");
        Date dateOfBirth = Date.valueOf(scanner.nextLine());

        System.out.print("Enter contact phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        System.out.print("Enter country: ");
        String country = scanner.nextLine();

        System.out.print("Enter home address: ");
        String homeAddress = scanner.nextLine();

        return new Person(firstname, lastname, dateOfBirth, phoneNumber, city, country, homeAddress);
    }

    @Override
    public String toString() {
        String formatString = "%-20s|%-15s|%-15s|%-15s|%-20s|%-20s|%-30s";
        return String.format(formatString, firstname, lastname, dateOfBirth, phoneNumber, city, country, homeAddress);
    }
}
