import java.util.Scanner;


public class tipedataobject {

	public static void main(String[] args) {
		//DEKLARASI VARIABEL
				Object watermelon = new Object();
				Object papaya = new Object();
				//INISIALISASI VALUE
				watermelon = "semangka";
				papaya = "pepaya";
				//MENAMPILKAN HASIL
				System.out.println("nama semangka saya : " + watermelon);
				System.out.println("nama pepaya saya : " + papaya);
				//MENDAPATKAN INPUT DARI KEYBOARD
				Object apple = new Object();
				Scanner keyboard = new Scanner(System.in);
				System.out.println("masukkan nama apple :");
				apple = keyboard.next();
				System.out.println("Nama apple saya : " + apple);


	}

}
