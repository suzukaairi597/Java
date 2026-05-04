package sub2;

public class Car {
	//속성(멤버 변수)
	private String brand;
	private String color;
	private int speed;
	
	public Car(String brand, String color, int speed) {		
		this.brand = brand;
		this.color = color;
		this.speed = speed;		
	}
	
	
	//기능(멤버 베서드)
	public void speedUp(int speed) {
		
		//this : 클래스의 멤버변수를 참조하는 키워드
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.brand);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
}
