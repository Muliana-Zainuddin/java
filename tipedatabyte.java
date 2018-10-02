import java.util.Scanner;


public class tipedatabyte {

	public static void main(String[] args) {
	// deklarasi variabel
	byte m1;
	byte m2;
	byte m3;
	//inisialisasi value
	m1 = 80;
	m2 = 40;
	//operasi variabel
	m3 = (byte) (m1 - 50);
	//menampilkan nilai variabel
	System.out.println("m1 : " + m1);
	System.out.println("m2 : " + m2);
	System.out.println("m3 : " + m3);
	//mengambil variabel dari input keyboard
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Tambahan Data : ");
	byte m4 = keyboard.nextByte();
	System.out.println("m4 : " + m4);
	}
	
}
