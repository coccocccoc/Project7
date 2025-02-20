package array;

// 배열과 반복문
public class Ex3 {

	public static void main(String[] args) {

		// 10개 크기의 배열을 생성하고 바로 초기화
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// i의 용도: 반복문의 조건식, 배열의 index
		for (int i = 0; i < 10; i++) { // 총 10번 반복
			System.out.println(arr[i]); // 0~9 변수
		}

		// 조건문은 반복횟수를 한눈에 알 수 있게 쓰는게 좋음
		// 해당 조건문은 반복횟수를 한눈에 알기 어려움
//		for(int i = 0; i <= 9; i++) { 
//			System.out.println(arr[i]);
//		}

		System.out.println("배열의 크기: " + arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// length를 활용하면 프로그램을 수정할 필요가 없다
		// => 유지보수가 좋다
		
	}
}
