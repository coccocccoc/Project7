package array.quiz;

// 외부 패키지에 있는 클래스를 가져올때는 import 선언 (Arrays.toString)
import java.util.Arrays;

public class Quiz4 {

	public static void main(String[] args) {
		
		// 5개 크기의 배열 생성
		int[] arr = new int[5];
		int index = 0;
		
		// Arrays 클래스의 함수를 사용하여 배열의 값 출력
		System.out.println(Arrays.toString(arr));
		
		// 배열에 짝수만 저장
		// 규칙, 패턴 찾기
		// 배열[index] = 짝수
		// index: 0 ~ 4
		// 짝수: 2 4 6 8 10
	
		// i의 용도: 반복문의 조건, 짝수
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println("index:" + index + " i:" + i);
				arr[index] = i;
				index++;
			}
		}
		// 변수 i 하나로는 문제를 풀 수 없다
		
		
		
		
//		// arr[i]
//		// (n % 2 == 0)
//		
//		// i의 용도: 배열의 인덱스, 반복문의 조건식
//		for(int i = 0; i < arr.length; i++ ) {
//			// n의 용도: 배열에 대입할 값, n % 2 ==0
//			for(int n = 1; n <= 10; n++) {
//				if(n % 2 == 0) {
//					arr[i] = n;
//					System.out.println(arr[i]);
//				}
//			}
//		}
		
		
	}

}
