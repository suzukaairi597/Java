package sub1;

/**
 * 
 *  
 * 
 */
public class PrintTest {
	public static void main(String[] args) {
	
		// println : ln(line), 출력 후 라인(개행) 이동
		System.out.println("Hello Java!");
		System.out.println("Welcome Java!");
		
		// print : 기본 출력문, 라인 이동 없음
		System.out.print("Greeting Java!");
		System.out.print("Hey Java!");
		System.out.print("\n"); // \n : 라인이동 이스케이프 문자
		
		// printf : 포맷 출력문, 형식 문자열
		System.out.printf("이름 : %s\n", "신여진"); // %s : 문자열 출력 서식
		System.out.printf("나이 : %d\n", 23); // %d : 숫자 출력 서식
		
		
	}		
}
