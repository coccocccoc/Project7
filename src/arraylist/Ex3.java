package arraylist;

import java.util.ArrayList;

// 도서 정보를 저장할 수 있는 리스트 생성
public class Ex3 {

	public static void main(String[] args) {
		
		// Book 타입의 리스트 생성
		// E기호: 데이터 타입
		ArrayList<Book> list = new ArrayList<Book>();

		// 데이터 추가
		Book book = new Book("태백산맥", "조정래");
		list.add(book); // 인자: 도서타입의 참조변수
		
		// 인스턴스를 생성하면서 바로 추가
		list.add( new Book("데미안", "헤르만 헤세") );
		list.add( new Book("어떻게 살 것인가", "유시민") );
		
		// 리스트의 요소 꺼내기
		// get메소드의 매개변수: index, 리턴값: Book
		
		for(int i = 0; i < 3; i++) {
			Book getBook = list.get(i);
			getBook.showInfo();
		}
	
		// 람다식 for문
		// (값을 저장할 변수 : 배열 or 리스트)
		for(Book b : list) {
			b.showInfo();
		}
		
	}

}

// 도서
class Book {
	String bookName; // 제목
	String author; // 저자

	// 모든 멤버변수를 초기화하는 생성자
	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}
	
	// 책의 모든 정보를 출력하는 메소드
	public void showInfo() {
		System.out.println(bookName + ", " + author);
	}
	
}