package ListaEsquenta1;

import java.util.Scanner;

public class Questao2 {
public static void main(String[] args) {
	
	int A, B;
	Scanner input = new Scanner(System.in);
	
	System.out.println("Informe um valor para A: ");
	A= input.nextInt();
	System.out.println("Informe um valor para B: ");
	B= input.nextInt();
	
	if(A<10 && A+B==20){
	if(A<10){
		System.out.println("A < 10");
	}
	if(A+B==20){
		System.out.println("A+B==20");
	}
}else{
	System.out.println("número não válido.");
}}}