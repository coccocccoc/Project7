package array.quiz;

import java.util.Arrays;

//배열에서 가장 큰 값 출력
public class Quiz5 {

	public static void main(String[] args) {

		// 배열 생성 및 초기화
		int[] arr = { 5, 20, 100, 30, 77 };
				
		// 5 20 
		// 20 100
		// 100 30
		// 100 70
		
		// max arr[1]
		// max arr[2]
		// max arr[3]
		// max arr[4]
		// max와 arr 배열의 요소를 비교
		
		// 최댓값을 담을 변수
		int max = arr[0];
		
		// 1 ~ 4 총 4번 반복\
		for(int index = 1; index <= 4; index++) {
			// 배열의 요소가 현재 max보다 크다면 max를 교체
			if(max < arr[index]) { // max와 배열의 요소를 비교하여
				max = arr[index]; // 최댓값 교체
			}
		}
		System.out.println(max);


	}

}
