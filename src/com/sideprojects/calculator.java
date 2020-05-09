package com.sideprojects;


public class calculator {
    private int monthlyPayment;
    private long principal;
    private double interestRate;
    private int numOfPayments;

    public void calculateMortgage() {
        interestRate /= 12;
        numOfPayments *= 12;

        monthlyPayment = (int) ((int) (principal * (interestRate * (1 + interestRate) * numOfPayments )) /
                        (principal * (interestRate * (1 + interestRate) * numOfPayments - 1)));
    }


}


