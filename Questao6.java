package ListaEsquenta1;

import java.util.Scanner;

public class Questao6 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 int A, B;
		 
		System.out.println("Informe um valor para A: ");
		A=input.nextInt();
		System.out.println("Informe um valor para B: ");
		B=input.nextInt();
		
		if(A>10) {
			System.out.println("A>10");
		}else{
			System.out.println("A<=10");
		}
		
		if(A+B==20) {
			System.out.println("A + B ==20");
		}else {
			System.out.println("A + B != 20");
		}
			
	}

}
