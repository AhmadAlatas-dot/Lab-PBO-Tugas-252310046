package Latihan;

import javax.swing.JOptionPane;

public class Latihan02_Biodata {
    public static void main(String[] args) {
        Biodata bio = new Biodata();

        String fullname = JOptionPane.showInputDialog("Masukkan Fullname");
        String usia = JOptionPane.showInputDialog("Masukkan Usia");
        String alamat = JOptionPane.showInputDialog("Masukkan Alamat");

        bio.setFullname(fullname);
        bio.setUsia(usia);
        bio.setAlamat(alamat);

        JOptionPane.showMessageDialog(null,
                "Fullname : " + bio.getFullname() + "\n"
                + "Usia     : " + bio.getUsia() + "\n"
                + "Alamat   : " + bio.getAlamat());
    }
}