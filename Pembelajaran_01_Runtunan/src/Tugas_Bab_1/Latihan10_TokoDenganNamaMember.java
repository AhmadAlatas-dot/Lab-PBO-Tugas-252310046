package Tugas_Bab_1;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Latihan10_TokoDenganNamaMember {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaBarang = "ROTI ENAK";
        int harga = 6300;

        System.out.print("Masukkan nama member: ");
        String member = input.nextLine();

        System.out.print("Masukkan jumlah produk: ");
        int jumlah = input.nextInt();

        int total = harga * jumlah;
        double diskon = total * 0.10;
        double subTotal = total - diskon;

        LocalDateTime waktu = LocalDateTime.now();
        DateTimeFormatter format =
        		DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");

        System.out.println("==================================");
        System.out.println("      TOKO SERBAGUNA IBIK");
        System.out.println("==================================");
        System.out.println(waktu.format(format));
        System.out.println("ITEM       QTY    HARGA    TOTAL");
        System.out.println("----------------------------------");
        System.out.println(namaBarang + "    " + jumlah
                + "    Rp " + harga + "    Rp " + total);
        System.out.println("----------------------------------");
        System.out.println("Diskon 10% : Rp " + diskon);
        System.out.println("Sub Total  : Rp " + subTotal);
        System.out.println("Member Name: " + member);

        input.close();
        }

}
