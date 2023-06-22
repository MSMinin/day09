package variable;

class Test04 {
	// 클래스 내부에 있는 메소드에서 자주 사용되는 변수가 있다면
	// 그 변수는 인스턴스 변수로 생성하는것이 좋다.
	String name;
	public void inputData() {
		name = "홍길동";
	}
	public void printData() {
		System.err.println(name);
	}
	
}

public class MainClass04 {
	public static void main(String[] args) {
		
	}
}
