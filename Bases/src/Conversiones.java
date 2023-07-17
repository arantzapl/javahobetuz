import java.util.Date;
import java.util.Scanner;

public class Conversiones {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String numeroTexto = "123";
		
		System.out.println(numeroTexto + 4); //El operador + concatena los Strings
		
		int numero = Integer.parseInt(numeroTexto);
		
		System.out.println(numero + 4); //El operador + suma los números ya que se han convertido previamente a Int
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Te gusta? ");
		
		String boolTexto = sc.nextLine();
		String boolTextoSinEspacios = boolTexto.trim(); //Trim() ignora los espacios en blanco
		String boolTextoMinusculas = boolTextoSinEspacios.toLowerCase();
		char boolPrimeraLetra = boolTextoMinusculas.charAt(0);
		
		boolean bool = boolPrimeraLetra == 's';//"S".equalsIgnoreCase(boolPrimeraLetra); 
		
		System.out.println(bool);
		
		sc.close();
		
		String boolOtroTexto = String.valueOf(bool);
		Date fecha = new Date();
		String fechaTexto = fecha.toString();
		
		fechaTexto = String.valueOf(fecha);
		
		System.out.println(fechaTexto);
		
	}
}
