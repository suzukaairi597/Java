package sub4;

public class Sedan extends Car {
	
	private int cc; // 배기량
	
	// 부모클래스를 상속 받으면 자식 클래스 부모클래스 속성을 초기화해줘야 됨
	public Sedan(String brand, String color, int speed, int cc) {
		super(brand, color, speed); // 부모 생성자 호출
		this.cc = cc;
	}
	
	public void drive() {
		System.out.println("Sedan drive!!!");
		System.out.println("차량 배기량 : " + this.cc);
		super.show(); // 부모(super)의 show() 호출 
	}
	
}
