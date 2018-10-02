import java.util.Scanner;


public class tipedatadouble {

	public static void main(String[] args) {
		// deklarasi variabel
		double m;
		double n;
		//inisialisasi value
		m = 14.422;
		n = 10.5;
		//operasi variabel
		double o = m + n;
		//menampilkan nilai
		System.out.println("===operasi matematika");
		System.out.println(" M : " + m);
		System.out.println(" N : " + n);
		System.out.println(" O : " + o);
		//mengambil input dari keyboard
		double p;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Tambahkan angka Desimal : ");
		p = keyboard.nextDouble();
		System.out.println();
		p = keyboard.nextDouble();
		System.out.println(" P : " + p);
		
		

	}

}
