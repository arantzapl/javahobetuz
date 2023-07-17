import java.util.Scanner;

public class EstructuraSecuencial1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Dime un número entero: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Dime otro número entero: ");
		int numero2 = sc.nextInt();
		System.out.println("Los números elegidos son: " + numero1 +" y " + numero2);
		
		sc.close();
	}
}
