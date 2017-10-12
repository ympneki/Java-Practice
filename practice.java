package kukuList;

public class Kuku {
	public static void main(String[]args) {
		int[][] kuku = new int[10][10];
		for(int a = 1; a < 10; a++) {
			for(int b = 1; b < 10; b++) {
				kuku[a][b] = a*b;
			}
		}

		for(int a = 1; a < 10; a++) {
			for(int b = 1; b <= 9; b++) {
				System.out.println( a + " * " + b + " = " + kuku[a][b]);
			}
			System.out.println("");
		}
	}
}

