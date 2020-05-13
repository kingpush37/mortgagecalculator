package com.sideprojects.appclient;

import com.sideprojects.modulesets.Calculator;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();


        System.out.print("Enter loan amount: ");
        int homePrice = scanner.nextInt();
        calculator.setPrincipal(homePrice);


        System.out.print("Enter your loan interest: ");
        double loanInterest = scanner.nextDouble();
        calculator.setInterestRate(loanInterest);


        System.out.print("Enter amount of years: ");
        short mortgagePayments = scanner.nextShort();
        calculator.setNumOfPayments(mortgagePayments);


        calculator.calculateMortgage();
        calculator.printMortgagePayment();

    }
}
