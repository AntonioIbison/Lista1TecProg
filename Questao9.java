package ListaEsquenta1;

import java.util.Scanner;

public class Questao9 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int A, B;
		
		System.out.println("Informe um valor para A: ");
		A=input.nextInt();
		System.out.println("Informe um valor para B: ");
		B=input.nextInt();
		
		if(A>10 && A+B==20) {
			System.out.println("A+B==20");
		}else {
			System.out.println("numero nao valido");
		}
	}

}
