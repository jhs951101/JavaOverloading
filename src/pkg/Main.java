package pkg;

public class Main {
	
	public void 함수1() {
		System.out.println("func()");
	}
	
	public void 함수1(int 정수) {
		System.out.println("func(정수: " + 정수 + ")");
	}
	
	public void 함수1(String 문자열) {
		System.out.println("func(문자열: " + 문자열 + ")");
	}

	public static void main(String[] args) {
		Main m = new Main();
		
		m.함수1();        // 함수1() 실행
		m.함수1(2);       // 함수1(int 정수) 실행
		m.함수1("Hello"); // 함수1(String 문자열) 실행
	}
}
