package curso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 // ESTRUTURA SEQUENCIAL //
		
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
		
		
		---------------------------------------------------------------------------------
		
		// ESTRUTURA CONDICIONAL //
		
		//QUESTAO 1 - Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. //
		
		Scanner sc = new Scanner(System.in);
		
		
		int A;
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextInt();
		
		if (A < 0) {
			System.out.println("Este numero eh negativo");
		} 
			else System.out.println("Numero positivo");
		
		
		sc.close();

		//QUESTAO 2 - Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.//
		
		Scanner sc = new Scanner(System.in);
		
		int A, Par;
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextInt();
		
		Par = A * A;
		
		if (Par % 2==0) {
			System.out.println("Este numero eh par");
		}
		
		else {
			System.out.println("Este numero eh impar");
		}
		
		sc.close();
		
		// QUESTAO 3 - Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao//
		//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em//
		//ordem crescente ou decrescente.//

		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Digite o valor de A");
		A = sc.nextInt();
		System.out.println("Digite o valor de B");
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
		
		//QUESTAO 4 - Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode//
		//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas//
		
		Scanner sc = new Scanner(System.in);
		
		int DuracaoTotal, HoraInicial, HoraTermino;
		
		System.out.println("Digite a hora do inicio: ");
		HoraInicial = sc.nextInt();
		System.out.println("Digite a hora que terminou");
		HoraTermino = sc.nextInt();
		
		if (HoraInicial < HoraTermino) {
			DuracaoTotal = HoraTermino - HoraInicial;
		}
		else {
			DuracaoTotal = 24 - HoraInicial + HoraTermino;
		}
		
		System.out.println("O JOGO DUROU " + DuracaoTotal + " HORA(S)");
		
		sc.close();
		
		//QUESTAO 5 - Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A//
		//seguir, calcule e mostre o valor da conta a pagar.//
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu pedido");
		int codigo = sc.nextInt();
		System.out.println("Digite a quantidade");
		int quantidade = sc.nextInt();
		
	
		double total;
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
		
		// QUESTAO 6 - Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
		// nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu valor");
		int valor = sc.nextInt();
		
		if (valor <= 25) {
			System.out.println("o seu valor ta entre 0 e 25");
		}
		else if (valor <= 50) {
			System.out.println(" o seu valor ta entre 25 e 50");
		}
		else if (valor <= 75) {
			System.out.println("o seu valor ta entre 50 e 75");
		}
		else if (valor <= 100) {
			System.out.println("o seu valor ta entre 75 e 100");
		}
		else if (valor < 0 || valor > 100) {
			System.out.println("Fora de intervalo");
			
		}
			
			
		sc.close();
		
		//QUESTAO 7 - Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
		//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
		//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		//Se o ponto estiver na origem, escreva a mensagem “Origem”.
		//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Escreva sua coordenada X");
		double X = sc.nextDouble();
		System.out.println("Escreva sua coordenada Y");
		double Y = sc.nextDouble();
		
		if (X == 0 && Y == 0) {
			System.out.println("O ponto ta na origem");
		}
		else if (X > 0 && Y > 0) {
			System.out.println("O ponto ta no 1 quadrante");
		}
		else if (X < 0 && Y > 0) {
			System.out.println("O ponto ta no 2 quadrante");
		}
		else if (X < 0 && Y < 0) {
			System.out.println("O ponto ta no 3 quadrante");
		}
		else if (X > 0 && Y < 0) {
			System.out.println("O ponto ta no 4 quadrante");
		}
		else if (X == 0) {
			System.out.println("O ponto ta no eixo da abscissa");
		}
		else if (Y == 0) {
			System.out.println("O ponto ta no eixo da ordenada");
		}
		
		sc.close();
		
		// QUESTAO 8 - Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
		//mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela
		//Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
		//salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
		//de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
		//duas casas decimais.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salario");
		double Salario = sc.nextDouble();
		
		double imposto;
		if (Salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (Salario <= 3000.0) {
			imposto = (Salario - 2000.0) * 0.08;
		}
		else if (Salario <= 4500.0) {
			imposto = (Salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (Salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("O seu imposto sera de R$ %.2f%n", imposto);
		}
		
		sc.close();
		
		
		// QUESTAO 9 - Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
		//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
		//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual a senha?");
		int Senha = sc.nextInt();
		
		while (Senha != 1010) {
			System.out.println("Senha errada, digite novamente");
			Senha = sc.nextInt();
		}
		
		System.out.println("Senha corrreta, parabens");
		
		sc.close();
		
		// QUESTAO 10 -Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
		//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
		//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma)
				
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Escreva sua coordenada X");
		double X = sc.nextDouble();
		System.out.println("Escreva sua coordenada Y");
		double Y = sc.nextDouble();
			
		while (X != 0 && Y != 0) {
			if (X > 0 && Y > 0) {
				System.out.println("O ponto ta no 1 quadrante");
		}
			else if (X < 0 && Y > 0) {
				System.out.println("O ponto ta no 2 quadrante");
		}
			else if (X < 0 && Y < 0) {
				System.out.println("O ponto ta no 3 quadrante");
		}
			else {
				System.out.println("O ponto ta no 4 quadrante");
				
			}
			X = sc.nextInt();
			Y = sc.nextInt();
		}
			
		sc.close();
		
		
		// QUESTAO 11 - Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
		//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
		//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
		//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
		//Mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
		//exemplo
		
		
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			}
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}
			
			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		
		sc.close(); 
		
	
	}

}
