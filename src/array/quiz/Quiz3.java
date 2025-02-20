package array.quiz;

public class Quiz3 {

	public static void main(String[] args) {
		int[] arr = { 10, 15, 20, 25, 30 };
		
		// arr[0] + arr[1] + ... + arr[arr.length-1]
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i]; // 0~4
		}
		System.out.println(sum);
	}

}
