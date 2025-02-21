package arraylist.quiz;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {
		
		// char => Character
		// 문자형 리스트 생성
		// new
		ArrayList<Character> list = new ArrayList<Character>();
		
		// 문자 3개 추가 ['A', 'B', 'C']
		// add
		list.add('A');
		list.add('B');
		list.add('C');

		// 리스트의 모든 요소 출력
		// get
		for(int i = 0; i < 3; i++) {
			System.out.println(list.get(i));
		}

	}

}
