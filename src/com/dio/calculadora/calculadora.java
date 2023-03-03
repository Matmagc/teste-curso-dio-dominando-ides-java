package com.dio.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args, Object system) {
		Scanner scan = new Scanner(system.in);
		
		int a, b;
		
		System.out.println("figite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("figite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtraçao = subtraçao (a,b);
		int multiplicaçao = multiplicaçao(a,b);
		int divisao = divisao(a,b);
		
		System.out.println(soma)
		System.out.println(subtraçao)
		System.out.println(multiplicaçao)
		System.out.println(divisao)

	}
	
	public static int soma(int a, b) {
		return a + b;
	}
	
	public static int subtraçao(int a, b) {
		return a - b;
	}
	
	public static int divisao(int a, b) {
		return a / b;
	}
	
	public static int multiplicaçao(int a, b) {
		return a * b;
	}
                 

