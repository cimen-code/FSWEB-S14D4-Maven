package org.example.model;

public class Bread extends ProductForSale {

    private boolean wholeGrain;

    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.wholeGrain = true;
    }

    public boolean isWholeGrain() {
        return wholeGrain;
    }

    @Override
    public void showDetails() {
        System.out.println(
                "Bread: " +
                "type=" + getType() +
                ", price=" + getPrice() +
                ", description=" + getDescription() +
                ", wholeGrain=" + wholeGrain
        );
    }
}
