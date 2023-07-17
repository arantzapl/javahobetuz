import java.io.IOException;
import java.io.*;
import java.util.Scanner;


public class FicherosPrueba {
	public static void main(String[] args) throws IOException{
		final String ruta_fichero = "prueba2.txt";
		
		FileWriter fw = new FileWriter(ruta_fichero);
		PrintWriter pw = new PrintWriter(fw);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe algo para la prueba y cuando hayas terminado, escribe 'fin'");
		
		String escritura = sc.nextLine();
		String salida = "FIN";
		
		while (escritura.equalsIgnoreCase(salida) != true){
			if (escritura != salida) {
				pw.println(escritura);
				escritura = sc.nextLine();
			}
		}
		System.out.println("Has terminado de escribir.");
		sc.close();
		pw.close();
	}
}
