package arraylist;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {

		// 학생 생성
		Student student = new Student("둘리");
		// 학생이 수강하는 과목리스트 생성
		student.subjects.add(new Subject("국어", 100));
		student.subjects.add(new Subject("수학", 50));
		student.showInfo();
		
		Student student2 = new Student("도우너");
		// 도우너가 수강하는 과목을 추가
		// 인스턴스 입력 방법
		// 1. 인스턴스 생성 > 참조변수 입력
		// 2. 바로 인스턴스 생성
		student2.subjects.add(new Subject("국어", 60));
		student2.subjects.add(new Subject("영어", 70));
		student2.subjects.add(new Subject("과학", 85));
		student2.subjects.add(new Subject("수학", 100));
		student2.showInfo();
		
		// 리스트의 특징:
		// 크기가 유동적이다
		// 원하는 만큼 데이터를 추가할 수 있다

	}

}

// 과목
class Subject {
	String name;
	int score;
	
	public Subject(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
}

// 학생
class Student {
	String studentName; // 학생의 이름
	ArrayList<Subject> subjects; // 수강 과목 리스트, 리스트 선언
	
	public Student(String studentName) {
		super();
		this.studentName = studentName;
		subjects = new ArrayList<Subject>(); // 리스트 생성
	}
	
	// 학생의 총점을 계산하는 메소드
	public void showInfo() {
		int total = 0; // 총점수
		// size(): 리스트의 크기를 반환하는 함수
//		for(int i = 0; i < subjects.size(); i++) {
//			Subject subject = subjects.get(i); // 과목 꺼내기
//			int subScore = subject.score; // 과목의 점수
//			total = total + subScore;
//		}
		// 람다식 for문
		 for(Subject s : subjects) {
			 // 과목의 점수를 더하는
			 total = total + s.score;
		 }
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다");
	}
	
}