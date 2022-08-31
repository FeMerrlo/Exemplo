package Entrada_E_Processamento;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b,c ;
		
		System.out.printf("Entre com um valor: ");
		a = ler.nextInt();
		
		System.out.printf("Entre com um valor: ");
		b = ler.nextInt();
		
		System.out.printf("Entre com um valor: ");
		c = ler.nextInt();
		
		if (a>b||c) {
			System.out.printf("Esse é o maior valor:  ", a);
		}else if (b>c||a) {
			System.out.printf("Esse é o maior valor: ", b);
		}
		else {
			System.out.printf("Esse é o maior valor: ",c);
		}
		
		
	}

}
