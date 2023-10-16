/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelasa.week4;

import javax.swing.JButton;
import javax.swing.JDialog;

/**
 *
 * @author LABKOM
 */
public class NewClass {
    
    
    public static void main(String[] args) {
//        int $inT;
        double d = Math.pow(5, 2);
        System.out.println(d);
        double e = luas_segitiga(1, 1);
        
        //Data Types
        Integer a = 1;
        int b;
        int c = a.intValue();
        JDialog d2;
        String s;
        JButton b2;
        
        //casting
        int a2 = 1;
        byte b3 = (byte) a2;
        
    }
    
    /**
     * 
     * @param a <b>nilai alas</b>
     * @param t nilai tinggi
     * @return hasil perhitungan luas segitiga
     */
    static double luas_segitiga(double a, double t){
        return 0.5 * a * t;
    }
}
