import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		System.out.println("Bem-vindo a calculadora");
		
		int operacao = -1;
		int resultado = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(operacao != 0) {
			
			System.out.println("\nEscolha o que deseja fazer:\n(1)Adição\t(2)Subtração\t(3)Divisão\t(4)Multiplicação\n(0)Encerrar");

			operacao = sc.nextInt();

			System.out.println("Opção selecionada: " + operacao);

			if (operacao < 0 || operacao > 4) {
				System.out.println("Opção inválida. Tente novamente");
				continue;
			}

			if (operacao == 0) {
				break;
			}

			System.out.println("Digite o primeiro valor:");
			int valor1 = sc.nextInt();
			System.out.println("Digite o segundo valor:");
			int valor2 = sc.nextInt();

			Calculadora calc = new Calculadora();

			switch (operacao) {
				case 1:
					resultado = calc.soma(valor1, valor2);
					break;
				case 2:
					resultado = calc.subtrai(valor1, valor2);
					break;
				case 3:
					resultado = calc.divide(valor1, valor2);
					break;
				case 4:
					resultado = calc.multiplica(valor1, valor2);
					break;
			}

			System.out.println(String.format("Resultado: %d", resultado));

		}

		System.out.println("\nObrigado!!! Volte sempre...");

		sc.close();

	}
}