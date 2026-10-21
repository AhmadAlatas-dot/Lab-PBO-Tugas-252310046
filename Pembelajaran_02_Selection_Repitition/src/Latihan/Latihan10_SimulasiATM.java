package Latihan;

import java.util.Scanner;

public class Latihan10_SimulasiATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long npm;
        long pin;
        long saldo = 500000;
        long nominal;
        int pilihan;
        String ulang;

        System.out.print("Masukkan NPM : ");
        npm = input.nextLong();

        System.out.print("Masukkan PIN : ");
        pin = input.nextLong();

        if (pin == npm) {
            System.out.println("PIN benar :)");

            do {
                System.out.println("\nMenu ATM");
                System.out.println("1. Lihat Saldo");
                System.out.println("2. Setor Tunai");
                System.out.println("3. Tarik Tunai");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu : ");

                pilihan = input.nextInt();

                if (pilihan == 1) {
                    System.out.println("Saldo Anda: Rp. " + saldo);

                } else if (pilihan == 2) {
                    System.out.print("Masukkan nominal setor: Rp. ");
                    nominal = input.nextLong();

                    if (nominal > 0) {
                        saldo = saldo + nominal;
                        System.out.println("Setor tunai berhasil :) ");
                        System.out.println("Saldo Anda : Rp" + saldo);
                    } else {
                        System.out.println("Nominal tidak valid :( ");
                    }

                } else if (pilihan == 3) {
                    System.out.print("Masukkan nominal tarik : Rp. ");
                    nominal = input.nextLong();

                    if (nominal > 0 && nominal <= saldo) {
                        saldo = saldo - nominal;
                        System.out.println("Tarik tunai berhasil. Terimakasih :) ");
                        System.out.println("Saldo Anda : Rp. " + saldo);
                    } else {
                        System.out.println("Saldo tidak cukup atau nominal salah :( ");
                    }

                } else if (pilihan == 4) {
                    System.out.println("Terima kasih telah menggunakan ATM :) ");

                } else {
                    System.out.println("Pilihan menu tidak tersedia :( ");
                }

                if (pilihan != 4) {
                    System.out.print("Kembali ke menu? (y/n) : ");
                    ulang = input.next();
                } else {
                    ulang = "n";
                }

            } while (ulang.equalsIgnoreCase("y"));

            System.out.println("Program ATM selesai :) ");

        } else {
            System.out.println("PIN salah. Silahkan masukkan kembali PIN anda !");
        }

        input.close();
    }
}
