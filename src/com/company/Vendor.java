package com.company;

public class Vendor {

    private String name;
    private String address;
    private String repName;
    private String phNumber;

    public Vendor(String name, String address, String repName, String phNumber) {
        this.name = name;
        this.address = address;
        this.repName = repName;
        this.phNumber = phNumber;
    }

    public Vendor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRepName() {
        return repName;
    }

    public void setRepName(String repName) {
        this.repName = repName;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", repName='" + repName + '\'' +
                ", phNumber='" + phNumber + '\'' +
                '}';
    }
}
