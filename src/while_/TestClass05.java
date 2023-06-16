package while_;

import java.util.Scanner;

public class TestClass05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, temp;
		System.out.println("수 입력: ");
		i = sc.nextInt();
		
		boolean bool = true;
		
		while (bool) {
			temp = i % 10;
			i = i / 10;
			System.out.println(temp + " ");
		
			if (i == 0) {
				// break;
				bool = false;
			}
		}
		System.out.println("다음 문장 실행");
		
		
	}
}
