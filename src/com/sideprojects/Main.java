package com.sideprojects;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Calculator calculator = new Calculator();

    public static void main(String[] args) {
        System.out.print("Enter loan amount: ");
        calculator.principal = scanner.nextInt();
        int loanAmount = calculator.principal;

        System.out.print("Enter your loan interest: ");
        calculator.interestRate = (int) scanner.nextDouble();
        int loanInterest = calculator.interestRate;

        System.out.print("Enter amount of years: ");
        calculator.numOfPayments = scanner.nextShort();
        int amountOfYears = calculator.numOfPayments;

        loanInterest = (loanInterest / 100) / 12;
        amountOfYears *= 12;

        int monthlyPayment = loanAmount * ((loanInterest * ((1 + loanInterest) * amountOfYears)) /
                ((1 + loanInterest) * amountOfYears) - 1);

        System.out.println(monthlyPayment);

    }
}
