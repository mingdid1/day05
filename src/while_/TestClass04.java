package while_;

import java.util.Scanner;

public class TestClass04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, sum = 0;
		
		while (true) {
			System.out.println("1~10 사이 수 입력");
			i = sc.nextInt();
			
			if (i > 0 && i <= 10)
				break;
			
			else if(i <= 0 || i > 10) {
				System.out.println("범위 벗어남..");
				continue;
			}
		}
		
		for (int k =1; k<=i; k++) {
			sum += k;
		}
		System.out.println("1~" + i + "까지의 합: " + sum);
		
		
	}
}
