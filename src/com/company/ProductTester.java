package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductTester {

    public static void main(String[] args) {

        Product p1 = new Product("1", "Ballpoint Pen", 150, 10.00, new Vendor("BIC", "Nõmme 6", "Tom Taylor", "566695"));
        Product p2 = new Product("2", "Scissors", 99, 5.99, new Vendor("BIC", "Nõmme 6", "Tom Taylor", "566695"));
        Product p3 = new Product("3", "Pencil", 450, 2.00, new Vendor("Faber-Castell", "Pirita 24a", "Billie Elliot", "533354"));
        Product p4 = new Product("4", "Glue Stick", 99, 1.99, new Vendor("Pritt", "Männiku 240/2", "Timothy Skylar", "5444032"));
        Product p5 = new Product("5", "Eraser", 578, 0.59, new Vendor("Faber-Castell", "Pirita 24a", "Billie Elliot", "533354"));
        Product p6 = new Printer("6", "Printer", 5, 295.00, "laser", new Vendor("Data Copy", "Postimaja 3", "Jennifer Lawrence", "542342"));

        List<Product> database = new ArrayList<>();
        database.add(p1);
        database.add(p2);
        database.add(p3);
        database.add(p4);
        database.add(p5);
        database.add(p6);

        for (Product p : database) {
            System.out.println(p);
        }


        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the number of the product: ");
        String number = userInput.nextLine();
        System.out.println("Enter the name of the product: ");
        String name = userInput.nextLine();
        System.out.println("Enter the amount of units: ");
        int units = Integer.parseInt(userInput.nextLine());
        System.out.println("Enter the price per unit: ");
        double price = Double.parseDouble(userInput.nextLine());
        System.out.println("------------------------------");
        System.out.println("Enter the name of the vendor: ");
        String vendorName = userInput.nextLine();
        System.out.println("Enter the address of the vendor: ");
        String address = userInput.nextLine();
        System.out.println("Enter the name of the representative: ");
        String repName = userInput.nextLine();
        System.out.println("Enter the phone number of the representative: ");
        String phoneNumber = userInput.nextLine();

        Product p7 = new Product(number, name, units, price, new Vendor(vendorName, address, repName, phoneNumber));
        database.add(p7);

        for (Product p : database) {
            System.out.println(p);
        }















    }
}
