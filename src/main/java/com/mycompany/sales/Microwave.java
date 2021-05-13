/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sales;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public abstract class Microwave implements InsuranceTotal {

    private double price;
    private String color;
    private String model;
    private int minPower, maxPower;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMinPower() {
        return minPower;
    }

    public void setMinPower(int minPower) {
        this.minPower = minPower;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public Microwave() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void input() {
        Scanner ent = new Scanner(System.in);
        System.out.println("What Micro Wave version you want? : ");
        setModel(ent.nextLine());
        System.out.println("What color  you need ? :");
        setColor(ent.nextLine());
        System.out.println("How much ? : ");
        setPrice(ent.nextDouble());
        System.out.println("What is the max power you need ? :");
        setMaxPower(ent.nextInt());
        System.out.println("What is the minimum power you need ? :");
        setMinPower(ent.nextInt());
        InsuranceRules();

    }

    public void InsuranceRules() {
        System.out.println("\n---------------------------------------");
        System.out.println("\nThe Total Insurance value is based on the division of the maximum power"
                + "\nof the microwave and the price" + "\nthe result would be convert in total months");
        System.out.println("\n--------------------------------");
        ResumeofCon();
    }

    @Override
    public void Insurance() {
        double value;
        value = maxPower / price;
        int conversion = (int) value;
        System.out.println("\n///////////////////////");
        System.out.println("\nyour total months of insurance is  : " + conversion);
        System.out.println("\n///////////////////////");

    }

    public void ResumeofCon() {
        System.out.println("Resume of your product");
        System.out.println("\nModel Version : " + getModel());
        System.out.println("\nColor :  " + getColor());
        System.out.println("\nMax Power : " + getMaxPower());
        System.out.println("\nMin Power : " + getMinPower());
        System.out.println("\nThe Price is  : " + getPrice());
        Insurance();
    }
}
