package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Country {
    private String countryName;
    private String continentName;
    private int numberOfInhabitants;
    private String countryTelephoneCode;
    private String capitalCityName;
    private List<String> cities;

    public Country() {
    }

    public Country(String countryName,
                   String continentName,
                   int numberOfInhabitants,
                   String countryTelephoneCode,
                   String capitalCityName,
                   List<String> cities) {
        this.countryName = countryName;
        this.continentName = continentName;
        this.numberOfInhabitants = numberOfInhabitants;
        this.countryTelephoneCode = countryTelephoneCode;
        this.capitalCityName = capitalCityName;
        this.cities = cities;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public int getNumberOfInhabitants() {
        return numberOfInhabitants;
    }

    public void setNumberOfInhabitants(int numberOfInhabitants) {
        this.numberOfInhabitants = numberOfInhabitants;
    }

    public String getCountryTelephoneCode() {
        return countryTelephoneCode;
    }

    public void setCountryTelephoneCode(String countryTelephoneCode) {
        this.countryTelephoneCode = countryTelephoneCode;
    }

    public String getCapitalCityName() {
        return capitalCityName;
    }

    public void setCapitalCityName(String capitalCityName) {
        this.capitalCityName = capitalCityName;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public static Country inputCountryData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Country Name: ");
        String countryName = scanner.nextLine();

        System.out.print("Enter Continent Name: ");
        String continentName = scanner.nextLine();

        System.out.print("Enter Number of Inhabitants: ");
        int numberOfInhabitants = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Country Telephone Code: ");
        String countryTelephoneCode = scanner.nextLine();

        System.out.print("Enter Capital City Name: ");
        String capitalCityName = scanner.nextLine();

        List<String> cities = new ArrayList<>();
        System.out.println("Enter City Names (separate with commas): ");
        String citiesInput = scanner.nextLine();
        String[] cityArray = citiesInput.split(",");
        for (String city : cityArray) {
            cities.add(city.trim());
        }

        return new Country(countryName, continentName, numberOfInhabitants, countryTelephoneCode, capitalCityName, cities);
    }

    @Override
    public String toString() {
        String formatString = "%-12s | %-12s | %12d | %-6s | %-7s | %s";
        String formattedCities = String.join(", ", cities);
        return String.format(formatString, countryName, continentName, numberOfInhabitants, countryTelephoneCode, capitalCityName, formattedCities);
    }
}