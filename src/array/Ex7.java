package array;

// 다차원 배열
public class Ex7 {

	public static void main(String[] args) {
		
		
		// 2차원 배열 생성 및 초기화
		int[][] arr = { {2, 4, 6}, {3, 6, 9} };

		// 배열의 모든 요소를 출력 => 이중 for문
		for(int i = 0; i < 2; i++) { //행 (0, 1)
			for(int j = 0; j < 3; j++) { // 열 (0, 1, 2)
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < 2; i++) { //행 (0, 1)
			for(int j = 0; j < 3; j++) { // 열 (0, 1, 2)
				System.out.print("[" + i + "," + j +"]");
			}
			System.out.println();
		}
		
	}

}
