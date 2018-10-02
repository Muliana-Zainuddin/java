import java.util.Scanner;

public class tipedatafloat {

	public static void main(String[] args) {
		// deklarasi variabel
		float  lebar;
		float tinggi;
	    //inisialisasi value
		lebar = (float) 4.25;
		tinggi = (float) 8.14;
		//mengambil variabel dari input keyboard
		float panjang;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Masukan Nilai Panjang");
		panjang = keyboard.nextFloat();
		System.out.println("Panjang : " + panjang);
		//operasi variabel
		float luas = panjang * lebar * tinggi;
	    //menampilkan nilai variabel
		System.out.println("Mencari Nilai Luas");
		System.out.println("Panjang : " + panjang);
		System.out.println("Lebar : " + lebar);
		System.out.println("Tinggi : " + tinggi);
		System.out.println("Luas : " + luas);
		
	}

}
