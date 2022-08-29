package ListaEsquenta1;

import java.util.Scanner;

public class Questao7 {
	public static void main(String[] args) {
		
		int A, B;
		
		Scanner input = new Scanner(System.in);
				
				System.out.println("Informe um valor para A: ");
				A= input.nextInt();
		
				System.out.println("Informe um valor para B: ");
				B= input.nextInt();
				
		if(A>10 || A+B==20) {
			if(A<=10) {
				System.out.println("numero nao valido");
			}else {
				System.out.println("numeros validos");
			}
			}
			}
	}