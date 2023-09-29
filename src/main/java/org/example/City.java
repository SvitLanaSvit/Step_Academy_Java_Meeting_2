package org.example;

import java.sql.Date;
import java.util.Scanner;

public class City {
    private String cityName;
    private String regionName;
    private String countryName;
    private int numberOfInhabitants;
    private String postalCode;
    private String telephoneCode;

    public City() {
    }

    public City(String cityName,
                String regionName,
                String countryName,
                int numberOfInhabitants,
                String postalCode,
                String telephoneCode) {
        this.cityName = cityName;
        this.regionName = regionName;
        this.countryName = countryName;
        this.numberOfInhabitants = numberOfInhabitants;
        this.postalCode = postalCode;
        this.telephoneCode = telephoneCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getNumberOfInhabitants() {
        return numberOfInhabitants;
    }

    public void setNumberOfInhabitants(int numberOfInhabitants) {
        this.numberOfInhabitants = numberOfInhabitants;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTelephoneCode() {
        return telephoneCode;
    }

    public void setTelephoneCode(String telephoneCode) {
        this.telephoneCode = telephoneCode;
    }
    public static City inputCityData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter city name: ");
        String cityName = scanner.nextLine();

        System.out.print("Enter region name: ");
        String regionName = scanner.nextLine();

        System.out.print("Enter country name: ");
        String countryName = scanner.nextLine();

        System.out.print("Enter number of inhabitants: ");
        int numberOfInhabitants = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter postal code: ");
        String postalCode = scanner.nextLine();

        System.out.print("Enter telephone code: ");
        String telephoneCode = scanner.nextLine();

        return new City(cityName, regionName, countryName, numberOfInhabitants, postalCode, telephoneCode);
    }

    @Override
    public String toString() {
        String formatString = "%-20s|%-20s|%-20s|%-15s|%-10s|%-5s|";
        return String.format(formatString, cityName, regionName, countryName, numberOfInhabitants, postalCode, telephoneCode);
    }
}
