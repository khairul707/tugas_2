/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author KHAIRUL
 */
public class MatematikaBeraksi {
        public static void main(String[] args) {
        MatematikaCanggih hasil = new MatematikaCanggih();
        
        System.out.println("Hasil Pertambahan = " + hasil.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Hasil Pengurangan = " + hasil.pengurangan(12.5, 28.7, 14.2));
        System.out.println("Hasil Perkalian   = " + hasil.perkalian(12.5, 28.7, 14.2));
        System.out.println("Hasil Pembagian   = " + hasil.pembagian(12.5, 28.7, 14.2));
        System.out.println("Hasil Modulus     = " + hasil.modulus(12.5, 28.7, 14.2));
        System.out.println();
        
        // Pengujian konsep overloading
        System.out.println("Hasil = " + hasil.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Hasil = " + hasil.pertambahan(12, 28, 14));
        System.out.println("Hasil = " + hasil.pertambahan(23, 24));
        System.out.println("Hasil = " + hasil.pertambahan(3.4, 4.9));
    }
}
