package variable;

class TestClass03{
	public int var; 
	// 클래스 범위에서 만들어진 변수는 인스턴스(객체) 변수라고 한다.
	
	public void test1() {
		for(int i = 0; i < 5; i++) { 
			// i같은 일회성 변수는 지역변수로 생성한다.
			// 계속 남아있으면 메모리의 효율이 떨어지기 때문이다.
			
		}
		
		var = 100;
	}
	
	public void test2() {
		System.out.println(var);
	}
}
public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.test1();
		t.test2();
	}
}
