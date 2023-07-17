package POOpruebas;

import POO.Contador;

public class ContadorPrueba {
	public static void main(String[] args) {
		Contador ctd1 = new Contador();
		int num = 0;
		
		ctd1.setCont(num);
		ctd1.incrementar();
		System.out.println(ctd1.getCont());
		
		
		ctd1.incrementar();
		System.out.println(ctd1.getCont());
		
		
		ctd1.decrementar();
		ctd1.decrementar();
		System.out.println(ctd1.getCont());
		ctd1.decrementar();
		System.out.println(ctd1.getCont());
		
		
		Contador ctd2 = new Contador(10);
		System.out.println(ctd2.getCont());
		
		ctd2.incrementar();
		System.out.println(ctd2.getCont());
		ctd2.decrementar();
		System.out.println(ctd2.getCont());
		
		Contador ctd3 = new Contador(ctd2);
		System.out.println(ctd3.getCont());
		
		
		
	}
}
