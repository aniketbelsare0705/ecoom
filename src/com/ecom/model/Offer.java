package com.ecom.model;

public class Offer {


    private int quantity;   
    private double discount;
 

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Offer( int quantity, double discount) {
        super();
        this.quantity = quantity;
        this.discount = discount;
    }
    @Override
    public String toString() {
        return "Offer [ quantity=" + quantity + ", discount=" + discount + "]";
    }

}
