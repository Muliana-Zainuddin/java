import java.util.Scanner;


public class tipedatainteger {

	public static void main(String[] args) {
		// deklarasi variabel
		int d;
		int e;
		int f;
		//inisialisasi value
		d = 14;
		e = 10;
		f = 8;
		//operasi variabel
		int g = d - f * 4 + e / 2;
		//menampilkan nilai variabel
		System.out.println("===Nilai Variabel===");
		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
		System.out.println("g : " + g);
		//mengambil variabel dari input keyboard
		int h;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Masukkan bilangan untuk menambah variabel : ");
		h = keyboard.nextInt();
		System.out.println("h : " + h);

	}

}
