import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		// 2단 
		// System.out.println(2 * 1);
		
		// 4단
//		System.out.println("4단");
//		int result = 4 * 1;
//		System.out.println(result);
		
		System.out.println("구구단 중 출력할 단은?");
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		System.out.println("number = " + number);
		
		int result;
		
		for(int i = 1; i < 10; i++) {
			result = number * i;
			System.out.println(result);
		}
		
	}
}
