import java.util.Scanner;
public class MukemmelSayiOrnegi {

	public static void main(String[] args) {
		// Bir say�n�n kendisi hari� pozitif tam say� �arpanlar� (kalans�z b�len say�lar�n) toplam� kendisine e�it olan say�ya m�kemmel say� denir.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Say� giriniz : ");
		int number = scan.nextInt();
		
		int total = 0;
		
		for(int i=1; i<number; i++) {
			if(number % i == 0) {
				total = total + i;
			}
		}
		
		System.out.println("Toplam : "+total);
		
		if(total == number) {
			System.out.println(number+" m�kemmel say�d�r !");
		}
		else {
			System.out.println(number+" m�kemmel say� de�ildir !");
		}

	}

}
