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
        double loanInterest = calculator.interestRate;

        System.out.print("Enter amount of years: ");
        calculator.numOfPayments = scanner.nextShort();
        short amountOfYears = (short) calculator.numOfPayments;

        double rawLoanInterest = (loanInterest / 100) / 12;
        loanInterest = 1 + ((loanInterest / 100) / 12);
        amountOfYears *= 12;
        double exponent = Math.pow(loanInterest, amountOfYears);



        double monthlyPayment = loanAmount * ((rawLoanInterest * exponent) /
                                (exponent - 1));



        System.out.println(monthlyPayment);


    }
}
