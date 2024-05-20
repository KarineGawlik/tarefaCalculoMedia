package br.com.karineg;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		//scanner em Java é uma feramenta para simplificar a leitura de entrada do usuário.
		Scanner scanner = new Scanner(System.in);
		
		long nota1, nota2, nota3, nota4;
		
		System.out.print("**** Bem-vindo(a) sua calculadora de média! **** \n\n Digite suas notas (número de 1-10) \n\n Digite sua nota em matemática: ");
		nota1 = (long) scanner.nextDouble();
		
		System.out.print("Digite a sua nota em português: ");
		nota2 = (long) scanner.nextDouble();
		
		System.out.print("Digite a sua nota em história: ");
		nota3 = (long) scanner.nextDouble();
		
		System.out.print("Digite a sua nota em geografia: ");
		nota4 = (long) scanner.nextDouble();
		
		long media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A média das notas é: " + media);
	}

}
