/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatematikaInheritance2;

/**
 *
 * @author GF
 */
public class MatematikaCanggihBangetBeraksiInternance2 {
    public static void main(String[] args) {
        MatematikaCanggihBangetInternance2 matCanggihBanget = new MatematikaCanggihBangetInternance2();

        
        int a = 40, b = 30, c = 5;

        
        System.out.println("Pertambahan: " + a + " + " + b + " = " + matCanggihBanget.pertambahan(a, b));

        
        System.out.println("Perkalian: " + a + " * " + b + " = " + matCanggihBanget.perkalian(a, b));

        
        System.out.println("Modulus: " + a + " % " + b + " = " + matCanggihBanget.modulus(a, b));

        
        System.out.println("Pertambahan Tiga: " + a + " + " + b + " + " + c + " = " + matCanggihBanget.pertambahanTiga(a, b, c));
    }
}
