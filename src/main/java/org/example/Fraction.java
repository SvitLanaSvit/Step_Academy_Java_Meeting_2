package org.example;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static Fraction inputFraction() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator (non-zero): ");
        int denominator = scanner.nextInt();

        return new Fraction(numerator, denominator);
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private void simplify() {
        int commonDivisor = gcd(numerator, denominator);
        numerator /= commonDivisor;
        denominator /= commonDivisor;
    }

    public Fraction add(Fraction other) {
        int resultNumerator = (numerator * other.denominator) + (other.numerator * denominator);
        int resultDenominator = denominator * other.denominator;
        Fraction result = new Fraction(resultNumerator, resultDenominator);
        result.simplify();
        return result;
    }

    public Fraction subtract(Fraction other) {
        int resultNumerator = (numerator * other.denominator) - (other.numerator * denominator);
        int resultDenominator = denominator * other.denominator;
        Fraction result = new Fraction(resultNumerator, resultDenominator);
        result.simplify();
        return result;
    }

    public Fraction multiply(Fraction other) {
        int resultNumerator = numerator * other.numerator;
        int resultDenominator = denominator * other.denominator;
        Fraction result = new Fraction(resultNumerator, resultDenominator);
        result.simplify();
        return result;
    }

    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        int resultNumerator = numerator * other.denominator;
        int resultDenominator = denominator * other.numerator;
        Fraction result = new Fraction(resultNumerator, resultDenominator);
        result.simplify();
        return result;
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return Integer.toString(numerator);
        }
        return numerator + "/" + denominator;
    }
}
