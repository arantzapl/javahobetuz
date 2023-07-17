import java.util.Scanner;

public class EstructuraSecuencial5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String radio, pii = "3.1416";
		
		System.out.println("Escribe el radio de una circunferencia: ");
		radio = sc.nextLine();
		
		double rad = Double.parseDouble(radio);
		double pi = Double.parseDouble(pii);
		
		System.out.println("El radio es: " + rad);
		System.out.println("La longitud es: " + (2 * pi * rad));
		System.out.println("El área es: " + (pi * Math.pow(rad, 2)));
		
		/*double radio, longitud, area;
		
		System.out.println("Escribe el radio de una circunferencia: ");
		radio = sc.nextInt();
		
		longitud = 2 * Math.PI * radio;
		
		area = Math.PI * Math.pow(radio, 2);
		
		System.out.println("La longitud del radio introducido es: " + longitud + " y el area es: " + area);
		*/
		sc.close();
	}
}
