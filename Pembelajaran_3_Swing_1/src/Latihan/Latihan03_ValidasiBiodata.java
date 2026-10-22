package Latihan;

import javax.swing.JOptionPane;

public class Latihan03_ValidasiBiodata {
    public static void main(String[] args) {
        Biodata bio = new Biodata();
        String fullname;
        String usia;
        String alamat;

        while (true) {
            fullname = JOptionPane.showInputDialog("Masukkan Fullname");

            if (fullname == null || fullname.trim().equals("")) {
                JOptionPane.showMessageDialog(null,
                        "Field [fullname] tidak boleh kosong",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } 
            else {
                break;
            }
        }

        while (true) {
            usia = JOptionPane.showInputDialog("Masukkan Usia");

            if (usia == null || usia.trim().equals("")) {
                JOptionPane.showMessageDialog(null,
                        "Field [usia] tidak boleh kosong",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } 
            else {
                try {
                    Integer.parseInt(usia.trim());
                    break; // kalau angka, keluar dari loop
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,
                            "Isian usia harus angka",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        while (true) {
            alamat = JOptionPane.showInputDialog("Masukkan Alamat");

            if (alamat == null || alamat.trim().equals("")) {
                JOptionPane.showMessageDialog(null,
                        "Field [alamat] tidak boleh kosong",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } 
            else if (alamat.trim().length() < 10) {
                JOptionPane.showMessageDialog(null,
                        "Masukan alamat minimum 10 karakter",
                        "Warning", JOptionPane.WARNING_MESSAGE);
            } 
            else {
                break;
            }
        }

        bio.setFullname(fullname.trim());
        bio.setUsia(usia.trim());
        bio.setAlamat(alamat.trim());

        JOptionPane.showMessageDialog(null,
                "Fullname : " + bio.getFullname() + "\n"
                + "Usia     : " + bio.getUsia() + "\n"
                + "Alamat   : " + bio.getAlamat(),
                "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }
}