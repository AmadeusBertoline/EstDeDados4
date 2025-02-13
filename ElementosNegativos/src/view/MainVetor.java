package view;

import controller.VetorController;
import java.util.Scanner;

import java.util.Scanner;
import controller.VetorController;

public class MainVetor {

	public static void main(String[] args) {

		int[] vetor = new int[5];
		int i = vetor.length - 1;
		int opc = 0;
		int total = 0;
		int res;

		Scanner scanner = new Scanner(System.in);
		VetorController vetorNegativo = new VetorController();

		while (opc != 9) {

			System.out.println(
					"1 - Digitar um novo valor \n " + "2 - Verificar total de números negativos \n" + "9 - Finalizar");
			opc = scanner.nextInt();

			if (i < 0) {

				System.out.println("Vetor cheio, segue o resultado: \n");
				res = vetorNegativo.VetorNegativo(vetor, i, total);
				System.out.println("Total de números negativos no vetor: " + res);
				opc = 9;

			}

			if (opc == 1) {

				System.out.println("Valor: \t");
				vetor[i] = scanner.nextInt();
				i = i - 1;

			} else if (opc == 2) {

				res = vetorNegativo.VetorNegativo(vetor, vetor.length * 0, total);
				System.out.println("Total de números negativos no vetor: " + res);

			} else if (opc == 9) {

				System.out.println("\n Fim do programa");

			} else {

				System.out.println("Valor incorreto");

			}

		}

		scanner.close();

	}

}
