package arraylist.quiz;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
		list.add(true);
		list.add(true);
		list.add(false);
		
		// 일반 for문
		for(int i = 0; i < 3; i++) {
			System.out.println(list.get(i));
		}
		
		// 람다식 for문
		// (값을 저장할 변수 : 배열 or 리스트)
		for(Boolean b : list) {
			System.out.print(b + " ");
		}
	}
}
