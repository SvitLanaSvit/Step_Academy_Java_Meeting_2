package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = Person.inputPersonData();
        System.out.println(person);

        City city  = City.inputCityData();
        System.out.println(city);

        Country country = Country.inputCountryData();
        System.out.println(country);

        Fraction fraction1 = Fraction.inputFraction();
        Fraction fraction2 = Fraction.inputFraction();
        System.out.println("Fraction 1: " + fraction1);
        System.out.println("Fraction 2: " + fraction2);

        var sum = fraction1.add(fraction2);
        var subtract = fraction1.subtract(fraction2);
        var multiply = fraction1.multiply(fraction2);
        var divide = fraction1.divide(fraction2);

        System.out.println("Sum: " + sum);
        System.out.println("subtract: " + subtract);
        System.out.println("Multiply: " + multiply);
        System.out.println("Divide: " + divide);

        Book book = Book.inputBookData();
        System.out.println(book);

        Car car = Car.inputCarData();
        System.out.println(car);
    }
}