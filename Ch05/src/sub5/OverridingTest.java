package sub5;

class AAA {
	
	public void method1() {
		System.out.println("AAA:method1...");
	}
	public void method2() {
		System.out.println("AAA:method2...");
	}
	
	// Overload
	public void method3() {
		System.out.println("AAA:method3...");
	}
}

class BBB extends AAA {
	@Override
	public void method2() {
		System.out.println("BBB:method2...");
	}
	
	// Overload
	public void method3(int a) {
		System.out.println("BBB:method3...");
	}
}

class CCC extends BBB {
	
	// @Override 어노테이션 - Override 메서드를 표시하는 키워드, 기능은 없음
	@Override
	public void method1() {
		System.out.println("CCC:method1...");
	}
	
	@Override
	public void method2() {
		System.out.println("CCC:method2...");
	}
	
	// Overload
	public void method3(int a, int b) {
		System.out.println("CCC:method3...");
	}
}


public class OverridingTest {
	
	public static void main(String[] args) {
		
		CCC c = new CCC();
		
		c.method1();
		c.method2();
		c.method3();
		c.method3(1);
		c.method3(1, 2);
	}
}
