package array.quiz;

public class Quiz6 {
	
	public static void main(String[] args) {
		
		// 20이 저장되어있는 요소의 인덱스를 찾아 출력
		
		int[] arr = { 5, 100, 30, 77, 20 };
		
		// arr[index] == 20;
		
		for(int index = 0; index < arr.length; index++) {
			// 배열의 요소를 하나씩 비교하면서
			// 20의 위치(index) 찾기
			if(arr[index] == 20) {
				System.out.println("20이 저장되어있는 인덱스는 ["+ index + "] 이다" );
			}
		}
		
	}
}
