package variable;

class TestClass02{
	public int test1() {
		int var = 100;
		System.out.println("test1 var : "+ var);
		return var;
		// 2. test2()에서 사용하기 위해서 return을 해주었다.
	}
	
	public void test2(int var) { // 4. int v로 받은 test1의 var를 매개변수로 받는다.
		System.out.println("test2 var : " + var);
		// 1. var은 test1()에서 생성된 지역변수라서 사용불가
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t = new TestClass02();
		int v = t.test1();
		// 3. test1()에서의 반환값을 v에 저장한다.
		
		t.test2(v);
		// 5. 이제 매개변수를 넣고 test2()를 실행한다.
	}
}
