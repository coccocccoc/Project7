package array;

// 배열 사용하기
public class Ex2 {

	public static void main(String[] args) {
		
		// 3개 크기의 정수형 배열 생성
		int[] arr = new int[3];
		
		// 배열의 첫번째 요소에 10 대입
		// 배열이름[인덱스] = 값;
		arr[0] = 10;
		arr[1] = 20; // 배열의 두번째 요소에 20 저장
		arr[2] = 30; // 배열의 세번째 요소에 30 저장
		
		// 배열의 첫번째 요소 꺼내기
		int num = arr[0];
		System.out.println(num);
	
		// 인덱스는 0번부터 시작
		// 마지막 인덱스 번호는 배열의 크기-1
		
	}

}
