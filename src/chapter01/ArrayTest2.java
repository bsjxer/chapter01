package chapter01;

public class ArrayTest2 {
		// 객체를 저장하는 배열 vs 기본타입을 저장하는 배열
	public static void main(String[] args) {
		Book[] books = new Book[5]; // Book b = new Book();
		
		// books[0].title = "자바의 정석"; 저장공간만 만들어 진거지 (참조값만 생성)객체가 아직 생성되지 않은 상태
		
		books[0] = new Book();
		books[0].title = "자바의 정석";
		
		
		//System.out.println( book[] );
	}

}
