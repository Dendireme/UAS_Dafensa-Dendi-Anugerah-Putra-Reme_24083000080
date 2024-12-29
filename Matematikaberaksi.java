/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author GF
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika math = new Matematika();

        int a1 = 20, b1 = 20;
        System.out.println("Pertambahan: " + a1 + " + " + b1 + " = " + math.pertambahan(a1, b1));

        int a2 = 10, b2 = 5;
        System.out.println("Pengurangan: " + a2 + " - " + b2 + " = " + math.pengurangan(a2, b2));

        int a3 = 10, b3 = 20;
        System.out.println("Perkalian: " + a3 + " * " + b3 + " = " + math.perkalian(a3, b3));

        int a4 = 21, b4 = 2;
        System.out.println("Pembagian: " + a4 + " / " + b4 + " = " + math.pembagian(a4, b4));
    }
}
