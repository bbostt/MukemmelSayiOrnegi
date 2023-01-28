import java.util.Scanner;
public class MukemmelSayiOrnegi {

	public static void main(String[] args) {
		// Bir sayýnýn kendisi hariç pozitif tam sayý çarpanlarý (kalansýz bölen sayýlarýn) toplamý kendisine eþit olan sayýya mükemmel sayý denir.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayý giriniz : ");
		int number = scan.nextInt();
		
		int total = 0;
		
		for(int i=1; i<number; i++) {
			if(number % i == 0) {
				total = total + i;
			}
		}
		
		System.out.println("Toplam : "+total);
		
		if(total == number) {
			System.out.println(number+" mükemmel sayýdýr !");
		}
		else {
			System.out.println(number+" mükemmel sayý deðildir !");
		}

	}

}
