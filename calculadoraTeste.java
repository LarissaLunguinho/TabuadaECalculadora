import java.util.Scanner;

import com.sun.source.tree.YieldTree;

// Crie um programa de uma calculadora utilizando uma instru��o switch-case
public class calculadoraTeste {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
				
	System.out.print ("1) Soma \n"
				+ "2) Substra��o \n"
				+ "3) Divis�o \n"
				+ "4) Multiplica��o \n");
	
					int escolha = s.nextInt();
	
	System.out.print ("Digite o n�mero 1");
	int A = s.nextInt();
	System.out.print("Digite o n�mero 2");
	int B = s.nextInt();
	
	switch (escolha) {
	case 1:
		int C = A+B;
		System.out.print("SOMA= " +C);
		break;
	case 2: 
		int D = A-B;
		System.out.print("SUBSTRA��O= " +D);
		break;
	case 3:
		int E = A/B;
		System.out.print("DIVIS�O= "+E);
		break;
	case 4:
		int F = A * B;
		System.out.print("Multiplica��o= "+F);
		break;
	
	}
	
	
	
	
	
	
	}}
	
	