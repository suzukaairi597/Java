package sub2;


public class EncapsuleTest {
	
	public static void main(String[] args) {
	
		Car sonata = new Car("소나타", "흰색", 0);
		Car avante = new Car("아반테", "은색", 0);
				
		// 은닉된 속성은 생성자로 초기화
		//sonata.brand = "소나타";
		//sonata.color = "흰색";
		///sonata.speed = 0;
		
		sonata.show();
		avante.show();
		
		
	}
	
	
}
