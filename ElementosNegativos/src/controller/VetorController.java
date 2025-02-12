package controller;

public class VetorController {

	public int[] VetorNegativo(int[] vetor, int i, int[] negativos) {

		if (i < 0) {

			return negativos;

		} else {
			if (vetor[i] < 0) {

				negativos[i] = vetor[i];

			}
		}

		return VetorNegativo(vetor, i - 1, negativos);
	}

}

//int[] negativos = new int[indices];

//if(indices < 0) {

// return negativos;

//}