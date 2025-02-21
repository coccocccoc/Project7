package array;

// 객체 배열
public class Ex6 {

	public static void main(String[] args) {
		
		// 3개 크기의 객체 배열 생성
		// 참조변수의 집합
		Book[] books = new Book[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.print(books[i] + " ");
		}
		System.out.println();
		
		// 인스턴스 메소드는 인스턴스 생성없이 사용할 수 없다
		// 객체 배열은 바로 사용할 수 없고 인스턴스를 생성하여 저장해야 한다
//		books[0].showInfo();
		
		// 배열의 각 요소에 인스턴스를 생성하여 저장
		books[0] = new Book("태백산맥", "조정래");
		books[1] = new Book("토지", "박경리");
		books[2] = new Book("어떻게 살 것인가", "유시민");

		for(int i = 0; i < 3; i++) {
			System.out.print(books[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 3; i++) {
			books[i].showInfo();
		}
			
	}

}

// 도서
class Book {
	String bookName; // 책제목
	String author; // 저자
	
	// 모든 멤버변수를 초기화하는 생성자
	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}

	// 책의 모든 정보를 출력하는 메소드
	public void showInfo() {
		System.out.println("책 제목: " + bookName + ", 저자: " + author);
	}
}