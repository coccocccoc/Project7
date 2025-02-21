package array;

import java.util.Arrays;

public class Ex5 {

	public static void main(String[] args) {
		
		char[] srcArr = { 'a', 'b', 'c', 'd', 'e' };
		char[] copyArr = new char[3];
		
		// 인자: 원본배열, 시작위치, 새배열, 시작위치, 개수
		System.arraycopy(srcArr, 0, copyArr, 0, 3);
		
		System.out.println(Arrays.toString(srcArr));
		
		System.out.println(Arrays.toString(copyArr));

	}

}
