import java.util.Scanner;

public class Repetitivas {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int c = 1;
		
		while (c<=10) {
			System.out.print(c + " ");
			c++;
		}
		System.out.println("FIN");
		
		String sn;
		
		do {			
			System.out.println("¿Quieres repetir? (S/N)");
			sn = sc.nextLine();
		} while (sn.equals("s"));
		
		System.out.println("Se acabó");
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		sc.close();
	}
}
