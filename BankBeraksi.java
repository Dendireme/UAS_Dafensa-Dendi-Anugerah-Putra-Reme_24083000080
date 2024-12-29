/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author GF
 */
public class BankBeraksi {
    public static void main(String[] args) {
        
        Bank BNI = new Bank(100000);
        
        
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: Rp. " + BNI.getSaldo());

        
        int simpanJumlah = 500000;
        BNI.simpanUang(simpanJumlah);
        System.out.println("\nSimpan uang: Rp. " + simpanJumlah);
        System.out.println("Saldo saat ini: Rp. " + BNI.getSaldo());

        
        int ambilJumlah = 150000;
        BNI.ambilUang(ambilJumlah);
        System.out.println("\nAmbil uang: Rp. " + ambilJumlah);
        System.out.println("Saldo saat ini: Rp. " + BNI.getSaldo());
    }
}

