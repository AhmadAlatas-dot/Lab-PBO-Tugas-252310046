package Tugas_Bab_1;

	import java.util.Scanner;

	public class Latihan01_KonfersiSuhu {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Masukkan suhu Celsius: ");
	        double celsius = input.nextDouble();

	        double fahrenheit = (celsius * 9 / 5) + 32;
	        double reamur = celsius * 4 / 5;
	        double kelvin = celsius + 273.15;

	        System.out.println("Fahrenheit = " + fahrenheit);
	        System.out.println("Reamur = " + reamur);
	        System.out.println("Kelvin = " + kelvin);

	        input.close();
	        }
}
