import java.util.Scanner;

public class EstructuraSecuencial3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1;
		
		System.out.println("Dime un número: ");
		n1 = sc.nextInt();
		
		System.out.println("El número es: " + n1);
		System.out.println("El doble del número " + n1 + " es: " + n1 * 2);
		System.out.println("El triple del número " + n1 + " es: " + n1 * 3);
		
		sc.close();
	}
}
