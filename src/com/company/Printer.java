package com.company;

public class Printer extends Product {

    private String type;

    public Printer(String prNumber, String prName, int prUnits, double unitPrice, String type, Vendor vendor) {
        super(prNumber, prName, prUnits, unitPrice, vendor);
        this.type = type;
    }

    public Printer() {
    }

    public double itemValue() {
        return super.itemValue()* 1.05;
    }
}
