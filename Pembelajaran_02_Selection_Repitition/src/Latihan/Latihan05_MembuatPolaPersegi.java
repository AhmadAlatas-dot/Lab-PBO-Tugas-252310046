
package Latihan;

import java.util.Scanner;

public class Latihan05_MembuatPolaPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM : ");
        long npm = input.nextLong();

        int ukuran = 15;

        if (npm % 2 == 0) {
            int i = 1;

            while (i <= ukuran) {
                int j = 1;

                while (j <= ukuran) {
                    if (i == 1 || i == ukuran ||
                        j == 1 || j == ukuran) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                    j++;
                }

                System.out.println();
                i++;
            }
        } else {
            for (int i = 1; i <= ukuran; i++) {
                for (int j = 1; j <= ukuran; j++) {
                    if (i == 1 || i == ukuran ||
                        j == 1 || j == ukuran) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

                System.out.println();
            }
        }

        input.close();
    }
}
