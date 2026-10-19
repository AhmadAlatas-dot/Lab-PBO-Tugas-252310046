package Tugas_Bab_1;

public class Latihan09_MembuatClassStudents {
	public static void main(String[] args) {
		Students myBio = new Students();
		
		myBio.setNPM(252310046);
		myBio.setFullname("Ahmad SOleh Alatas");
		myBio.setClassName("TI-25-KA");
		myBio.setSemester(3);
		myBio.setGPA(3.90f);
		
		System.out.println("DATA MAHASISWA");
	    System.out.println("NPM      : " + myBio.getNPM());
	    System.out.println("Nama     : " + myBio.getFullname());
	    System.out.println("Kelas    : " + myBio.getClassName());
	    System.out.println("Semester : " + myBio.getSemester());
	    System.out.println("IPK      : " + myBio.getGPA());
	    }
}
