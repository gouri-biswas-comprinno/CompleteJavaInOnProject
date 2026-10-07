package com.ok.javainoneproject.oops;

public class Interfaces {

    public static void main(String[] args) {

        System.out.println(PaymentValidator.isValidCreditCard("1234567890123456"));
        System.out.println(PaymentValidator.isValidAmount(5000));
    }
}

interface PaymentValidator {

    boolean validatePayment(Payment payment);

    // Static utility method
    static boolean isValidCreditCard(String cardNumber) {
        return cardNumber.length() == 16;
    }

    // Static utility method
    static boolean isValidAmount(double amount) {
        return amount > 0 && amount < 1000000;
    }
}

class PayPalValidator implements PaymentValidator {

    @Override
    public boolean validatePayment(Payment payment) {
        if (!PaymentValidator.isValidAmount(payment.getAmount())) {
            return false;
        }

        return true;
    }
}

class Payment {

    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}