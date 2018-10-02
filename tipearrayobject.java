import java.util.Scanner;


public class tipearrayobject {

	 static void main(String[] args) {
		//DEKLARASI VARIABEL
			Object[] fruit= new Object[2];
			//INISIALISASI VALUE
			fruit[0] = "watermelon";
			fruit[1] = "papaya";
			//MENAMPILKAN HASIL
			System.out.println("jenis buah saya : " + fruit[0]);
			System.out.println("jenis buah saya : " + fruit[1]);
			//MENGAMBIL IMPUT DARI KEYBOARD
			Object[] afruit1= new Object[2];
			Scanner keyboard = new Scanner(System.in);
			System.out.println("masukkan nama semangka :");
			String[] fruit1 = null;
			fruit1[0] = keyboard.next();
			System.out.println("masukan nama pepaya :");
			fruit1[1] = keyboard.next();
			System.out.println("nama semangka saya : " + fruit1[0]);
			System.out.println("nama pepaya saya : " + fruit1[1]);


	}

}
