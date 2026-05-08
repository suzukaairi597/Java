package Test1;

/*
 * 날짜 : 2026/05/08
 * 이름 : 신여진
 * 내용 : 자바 연산자 연습문제
 */

public class Test03 {
	public static void main(String[] args) {
		
		int result = 0;
		int num = 1;
		
		result = num++;
		
		System.out.println("result : " + result);
		
		result = ++num;
		
		System.out.println("result : " + result);
		
		result = ++num;
		
		System.out.println("result : "+result);
		
		result = num--;		
		System.out.println("result : "+result);
		
		result = --num;		
		System.out.println("result : "+result);		
		
	}
}
