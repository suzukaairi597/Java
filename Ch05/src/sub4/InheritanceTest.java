package sub4;

public class InheritanceTest {
	
	public static void main(String[] args) {
		
		
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		
		sonata.speedUp(80);		
		sonata.speedDown(20);
		sonata.drive();
		
		
	}
}
