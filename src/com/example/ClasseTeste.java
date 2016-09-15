package com.example;

import java.util.Scanner;

public class ClasseTeste {
	
	public static void main(String[] args) {
		
		String resposta;
		System.out.println("Main method");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Aprederam git? S ou  N");
		resposta = s.nextLine();
		
		switch (resposta) {
		case "s":
			System.out.println("parabens APRENDEU");
			break;
		case "n":
			System.out.println("Presta atenção");
		break;
		default:
			System.out.println("Pedi para digitar apenas S ou N");
			break;
		}
		
	}

}
