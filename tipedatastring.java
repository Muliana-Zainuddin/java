import java.util.Scanner;


public class tipedatastring {

	public static void main(String[] args) {
		// deklarasi variabel
		String nim;
		String kelas;
		String prodi;
		//inisialisasi value
		nim = "Do217323";
		kelas = "Teknik Informatika B";
		prodi = "Informatika";
		//operasi variabel
		String namadepan = "Muliana";
		String namabelakang = "Zainuddin";
		//menampilkan hasil
		System.out.println("===Biodata Mahasiswa===");
		System.out.println("Nama : " +(namadepan +' '+ namabelakang));
		System.out.println("Nim : " + nim);
		System.out.println("Kelas : " + kelas);
		System.out.println("Prodi : " + prodi);
		//mengambil infut dari keyboard
		String alamat;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Memasukan Alamat : ");
		alamat = keyboard.next();
		System.out.println("Alamat : " + alamat);
		
		
		
		
		
	}

}
