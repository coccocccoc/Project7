package array.quiz;

import java.util.Arrays;

public class Quiz7 {

	public static void main(String[] args) {
		
		// 배열을 복사하세요
		
		char[] srcArr = { 'a', 'b', 'c', 'd', 'e' };
		char[] copyArr = new char[2];
		
		System.arraycopy(srcArr, 3, copyArr, 0, 2);
		
		System.out.println(Arrays.toString(srcArr));
		System.out.println(Arrays.toString(copyArr));

	}

}
