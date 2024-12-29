/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobil;

/**
 *
 * @author GF
 */
public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobildendi = new Mobil();
        
        mobildendi.warna = "putih";
        mobildendi.tahunProduksi = 1970;
        
        System.out.println("warna: " + mobildendi.warna);
        System.out.println("tahunProduksi " + mobildendi.tahunProduksi);
    }
    
}
