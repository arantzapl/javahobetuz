package POOpruebas;

import static com.ipartek.formacion.bibliotecas.Consola.leerBooleano;
import static com.ipartek.formacion.bibliotecas.Consola.leerEntero;
import static com.ipartek.formacion.bibliotecas.Consola.leerLinea;
import static com.ipartek.formacion.bibliotecas.Consola.mostrarLinea;

import java.util.ArrayList;
import java.util.Scanner;

//import com.ipartek.formacion.poo.pojos.Producto;

import POO.Animal;

public class AnimalPrueba {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Animal anim = new Animal();
		Boolean continuar;
		ArrayList<Animal> animal = new  ArrayList<>();
		
		do {
			Animal a = pedirDatos();
			animal.add(a);
//			System.out.println("Introduce el nombre: ");
//			anim.setNombre(sc.nextLine());
//			System.out.println("Introduce el tipo: ");
//			anim.setTipoAnimal(sc.nextLine());
//			System.out.println("Introduce el nº de patas: ");
//			anim.setNumPatas(sc.nextInt());
			continuar = leerBooleano("¿Más animales? s/n");
			
		} while (continuar);
		
		
//		System.out.println("Listado de animales: ");
//		System.out.println("Nombre: " + anim.getNombre());
//		System.out.println("Tipo: " + anim.getTipoAnimal());
//		System.out.println("Número de patas: "  +anim.getNumPatas());
		
		mostrarLinea("Listado de animales: ");
		
		for(Animal a : animal) {
			mostrarDatos(a);
		}
		
		sc.close();
	}
	
	
		
	private static Animal pedirDatos() {
		Animal a = new Animal();

		String nombre = leerLinea("Nombre");
		a.setNombre(nombre);
		String tipo = leerLinea("Tipo");
		a.setTipoAnimal(tipo);
		int numero = leerEntero("Número de patas");
		a.setNumPatas(numero);

		return a;
	}
	
	private static void mostrarDatos(Animal a) {
		System.out.println(a.obtenerFicha());
	}	
}
