package Latihan;

import java.util.Scanner;

public class Latihan04_MencaraiFaktorBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM : ");
        long npm = input.nextLong();

        System.out.print("Masukkan bilangan faktor (minimal 20): ");
        int angka = input.nextInt();

        if (angka < 20) {
            System.out.println("Angka tidak boleh kurang dari 20.");
        } 
        else {
            if (npm % 2 == 0) {
                System.out.print("ASC: Faktor " + angka + " adalah ");

                for (int i = 1; i <= angka; i++) {
                    if (angka % i == 0) {
                        System.out.print(i + " ");
                    }
                }
            } 
            else {
                System.out.print("DESC: Faktor " + angka + " adalah ");

                for (int i = angka; i >= 1; i--) {
                    if (angka % i == 0) {
                        System.out.print(i + " ");
                    }
                }
            }
        }

        input.close();
    }
}

