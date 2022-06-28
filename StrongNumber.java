package strongnumber;

import java.util.ArrayList;

public class StrongNumber {

	

	public static String isStrongNumber(int num) {

		ArrayList<Integer> digit = new ArrayList<Integer>();
		ArrayList<Integer> factoriales = new ArrayList<Integer>();
		int aux = num;
		int factorial = 1;
		boolean leave = false;
		
		//Bucle para separar  los dígitos  y almacenarlos en un ArrayList
		while (!leave) {

			if (aux > 0) {
				digit.add(aux % 10);
				aux = aux / 10;

			} else {
				leave = true;

			}

		}

		int size = digit.size() - 1;
		int j = 1;

		//Blucles anidados para obtener los factoriales de cada uno de los dígitos anteriores 
		for (int i = size; i >= 0; i--) {

			if (digit.get(i) != 1) {

				j = 1;
				factorial = 1;
				while (j <= digit.get(i)) {

					factorial = factorial * j;
					j++;
				}

				factoriales.add(factorial);

			} else {
				factoriales.add(1);

			}

		}

		// suma de factoriales

		size = factoriales.size();
		int sumaFactoriales = 0;
		//Blucle para  obtener la suma de todos los  factoriales  para poder comparar  
		for (int k = 0; k < size; k++) {
			sumaFactoriales = sumaFactoriales + factoriales.get(k);

		}

		if (sumaFactoriales == num) {
			return " STRONG !!!";

		} else {
			return " Not Strong !!!";

		}

	}

}
