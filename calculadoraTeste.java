import java.util.Scanner;

import com.sun.source.tree.YieldTree;

// Crie um programa de uma calculadora utilizando uma instrução switch-case
public class calculadoraTeste {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
				
	System.out.print ("1) Soma \n"
				+ "2) Substração \n"
				+ "3) Divisão \n"
				+ "4) Multiplicação \n");
	
					int escolha = s.nextInt();
	
	System.out.print ("Digite o número 1");
	int A = s.nextInt();
	System.out.print("Digite o número 2");
	int B = s.nextInt();
	
	switch (escolha) {
	case 1:
		int C = A+B;
		System.out.print("SOMA= " +C);
		break;
	case 2: 
		int D = A-B;
		System.out.print("SUBSTRAÇÃO= " +D);
		break;
	case 3:
		int E = A/B;
		System.out.print("DIVISÃO= "+E);
		break;
	case 4:
		int F = A * B;
		System.out.print("Multiplicação= "+F);
		break;
	
	}
	
	
	
	
	
	
	}}
	
	