import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ficheros {
	public static void main(String[] args) {
		final String RUTA_FICHERO = "prueba.txt";
		
		try (FileWriter fw = new FileWriter(RUTA_FICHERO); PrintWriter pw = new PrintWriter(fw)){
			pw.println("Hola desde el fichero");
			pw.println("Cómo va?");
			System.out.println("Se ha escrito");
		}catch(FileNotFoundException e) {
			System.out.println("No se ha podido CREAR el fichero");
		}catch (IOException e) {
			System.out.println("No se ha podido escribir el fichero");
		}
		
		try (FileReader fr = new FileReader(RUTA_FICHERO); Scanner sc = new Scanner(fr)) {
			String linea;
			while (sc.hasNextLine()) {
				linea = sc.nextLine();
				System.out.println("FICHERO: " + linea);
			}
		}catch(IOException e) {
			System.out.println("No se ha podido leer el fichero.");
		}
	}
}
