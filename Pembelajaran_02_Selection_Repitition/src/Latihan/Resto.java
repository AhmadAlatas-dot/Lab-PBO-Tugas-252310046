package Latihan;

import java.util.Scanner;

public class Resto {
    private long Harga;

    public void chooseMenu() {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu Sarapan");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bubur Ayam");
        System.out.println("3. Soto Ayam");

        System.out.print("Pilih menu (1-3) : ");
        int pilihan = input.nextInt();

        getPrices(pilihan);

        if (pilihan == 1) {
            System.out.println("Kamu memesan Nasi Goreng");
        } 
        else if (pilihan == 2) {
            System.out.println("Kamu memesan Bubur Ayam");
        } 
        else if (pilihan == 3) {
            System.out.println("Kamu memesan Soto Ayam");
        } 
        else {
            System.out.println("Maaf menu yang kamu masukkan salah :(");
        }

        System.out.println("Harga : Rp" + Harga + ",-");
        input.close();
    }

    private long getPrices(int pilihan) {
        if (pilihan == 1) {
            Harga = 22000;
        } 
        else if (pilihan == 2) {
            Harga = 15000;
        } 
        else if (pilihan == 3) {
            Harga = 25000;
        } 
        else {
            Harga = 0;
        }

        return Harga;
    }
}
