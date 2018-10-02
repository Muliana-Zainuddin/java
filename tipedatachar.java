import java.util.Scanner;

public class tipedatachar {
	
	public static void main(String[] args) {

	//deklarasi variabel
	int nilai,nilai_2,nilai_3;
	char nilai1= 'D';
	char nilai2= 'E';
	//inisialisasi value
	nilai = 40;
	nilai_2 = 80;
	//operasi variabel
	nilai_3 = 80-40;
	//menampilkan hasil
	if(nilai >= 60){System.out.println("nilai 1: " + nilai1);}
	else{System.out.println("nilai 1: " + nilai2);}
	if(nilai_2 >= 60){System.out.println("nilai 2: " + nilai1);}
	else{System.out.println("nilai 2: " + nilai2);}
	if(nilai_3 >= 60){System.out.println("nilai 3: " + nilai1);}
	else{System.out.println("nilai 3: " + nilai2);}
	System.out.println("--karena--");
	System.out.println("nilai 1 : " + nilai);
	System.out.println("nilai 2 : " + nilai_2);
	System.out.println("nilai 3 : " + nilai_3);
	//mengambil infut dari keyboard
	int F;
	Scanner keyboard = new Scanner(System.in);
	System.out.print("masukkan nilai anda : ");
	F = keyboard.nextInt();
	if(F>=60){System.out.println("selamat nilai anda: " + nilai1);}
	else{System.out.println("selamat nilai anda: " + nilai2);} 
	
	}
	
	
}
