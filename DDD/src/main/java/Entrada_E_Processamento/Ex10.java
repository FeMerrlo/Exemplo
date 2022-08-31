package Entrada_E_Processamento;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b;
		
		System.out.printf("Entre com um valor: ");
		a = ler.nextInt();
		
		System.out.printf("Entre com um valor: ");
		b = ler.nextInt();
		
		if (a>b) {
			System.out.printf("O valor é maior: %d ", a);	
		}else if(a==b) {
			System.out.print("Os valores são iguai");
		}
		else {
			System.out.printf("O valor é maior: %d ", b);
		}
		
		
	}

}
