package org.example.model;

public class Chocolate extends ProductForSale {

    private int cocoaPercentage;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
        this.cocoaPercentage = 70;
    }

    public int getCocoaPercentage() {
        return cocoaPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println(
                "Chocolate: " +
                "type=" + getType() +
                ", price=" + getPrice() +
                ", description=" + getDescription() +
                ", cocoaPercentage=" + cocoaPercentage
        );
    }
}
