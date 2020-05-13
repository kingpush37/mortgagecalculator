package com.sideprojects.modulesets;



public class Calculator {
   private int principal;
   private double interestRate;
   private short numOfPayments;
   private double monthlyPayment;



    public void calculateMortgage() {
        double rawLoanInterest = (interestRate / 100) / 12;
        double loanInterest = 1 + rawLoanInterest;
        double exponent = Math.pow(loanInterest, numOfPayments * 12);


        monthlyPayment = (int) (principal * ((rawLoanInterest * exponent) /
                        (exponent - 1)));
    }

    public void printMortgagePayment() {
        System.out.println("----------------");
        System.out.println("Your Mortgage Payment Information");
        System.out.println(" ");
        System.out.println("Initial Monthly Payments: " + monthlyPayment);
        System.out.println("Total of " + numOfPayments * 12 + " payments");
    }

    public void setPrincipal(int principal) {
        this.principal = principal;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setNumOfPayments(short numOfPayments) {
        this.numOfPayments = numOfPayments;
    }
}








