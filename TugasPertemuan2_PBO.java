/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Tugas;

import java.util.Scanner;
public class TugasPertemuan2_PBO{
    public static void main(String[] args){
        
        //soal 1
        System.out.println("..........(Soal Nomer 1)..........");
        System.out.println("Buatlah algoritma dalam bahasa Java, yang menerima inputan tiga buah masukan");
        System.out.println("pecahan negatif dan menampilkan hasil operasi (+,-,*,/) ketiga bilangan!");
        System.out.println();
        Scanner inputSatu = new Scanner(System.in);
        
        System.out.println("Input");
        System.out.print("Masukan Angka Pertama: ");
        float oneInput = inputSatu.nextFloat(); 
        System.out.print("Masukan Angka Ke dua: ");
        float twoInput = inputSatu.nextFloat();
        System.out.print("Masukan Angka Ke Tiga: ");
        float threeInput = inputSatu.nextFloat();
        
        float penjumlahan = oneInput + twoInput + threeInput;
        float pengurangan = oneInput - twoInput - threeInput;
        float perkalian = oneInput * twoInput * threeInput;
        float pembagian = oneInput / twoInput / threeInput;
        
        System.out.println("Output");
        System.out.println("Hasil dari Penjumlahan :" + penjumlahan);
        System.out.println("Hasil dari Pengurangan :" + pengurangan);
        System.out.println("Hasil dari Perkalian :" + perkalian);
        System.out.println("Hasil dari Pembagian :" + pembagian);
       
        
        System.out.println();
    //Soal 2        
        System.out.println("..........(Soal Nomer 2)..........");
        System.out.println("Buatlah algoritma dalam Bahasa Java Anda akan nikah jika uang tabungan > 100jt dan");
        System.out.println("sudah punya calon pasangan, yang dapat ditulis sebagai ekspresi: (tabungan > 100jt)&&(calonPasangan) ");
        System.out.println();
        
        Scanner inputDua= new Scanner(System.in);
        
        System.out.println("Input");
        System.out.print("Masukan Jumlah Tabungan Anda (dalam juta): ");
        double tabunganAnda = inputDua.nextDouble();
        System.out.print("Apakah Anda Sudah Memiliki Pasangan(True/False): ");
        boolean calonPasangan = inputDua.nextBoolean();
        String hasil = (tabunganAnda > 100 && calonPasangan) 
                        ?"Selamat! Anda siap untuk menikah." 
                        :"Maaf, Anda belum siap untuk menikah.";
        System.out.println("Output");
        System.out.println(hasil);
        
        System.out.println();
        //Soal 3
        System.out.println("..........(Soal Nomer 3)..........");
        System.out.println("Buatlah algoritma dalam bahasa Java, menjumlahkan kode ASCII dari karakter X dan");
        System.out.println("karakter y !");
        System.out.println();
        
        char char1 = 'X';
        char char2 = 'y';
        int ascii1 = (int) char1;
        int ascii2 = (int) char2;
        int sum = ascii1 + ascii2;

        System.out.println("Output"); 
        System.out.println("Output");  
        System.out.println("Kode ASCII dari '" + char1 + "' adalah: " + ascii1);
        System.out.println("Kode ASCII dari '" + char2 + "' adalah: " + ascii2);
        System.out.println("Jumlah kode ASCII: " + sum);
    }
}
