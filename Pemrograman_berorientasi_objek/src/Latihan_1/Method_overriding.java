package Latihan_1;

public class Method_overriding {
	class Hewan {
	    void suara() {
	        System.out.println("Suara hewan");
	    }
	}

	class Kucing extends Hewan {
	    void suara() {
	        System.out.println("Meong");
	    }
	}
}
