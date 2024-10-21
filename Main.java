package curso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//QUESTAO 1 - Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro// 
		//casas decimais conforme exemplos. Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159//

 
		Scanner sc = new Scanner(System.in);
		
		double A, B, raio, area;
		
		A = 3.14;
		B = sc.nextInt();
		raio = B * B;		
		area = A * raio;
		
		System.out.println("a area eh:" + area);
		sc.close(); 
		
		
		//QUESTAO 2 - Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto//
		//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)//
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, DIFF;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		DIFF = (A * B - C * D);
		
		System.out.println("a diff eh:" + DIFF);
		sc.close();
		
		
		//QUESTAO 3 - Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por//
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas//
		//decimais//
		
		
		Scanner sc = new Scanner(System.in);
		
		int Numero, HorasTrabalho, ValorHora, Salario;
		
		System.out.println("Qual seu numero");
		Numero = sc.nextInt();
		System.out.println("Quantas horas voce trabalhou");
		HorasTrabalho = sc.nextInt();
		ValorHora = 50;
		Salario = HorasTrabalho * ValorHora;
		
		
		
		System.out.println("O funcionario numero: " + Numero + " Vai receber: " + Salario);
		sc.close();
		
		//QUESTAO 4 - Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o//
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago//
		
		Scanner sc = new Scanner(System.in);
		
		int Pc1, Npc1, Pc2, Npc2;
		double Valor1, Valor2, ValorPeca1, ValorPeca2, ValorTotal;
		
		System.out.println("Digite o numero da peca 1: ");
		Pc1 = sc.nextInt();
		System.out.println("Digite o numero de pecas da primeira: ");
		Npc1 = sc.nextInt();
		System.out.println("Digite o numero da peca 2: ");
		Pc2 = sc.nextInt();
		System.out.println("Digite o numero de pecas da segunda: ");
		Npc2 = sc.nextInt();
		System.out.println("Digite o valor da peca 1: ");
		Valor1 = sc.nextDouble();
		System.out.println("Digite o valor da peca 2: ");
		Valor2 = sc.nextDouble();
		
		ValorPeca1 = Npc1 * Valor1;
		ValorPeca2 = Npc2 * Valor2;
		ValorTotal = ValorPeca1 + ValorPeca2;
		
		
		System.out.println("O valor a pagar sera: " + ValorTotal);
		
		sc.close();
		
		
		//QUESTAO 5 - 	Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
			//a) a área do triângulo retângulo que tem A por base e C por altura.
			//b) a área do círculo de raio C. (pi = 3.14159)
			//c) a área do trapézio que tem A e B por bases e C por altura.
			//d) a área do quadrado que tem lado B.
			//e) a área do retângulo que tem lados A e B.
		
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, AreaTri, AreaCirculo, AreaTrap, AreaQuad, AreaRetan, Pi;
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		B = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		C = sc.nextDouble();
		
		AreaTri = (A*C)/2;
		Pi = 3.14;
		AreaCirculo = (C * C) * Pi;	
		AreaTrap = (C*(A+B))/2;
		AreaQuad = B * B;
		AreaRetan = A * B;
		
		System.out.println("A area do triangulo eh: " + AreaTri);
		System.out.println("A area do circulo eh: " + AreaCirculo);
		System.out.println("A area do trapezio eh: " + AreaTrap);
		System.out.println("A area do quadrado eh: " + AreaQuad);
		System.out.println("A area do retangulo eh: " + AreaRetan);
		
		
		sc.close();
	}

}
