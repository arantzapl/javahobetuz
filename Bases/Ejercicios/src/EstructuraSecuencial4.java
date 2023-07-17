import java.util.Scanner;

public class EstructuraSecuencial4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double gradosC, gradosF;
		
		System.out.println("Escribe grados centígrados: ");
		gradosC = sc.nextDouble();
		
		gradosF = 32 + (9 * gradosC / 5);
		System.out.println("En grados Fahrenheit son: " + gradosF);
		
		sc.close();
	}
}
