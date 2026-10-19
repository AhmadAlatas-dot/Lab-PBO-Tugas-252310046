package Tugas_Bab_1;

import java.util.Scanner;

public class Latihan05_MengubahHurufMenjadiHurufBesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        String hasil = kalimat.toUpperCase();

        System.out.println("Hasil huruf besar: " + hasil);

        input.close();
        }
}
