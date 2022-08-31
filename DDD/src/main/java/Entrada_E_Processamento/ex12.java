package Entrada_E_Processamento;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			int b, h,a ;
			
			System.out.printf("Entre com um valor: ");
			b = ler.nextInt();
			
			System.out.printf("Entre com um valor: ");
			h = ler.nextInt();
			
			a = b*h;
			
			if (a>100) {
				System.out.printf("terreno grande ", h);
			}else {
				System.out.printf("terreno pequeno ", b);
			}
			
			
		}

	}

