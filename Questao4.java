package ListaEsquenta1;

import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		
		int A, B;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um valor para A: ");
		A=input.nextInt();
		System.out.println("Informe um valor para B: ");
		B=input.nextInt();
	
		
		if(A>10 && A+B==20) {
			System.out.println("numero valido");
			}else if(A==B){
				System.out.println("A é igual B; A e B são diferentes de 10; A é menor que 10");
			}else {
				System.out.println("numero nao valido");
			}
	}

}
