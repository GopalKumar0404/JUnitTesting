package com.gopal.services;

public class CalculatorService {
	
	public static int addTwoNumbers(int a , int b) {
		return a+b;
	}

	public static int sumOfAnyNumbers(int ...numbers) {
		int sum = 0;
		for(int number: numbers) {
			sum+=number;
		}
		return sum;
	}
}
