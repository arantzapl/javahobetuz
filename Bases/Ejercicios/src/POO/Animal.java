package POO;

public class Animal {
	private String nombre;
	private String tipoAnimal;
	private int numPatas;
	
	public Animal() {
	}
	
	public Animal(String nombre, String tipoAnimal, int numPatas) {
		this.nombre = nombre;
		this.tipoAnimal = tipoAnimal;
		this.numPatas = numPatas;
	}
	
	public void setNombre(String nom) {
		nombre = nom;
	}
	public void setTipoAnimal(String tipo) {
		tipoAnimal = tipo;
	}
	public void setNumPatas(int numero) {
		numPatas = numero;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getTipoAnimal() {
		return tipoAnimal;
	}
	public int getNumPatas() {
		return numPatas;
	}
	public String obtenerFicha() {
		String ficha = "Nombre:           " + nombre + "\nTipo:             " + tipoAnimal + "\nNúmero de patas:  " + numPatas + "\n";

		return ficha;
	}
}
