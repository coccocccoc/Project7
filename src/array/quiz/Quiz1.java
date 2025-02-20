package array.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 5개 크기의 문자형 배열을 생성하세요
		// 값의 목록을 {'a', 'b', 'c', 'd', 'e'} 초기화
		// 배열의 모든 요소 출력
		
		char[] arr = new char[5];
		arr = new char[] { 'a', 'b', 'c', 'd', 'e'};
		
		// 배열의 크기만큼 반복하면서, 배열의 요소를 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); // 배열이름[인덱스]
		}

		// ArrayIndexOut 에러: 런타임 오류
		// 배열의 범위를 벗어나면 발생
		
	}
}
