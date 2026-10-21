package Latihan;

import java.util.Scanner;

public class Latihan02_NpmPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM : ");
        int npm = input.nextInt();

        boolean prima = true;

        if (npm <= 1) {
            prima = false;
        } 
        else {
            for (int i = 2; i <= Math.sqrt(npm); i++) {
                if (npm % i == 0) {
                    prima = false;
                    break;
                }
            }
        }

        if (prima) {
            System.out.println("Bilangan Prima");
        } 
        else {
            System.out.println("Bukan termasuk bilangan prima");
        }

        input.close();
        }
}

