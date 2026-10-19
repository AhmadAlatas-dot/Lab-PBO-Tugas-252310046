package Tugas_Bab_1;

import java.util.Scanner;

public class Latihan07_MengubahHurufVokalMenjadiX {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Masukkan nama lengkap : ");
	        String nama = input.nextLine();

	        String hasil = nama.replaceAll("[aiueoAIUEO]", "X");
	        System.out.println("Hasil : " + hasil);
	        input.close();
	        }
}