package it.calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		System.out.println("Inserisci la prima cifra:");
		int firstElement = sc.nextInt();
		System.out.println("Inserisci la seconda cifra:");
		int secondElement = sc.nextInt();
		
		System.out.println("La somma è:"+calc.sum(firstElement,secondElement));
		System.out.println("La sottrazione è:"+calc.minus(firstElement,secondElement));
		System.out.println("La moltiplicazione è:"+calc.multiplication(firstElement,secondElement));
		System.out.println("La divisione è:"+calc.division(firstElement,secondElement));
		
	}

}
