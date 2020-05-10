package com.sideprojects;


public class Calculator {
    public int monthlyPayment;
    public int principal;
    public int interestRate;
    public int numOfPayments;

    public void calculateMortgage() {
        //interestRate /= 12;
        //numOfPayments *= 12;

        monthlyPayment = 500;

        /*Payment = P x (r / n) x (1 + r / n)^n(t)] / (1 + r / n)^n(t) - 1

        {100,000 x (.06 / 12) x [1 + (.06 / 12)^12(30)]} / {[1 + (.06 / 12)^12(30)] - 1}
        (100,000 x .005 x 6.022575) / 5.022575
        3011.288 / 5.022575 = 599.55
        * */

        monthlyPayment = principal * interestRate;
    }

    public void printPayment() {
        System.out.println("Monthly payment: " + monthlyPayment);
    }


}


