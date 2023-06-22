package variable;

class TestClass05{
	public static String msg = "연습";
	public int num;
	
}

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println(TestClass05.msg);
		// 위 클래스에 있는 변수를 객체없이 사용하고 싶을때
		// 클래스에 있는 변수에 static이라는 키워드를 붙인다.
		TestClass05 t = new TestClass05();
		System.out.println(t.msg);
		
	}
}
