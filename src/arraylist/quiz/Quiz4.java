package arraylist.quiz;

import java.util.ArrayList;

public class Quiz4 {

	public static void main(String[] args) {

		// Student형 리스트 생성
		ArrayList<Student> list = new ArrayList<Student>();

		// 데이터 추가
		// 인스턴스 생성 후 참조변수를 입력 or 바로 인스턴스 생성
		list.add(new Student(1, "둘리"));
		list.add(new Student(2, "또치"));
		list.add(new Student(3, "도우너"));

		for (int i = 0; i < 3; i++) {
			Student getStudent = list.get(i);
			getStudent.showInfo();
		}

	}

}

class Student {
	int studentId;
	String name;

	public Student(int studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}

	public void showInfo() {
		System.out.println("학번:" + studentId + ", 이름:" + name);
	}

}