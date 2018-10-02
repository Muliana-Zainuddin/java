import java.util.Scanner;


public class tipearraydouble {

	
	public static void main(String[] args) {
		//DEKLARASI VARIABEL
		double[] data = new double[4];
		//INISIALISASI VALUE
		data[0]= 11.675;
		data[1]= 5.33;
		data[2]= 8.73;
		data[3]= 4.34;
		//OPERASI VARIABEL
		double V = data[0] + data[1];
		//MENAMPILKAN NILAI
		System.out.println("---- operasi matematika------");
		System.out.println(" R : " + data[0]);
		System.out.println(" S : " + data[1]);
		System.out.println(" T : " + data[2]);
		System.out.println(" U : " + data[3]);
		System.out.println(" V : " + V);
		//MENGAMBIL IMPUT DARI KEYBOARD	
		double[] data2= new double[2];
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Tambahkan angka Desimal : ");


	}

}
