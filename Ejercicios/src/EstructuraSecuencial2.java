import java.util.Scanner;

public class EstructuraSecuencial2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cómo te llamas?: ");
		String nombre = sc.nextLine();
		
		System.out.println("Buenos días " + nombre);
		
		sc.close();
		
	}
}
