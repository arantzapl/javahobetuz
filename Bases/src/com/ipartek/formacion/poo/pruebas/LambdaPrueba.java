package com.ipartek.formacion.poo.pruebas;

import java.util.ArrayList;
import java.util.function.DoubleBinaryOperator;

public class LambdaPrueba {
	public static void main(String[] args) {
		DoubleBinaryOperator operacion;
		
		operacion = (a, b) -> a + b;
		
		System.out.println(operacion.applyAsDouble(5, 6));
		
		operacion = (a, b) -> a - b;
		
		System.out.println(operacion.applyAsDouble(5, 6));
		
		
		ArrayList<Integer> enteros = new ArrayList<>();
		enteros.add(5);
		enteros.add(7);
		enteros.add(9);
		enteros.forEach(entero -> {
			if(entero > 5) {
				System.out.println(entero);
			}
		});
	}
}
