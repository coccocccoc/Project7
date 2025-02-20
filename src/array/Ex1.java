package array;

// 배열 생성 및 초기화
public class Ex1 {

	public static void main(String[] args) {

		// 3개 크기의 정수형 배열 생성
		// 타입[] 배열이름 = new 타입[크기];
		int[] arr = new int[3];
		
		// 배열 생성과 동시에 초기화
		// 요소의 개수만큼 배열이 생성됨
		int[] arr2 = { 1, 2, 3 };
		
		int[] arr3; // 배열 선언
		arr3 = new int[] { 1, 2, 3 }; // 배열 생성
		// 배열 선언과 초기화를 따로 할 때는 문법을 생략할 수 없다
		// arr3 = { 1, 2, 3 }; // 에러
	}

}
