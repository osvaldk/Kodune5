package com.company;

public class Product {
    private String prNumber;
    private String prName;
    private int prUnits;
    private double unitPrice;
    private Vendor vendor;

    public Product(String prNumber, String prName, int prUnits, double unitPrice, Vendor vendor) {
        this.prNumber = prNumber;
        this.prName = prName;
        this.prUnits = prUnits;
        this.unitPrice = unitPrice;
        this.vendor = vendor;
    }

    public Product() {
    }

    public String getPrNumber() {
        return prNumber;
    }

    public void setPrNumber(String prNumber) {
        this.prNumber = prNumber;
    }

    public String getPrName() {
        return prName;
    }

    public void setPrName(String prName) {
        this.prName = prName;
    }

    public int getPrUnits() {
        return prUnits;
    }

    public void setPrUnits(int prUnits) {
        this.prUnits = prUnits;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double itemValue() {
        return this.prUnits * this.unitPrice;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prNumber='" + prNumber + '\'' +
                ", prName='" + prName + '\'' +
                ", prUnits=" + prUnits +
                ", unitPrice=" + unitPrice +
                ", Inventory value =" + itemValue() +
                ", vendor=" + vendor +
                '}';
    }


}
