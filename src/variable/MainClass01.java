package variable;
/*
 클래스 변수 - 클래스가 메모리에 올라갔을 경우에 생선된다.
 인스턴스 변수 - 인스턴스(객체)가 생성될 때 생성된다.
 지역 변수 - 해당 지역이 실행될 때 생성된다.  {}내부에 생성되는 변수를 뜻함
*/
public class MainClass01 {
	public static void main(String[] args) {
		String name  = "홍길동";
		if(true) {
			// String n2 = "김길이";
			// if문 안에 생성된 지역변수이기때문에 if문 밖에서 사용 불가
			name = "김개똥";
			// name변수는 if문을 품고 있는 main에서 생성되서 사용 가능
		}
		// System.out.println(n2);
		System.out.println(name);
	}
}
