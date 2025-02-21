package arraylist.quiz;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {

		// 리스트를 전부 삭제하시오
		
		// String 타입 리스트 생성
		ArrayList<String> list = new ArrayList<String>();

		// 리스트 추가
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");

		// 리스트의 구조는 유동적으로
		// 데이터를 추가하거나 삭제하면 크기가 변경된다
		// 리스트의 크기와 index의 범위는 함께 변경된다
		
		// 리스트 삭제
		// 1. 리스트 뒤부터 삭제
		for (int i = 4; i >= 0; i--) {
			list.remove(i);
		}
		
		// 2. 리스트 앞부터 삭제
		for (int i = 0; i < 5; i++) {
			list.remove(0);
			// 리스트는 연속된 구조이므로 0번 인덱스는 항상 존재
			// 크기가 0이 되기 전까지
		}

	}
}


