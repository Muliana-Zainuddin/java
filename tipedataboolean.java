import java.util.Scanner;

public class tipedataboolean {
	
	public static void main(String[] args) {
		// deklarasi variabel
		int a;
		int b;
		//inisialisasi variabel
		a = 5;
		b = 8;
		//operasi variabel AND & OR
		boolean test_and = false;
		boolean test_or = false;
		test_and = (a < 8) && (b++ < 7);
		test_or = (a < 8) || (b++ < 7);
		//menamilkan variabel dan test
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("LOGIKA AND : " + test_and);
		System.out.println("LOGIKA OR : " + test_or);
		//mendapatkan input dari keyboard
		int c;
		boolean and = false;
		boolean or = false;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Masukan Nilai Variabel");
		System.out.println("c : ");
		c = keyboard.nextInt();
		and = (c < 8) && (b++ < c);
		or = (c < 8) || (b++ < c);
		System.out.println("C : " + c);
		System.out.println("Logika AND : " + and);
		System.out.println("Logika OR : " + or);
		

	}

}