/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sales;

/**
 *
 * @author Felipe
 */
public class Program  {
    
    public static void main (String[] args) {
        AirConditioningCore a1 = new AirConditioningCore();
        a1.input();
        MicrowaveCore m1 = new MicrowaveCore();
        m1.input();
        FridgeCore f1 = new FridgeCore();
        f1.input();
        
        
    }
}
