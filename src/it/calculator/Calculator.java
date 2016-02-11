package it.calculator;

public class Calculator {
	
	private int sumTotal;
	private int minusTotal;
	private int multiplicationTotal;
	private int divisionTotal;

	public Calculator(){
	}
	
	public int sum(int firstElement, int secondElement) {
		// TODO Auto-generated method stub
		this.sumTotal = firstElement + secondElement;
		return  this.sumTotal;
	}

	public int minus(int firstElement, int secondElement) {
		// TODO Auto-generated method stub
		this.minusTotal = firstElement - secondElement;
		return  this.minusTotal;
	}

	public int multiplication(int firstElement, int secondElement) {
		this.multiplicationTotal = firstElement * secondElement;
		return  this.multiplicationTotal;
	}

	public double division(int firstElement, int secondElement) {
		// TODO Auto-generated method stub
		this.divisionTotal = firstElement / secondElement;
		return  this.divisionTotal;
	}

}
