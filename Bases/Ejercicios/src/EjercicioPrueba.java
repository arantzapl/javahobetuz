import java.util.Scanner;

public class EjercicioPrueba {
	public static void main(String[] args) {
		double numero = Math.random() * 100 + 1;
		int aleatorio = (int) numero;

		Scanner sc = new Scanner(System.in);
		System.out.println("Elige un número: ");

		int numuser = sc.nextInt();
		while (numuser != aleatorio) {
			if (numuser > aleatorio) {
				System.out.println("El número elegido es superior. Prueba de nuevo: ");
			} else if (numuser < aleatorio) {
				System.out.println("El número elegido es inferior. Prueba de nuevo: ");
			}
			numuser = sc.nextInt();
		}
		System.out.println("Felicidades. ¡Acertaste!");
		sc.close();
	}
}
