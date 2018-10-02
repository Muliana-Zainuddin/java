import java.util.Scanner;


public class tipearraystring {

	public static void main(String[] args) {
		//DEKLARASI VARIABEL
		String[] mahasiswa = new String[6];
		//INISIALISASI VALUE
		mahasiswa[0] = "muliana";
		mahasiswa[1] = "nadra";
		mahasiswa[2] = "muhammad mohar";
		mahasiswa[3] = "nilasari";
		mahasiswa[4] = "faeruddin";
		mahasiswa[5] = "rosalina konde";
		//OPERASI VARIABEL
		System.out.println("DAFTAR NIM____");
		String[] nim = {"D0217323","D0217512","D0217321","D0217322","D0217325","D0217012"};
		for (String element: nim) {System.out.println(element);}
		//MENAMPILKAN HASIL
		System.out.println("PEMILIK NIM______");
		for(int i=0;i<mahasiswa.length;i++){System.out.println((mahasiswa[i]));};
		//MENGAMBIL INPUT DARI KEYBOARD
	    String[] mahasiswa_tambahan = new String[5];
	    Scanner keyboard = new Scanner(System.in);
	    for( int i = 0; i < mahasiswa_tambahan.length; i++ )
	    {System.out.print(i);
	    mahasiswa_tambahan[i] = keyboard.nextLine();}
	    System.out.println("--mahasiswa tambahan--");
	    for(int i=0;i<mahasiswa_tambahan.length;i++){System.out.println(mahasiswa_tambahan[i]);};


	}

}
