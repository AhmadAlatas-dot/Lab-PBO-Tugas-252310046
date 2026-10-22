package Latihan;

	import javax.swing.JOptionPane;

	public class Latihan04_ValidasiKonfirmasi {

	    static boolean konfirmasiKeluar() {
	        int pilih = JOptionPane.showConfirmDialog(null,
	                "Apakah anda ingin keluar ?",
	                "Konfirmasi", JOptionPane.YES_NO_OPTION);
	        return pilih == JOptionPane.YES_OPTION;
	    }

	    public static void main(String[] args) {
	        Biodata bio = new Biodata();
	        boolean selesai = false;

	        while (!selesai) {
	            String fullname;
	            String usia;
	            String alamat;

	            while (true) {
	                fullname = JOptionPane.showInputDialog("Masukkan Fullname");

	                if (fullname == null) {
	                    if (konfirmasiKeluar()) {
	                        System.exit(0);
	                    }
	                   
	                } 
	                else if (fullname.trim().equals("")) {
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

	                if (usia == null) {
	                    if (konfirmasiKeluar()) {
	                        System.exit(0);
	                    }
	                } 
	                else if (usia.trim().equals("")) {
	                    JOptionPane.showMessageDialog(null,
	                            "Field [usia] tidak boleh kosong",
	                            "Error", JOptionPane.ERROR_MESSAGE);
	                } 
	                else {
	                    try {
	                        Integer.parseInt(usia.trim());
	                        break;
	                    } 
	                    catch (NumberFormatException e) {
	                        JOptionPane.showMessageDialog(null,
	                                "Isian usia harus angka",
	                                "Error", JOptionPane.ERROR_MESSAGE);
	                    }
	                }
	            }
	            
	            while (true) {
	                alamat = JOptionPane.showInputDialog("Masukkan Alamat");

	                if (alamat == null) {
	                    if (konfirmasiKeluar()) {
	                        System.exit(0);
	                    }
	                } 
	                else if (alamat.trim().equals("")) {
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

	            if (konfirmasiKeluar()) {
	                selesai = true;
	                }
	            }
	        }
}
