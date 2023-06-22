package this_;

class TestClass01{
	public int num = 12345;
	public void test() {
		int num = 789789;
		System.out.println("this : " + this);
		System.out.println("test : " + this.num);
		System.out.println("test : " + num);
	}
}

public class MainClass01 {
	public static void main(String[] args) {
	/*
	 this
	  - 메소드의 0번째 매개변수로 자동으로 만들어진다.
	  - 클래스 자기자신의 정보를 가지고 있는 변수
	*/
		TestClass01 t = new TestClass01();
		System.out.println("t : " + t);
		System.out.println("main : " + t.num);
		t.test();
		// t와 test()의 결과는 동일한데
		// 이것을 보고 동일한 방법으로사용할수 있다는 뜻
		
	}
}
