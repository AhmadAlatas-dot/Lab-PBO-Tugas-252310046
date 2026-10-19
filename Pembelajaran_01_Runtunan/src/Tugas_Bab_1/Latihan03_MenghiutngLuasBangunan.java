package Tugas_Bab_1;

import java.util.Scanner;

public class Latihan03_MenghiutngLuasBangunan {

	    static double luas;
	    static double keliling;
	    static double volume;

	    static void hitungLayangLayang(double d1, double d2, double sisiA, double sisiB) {
	        luas = d1 * d2 / 2;
	        keliling = 2 * (sisiA + sisiB);
	    }

	    static double hitungVolumePrisma(double alas, double tinggiSegitiga, double tinggiPrisma) {
	        double luasAlas = alas * tinggiSegitiga / 2; // local variable
	        return luasAlas * tinggiPrisma;
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("=== LAYANG-LAYANG ===");
	        System.out.print("Diagonal 1 : ");
	        double d1 = input.nextDouble();
	        System.out.print("Diagonal 2 : ");
	        double d2 = input.nextDouble();
	        System.out.print("Sisi A     : ");
	        double a = input.nextDouble();
	        System.out.print("Sisi B     : ");
	        double b = input.nextDouble();

	        hitungLayangLayang(d1, d2, a, b);
	        System.out.println("Luas     : " + luas);
	        System.out.println("Keliling : " + keliling);

	        System.out.println();
	        System.out.println("=== PRISMA SEGITIGA ===");
	        System.out.print("Alas segitiga      : ");
	        double alas = input.nextDouble();
	        System.out.print("Tinggi segitiga    : ");
	        double tSegitiga = input.nextDouble();
	        System.out.print("Tinggi prisma      : ");
	        double tPrisma = input.nextDouble();

	        volume = hitungVolumePrisma(alas, tSegitiga, tPrisma);
	        System.out.println("Volume : " + volume);
	        input.close();
	        }
}
