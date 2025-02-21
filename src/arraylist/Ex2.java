package arraylist;

import java.util.ArrayList;

// 리스트와 반복문
public class Ex2 {

	public static void main(String[] args) {

		// 리스트 생성
		// E? 리스트에 저장할 데이터의 타입
		// 기초타입 사용X 클래스타입O
		// int => Integer
		ArrayList<Integer> list = new ArrayList<Integer>();

		// 데이터 추가
		list.add(10);
		list.add(20);
		list.add(30);

		// 리스트의 요소를 하나씩 꺼내서 출력
		for(int i = 0; i < 3; i++) {
			System.out.println(list.get(i));
		}

	}

}
