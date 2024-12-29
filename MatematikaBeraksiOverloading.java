/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadingMatematika;

/**
 *
 * @author GF
 */
public class MatematikaBeraksiOverloading {
     public static void main(String[] args) {
        MatematikaCanggihOverloading matematika = new MatematikaCanggihOverloading();

        
        System.out.println("Uji Pertambahan:");
        
        
        System.out.println("pertambahan(12.5, 28.7, 14.2) = " + 
            matematika.pertambahan(12.5, 28.7, 14.2));
        
        
        System.out.println("pertambahan(12, 28, 14) = " + 
            matematika.pertambahan(12, 28, 14));
        
        
        System.out.println("pertambahan(23, 34) = " + 
            matematika.pertambahan(23, 34));
        
        
        System.out.println("pertambahan(3.4, 4.9) = " + 
            matematika.pertambahan(3.4, 4.9));

        
        System.out.println("\nUji Pengurangan:");
        System.out.println("pengurangan(20, 10) = " + 
            matematika.pengurangan(20, 10));
        System.out.println("pengurangan(20.5, 10.2) = " + 
            matematika.pengurangan(20.5, 10.2));

        
        System.out.println("\nUji Perkalian:");
        System.out.println("perkalian(5, 4) = " + 
            matematika.perkalian(5, 4));
        System.out.println("perkalian(2.5, 4.0) = " + 
            matematika.perkalian(2.5, 4.0));

        
        System.out.println("\nUji Pembagian:");
        System.out.println("pembagian(20, 4) = " + 
            matematika.pembagian(20, 4));
        System.out.println("pembagian(20.0, 4.0) = " + 
            matematika.pembagian(20.0, 4.0));

        
        System.out.println("\nUji Modulus:");
        System.out.println("modulus(20, 3) = " + 
            matematika.modulus(20, 3));
        System.out.println("modulus(20.5, 3.2) = " + 
            matematika.modulus(20.5, 3.2));
    }
}
