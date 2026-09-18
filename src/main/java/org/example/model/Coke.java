package org.example.model;

public class Coke extends ProductForSale {

    private boolean sugarFree;

    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.sugarFree = false;
    }

    public boolean isSugarFree() {
        return sugarFree;
    }

    @Override
    public void showDetails() {
        System.out.println(
                "Coke: " +
                "type=" + getType() +
                ", price=" + getPrice() +
                ", description=" + getDescription() +
                ", sugarFree=" + sugarFree
        );
    }
}
