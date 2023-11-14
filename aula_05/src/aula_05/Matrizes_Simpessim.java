package aula_05;

public class Matrizes_Simpessim {

	public static void main(String[] args) {

		/*    (j) Y0 Y1 Y2 Y3 Y5
		 * (i) X0 1  2  3  4  5
		 *     X1 6  7  8
		 *     X2 9 10 11 
		 */
		
		int[][] num = { { 1, 2, 3 , 11 , 12}, { 4, 5, 6 }, { 7, 8, 9,10 } };

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.printf("[" + num[i][j] + "]");
			}
			System.out.printf("\n");
		}
	}

}
