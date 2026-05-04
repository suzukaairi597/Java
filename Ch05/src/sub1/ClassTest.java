package sub1;

/*
 * 날짜 : 2026/05/04
 * 이름 : 신여진
 * 내용 : Java 클래스 기본 실습
 */

public class ClassTest {
	public static void main(String[] args) {
	
		// 객체 생성
		Car sonata = new Car();
		
		// 객체 초기화
		sonata.brand = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		// 객체 활용
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		// 생성/초기화/활용	
		Car avante = new Car();
		avante.brand = "아반테";
		avante.color = "검정";
		avante.speed = 0;
		
		avante.speedUp(60);
		avante.speedDown(10);
		avante.show();
		
		// Book 객체 생성
		Book java = new Book();
		java.title = "이것이 자바다";
		java.author = "신용권";
		java.copies = 3;
		
		java.show();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
