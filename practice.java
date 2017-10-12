package practice;

public class practice {
	public static void main(String[]args) {
		int[][] kuku = new int[9][9]; //9×9個分のアドレスが確保された
		for(int a = 0; a < 9; a++) {
			for(int b = 0; b < 9; b++) {
				kuku[a][b] = (a+1)*(b+1);
			}
		}

		for(int a = 0; a < 9; a++) {
			for(int b = 0; b < 9; b++) {
				System.out.println((a+1) + " × " + (b+1) + " = " + kuku[a][b]);
			}
			System.out.println("");
		}
	}
}
