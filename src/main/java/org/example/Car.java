package org.example;

import java.util.Scanner;

public class Car {
    private String carName;
    private String manufacturerName;
    private int yearOfProduction;
    private double engineVolume;

    public Car() {
    }

    public Car(String carName, String manufacturerName, int yearOfProduction, double engineVolume) {
        this.carName = carName;
        this.manufacturerName = manufacturerName;
        this.yearOfProduction = yearOfProduction;
        this.engineVolume = engineVolume;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public static Car inputCarData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Car Name: ");
        String carName = scanner.nextLine();

        System.out.print("Enter Manufacturer Name: ");
        String manufacturerName = scanner.nextLine();

        System.out.print("Enter Year of Production: ");
        int yearOfProduction = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Engine Volume (in liters): ");
        double engineVolume = scanner.nextDouble();

        return new Car(carName, manufacturerName, yearOfProduction, engineVolume);
    }

    @Override
    public String toString() {
        String formatString = "%s | %s | %-6s | %-7s";
        return String.format(formatString, carName, manufacturerName, yearOfProduction, engineVolume);
    }
}
