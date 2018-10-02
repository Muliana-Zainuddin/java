import java.util.Scanner;


public class tipedatashort {

	public static void main(String[] args) {
		//DEKLARASI VARIABEL
		short r;
		short s;
		short t;
		//INISIALISASI VALUE
		r = 200;
		s = 250;
		//OPERASI VARIABEL
		t = (short)(r+s);
		//MENAMPILKAN HASIL
		System.out.println("r : " + r);
		System.out.println("s : " + s);
		System.out.println("t : " + t);
		//MENGAMBIL InPUT DARI KEYBOARD
		Scanner keyboard = new Scanner(System.in);
		System.out.println("tambahkan data");
		float u;
		u = keyboard.nextShort();
		System.out.println("u :" + u);


	}

}
