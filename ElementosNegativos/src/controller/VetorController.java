package controller;

public class VetorController {

	public int VetorNegativo(int[] vetor, int i, int total) {

		//Condição de parada: quando i for igual ao tamanho do vetor [5]
		//Impedindo que ele tente ler o índice [5] inexistente
		
		if (i == vetor.length) {

			return total;

		} else {
			if (vetor[i] < 0) {

				total = total + 1;

			}
		}

		//A função foi escrita para o termo "n" em relação ao anterior
		//Considerando que, se o valor do termo for negativo, o contador de números
		//Somará 1 em sua quantidade, em seguida o próximo índice será conferido
		
		return VetorNegativo(vetor, i + 1, total);
	}

}

