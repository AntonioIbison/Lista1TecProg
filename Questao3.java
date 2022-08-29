package ListaEsquenta1;

import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {

	int A, B;
	Scanner input = new Scanner(System.in);
	
	System.out.println("Informe um valor para A: ");
	A= input.nextInt();
	
	System.out.println("Informe um valor para B: ");
	B= input.nextInt();
	
	if(A==10){
		System.out.println("A == 10");
}
	if(A + B == 20){
		System.out.println("A + B == 20");
}
	if(B==10){
		System.out.println("B == 10");
}
}
}