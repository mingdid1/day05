package while_;

public class TestClass06 {
	public static void main(String[] args) {
		
		// 무조건 1번은 실행된다
		
		int su = 5, i = 1;
		
		do {
			// 종속문장
			System.out.println("do while : " + i);
			i++;
		}while (i < su);	// 조건식
		

		
		while(i < su) {
			// 종속문장
			System.out.println("while : " + i);
			i++;
		}
		System.out.println("다음 문장 실행");
	}
}
