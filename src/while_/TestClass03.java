package while_;

public class TestClass03 {
	public static void main(String[] args) {
		
		int i=0;
		
		while( i < 5) {
			i++;
			if(i == 3) {
				System.out.println("33333");
				// continue;	// 만나는 순간 바로 while문으로 돌아감
				// break;
			}
			System.out.println("i : " + i);
		}
		System.out.println("다음 문장 실행");
		
		
		
	}
}
