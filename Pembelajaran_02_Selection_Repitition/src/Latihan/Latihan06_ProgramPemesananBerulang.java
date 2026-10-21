package Latihan;

import java.util.Scanner;

public class Latihan06_ProgramPemesananBerulang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang;

        do {
            System.out.println("\nMenu Sarapan");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Bubur Ayam");
            System.out.println("3. Soto Ayam");

            System.out.print("Pilih menu (1-3) : ");
            int pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.println(
                    "Kamu memesan Nasi Goreng dengan harga Rp22.000,-");
            } 
            else if (pilihan == 2) {
                System.out.println(
                    "Kau memesan Bubur Ayam dengan harga Rp15.000,-");
            } 
            else if (pilihan == 3) {
                System.out.println(
                    "Kamu memesan Soto Ayam dengan harga Rp25.000,-");
            } 
            else {
                System.out.println(
                    "Maaf menu yang kamu masukkan salah.");
            }

            System.out.print("Apakah kamu akan memesan kembali? (Ya/Tidak): ");
            ulang = input.next();

        } 
        while (ulang.equalsIgnoreCase("Ya"));

        System.out.println("Terimakasih telah memesan disini :) ");

        input.close();
    }
}