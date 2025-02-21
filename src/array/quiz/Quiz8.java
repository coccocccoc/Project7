package array.quiz;

public class Quiz8 {

	public static void main(String[] args) {
		
		// 3개 크기의 객체 배열 생성
		Student[] student = new Student[3];
		
		// 배열의 첫번째 요소 = 인스턴스 생성
		student[0] = new Student(1, "둘리");
		student[1] = new Student(2, "또치");
		student[2] = new Student(3, "도우너");
		
		for(int i = 0; i < student.length; i++) {
			student[i].showInfo();
		}

		// 람다식 for문
		// 값을 저장할 변수: 배열
		// 배열의 요소를 순회하는 구조
		// 배열의 첫번째 요소부터 마지막 요소까지 접근할 수 있다
		for(Student student2 : student) {
			student2.showInfo();
		}

	}

}

class Student{
	int studentId;
	String name;
	
	public Student(int studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}

	public void showInfo() {
		System.out.println("학번: " + studentId + ", 이름: " + name);
	}
}