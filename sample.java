//適当に練習するよ！！

package practice;

public class sample {

	public static void main(String[] args) {

		System.out.println("Hello, world!!");

		loop();
	}

	public static void loop() {
		for(int i = 0; i < 10; i++) {
			System.out.println("unko");
			if(i == 9) {
				while(true) {
					System.out.println("buriburi");
				}
			}
		}
	}

}
