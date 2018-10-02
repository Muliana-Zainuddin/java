import java.util.Scanner;

public class tipedatalong {
	
	public static void main(String[] args) {
		//deklarasi variabel
		long l6;
		long l7;
		long l8;
		//inisialisasi value
		l6 = 110000000;
		l7 = 250000000;
		//operasi variabel
		l8 = (long)(l7-9500000);
		//menampilkan hasil
		System.out.println("L1 : " + l6);
		System.out.println("L2 : " + l7);
		System.out.println("L3 : " + l8);
		//mengambil infut dari keyboard
		long l9;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Tambahkan data Long : ");
		l9 = keyboard.nextLong();
		System.out.println("Data tambahan-----");
		System.out.println("L4 : " + l9);
		
		
	}
	
}

