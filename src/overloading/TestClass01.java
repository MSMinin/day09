package overloading;

public class TestClass01 {
	public void sumFunc() {
		System.out.println("매개변수 없는 sumFunc");
	}
	public void sumFunc(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	public void sumFunc(String n1, String n2) {
		System.out.println(n1 + n2);
	}
}
