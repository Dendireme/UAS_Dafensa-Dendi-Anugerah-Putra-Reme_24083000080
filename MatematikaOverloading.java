/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadingMatematika;

/**
 *
 * @author GF
 */
public class MatematikaOverloading {
        public int pertambahan(int a, int b) {
        return a + b;
    }

    
    public double pertambahan(double a, double b) {
        return a + b;
    }

   
    public double pertambahan(double a, double b, double c) {
        return a + b + c;
    }

    
    public int pertambahan(int a, int b, int c) {
        return a + b + c;
    }

   
    public int pengurangan(int a, int b) {
        return a - b;
    }

    
    public double pengurangan(double a, double b) {
        return a - b;
    }

    
    public int perkalian(int a, int b) {
        return a * b;
    }

    
    public double perkalian(double a, double b) {
        return a * b;
    }

    
    public int pembagian(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan");
        }
    }

    
    public double pembagian(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan");
        }
    }

    
    public int modulus(int a, int b) {
        return a % b;
    }

    
    public double modulus(double a, double b) {
        return a % b;
    }
}
