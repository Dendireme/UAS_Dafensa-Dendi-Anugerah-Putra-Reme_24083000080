/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatematikaInheritance;

/**
 *
 * @author GF
 */
public class MatematikaCanggihBeraksiInheritance {
     public static void main(String[] args) {
        
        MatematikaCanggihInheritance mathCanggih = new MatematikaCanggihInheritance();

        
        int a1 = 35, b1 = 25;
        System.out.println("Pertambahan: " + a1 + " + " + b1 + " = " + mathCanggih.pertambahan(a1, b1));
        
        int a2 = 20, b2 = 15;
        System.out.println("Perkalian: " + a2 + " * " + b2 + " = " + mathCanggih.perkalian(a2, b2));

       
        int a3 = 70, b3 = 4;
        System.out.println("Modulus: " + a3 + " % " + b3 + " = " + mathCanggih.modulus(a3, b3));
    }
}
