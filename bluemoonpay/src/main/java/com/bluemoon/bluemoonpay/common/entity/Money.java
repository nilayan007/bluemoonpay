package com.bluemoon.bluemoonpay.common.entity;


import jakarta.persistence.Embeddable;

@Embeddable
public class Money {
    private int amountUnits; // Amount in cents
    private String currency; // ISO 4217 currency code

    private Money(int amountUnits, String currency) {
        this.amountUnits = amountUnits;
        this.currency = currency;
    }

    public Money add(Money other) {
        if (!this.currency.equals(other.currency)) {
            throw new IllegalArgumentException("Cannot add money with different currencies");
        }
        return new Money(this.amountUnits + other.amountUnits, this.currency);
    }
    public Money subtract(Money other) {
        if (!this.currency.equals(other.currency)) {
            throw new IllegalArgumentException("Cannot subtract money with different currencies");
        }
        return new Money(this.amountUnits - other.amountUnits, this.currency);
    }
    public static Money of(int amountUnits, String currency) {
        return new Money(amountUnits, currency);
    }
    public static Money inr(int amountUnits){
        return new Money(amountUnits, "INR");
    }

}
