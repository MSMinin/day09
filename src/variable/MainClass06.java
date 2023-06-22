package variable;

class TestClass06 {
	public static int su;
	public static void test() {
		su = 100;
	}
}

public class MainClass06 {
	public static int num;
	public static void main(String[] args) {
		TestClass06 t = new TestClass06();
		num = 100;
	}
}
