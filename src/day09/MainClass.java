package day09;

public class MainClass {
	public static void main(String[] args) {
		TestClass t = new TestClass();
		String s = t.inputName();
		int k = t.inputKor();
		int e = t.inputEng();
		int m = t.inputMath();
		
		int su = t.sum(k, e, m);
		double a = t.avg(su);
		
		String g = t.grade(a);
		
		t.output(su, a, g);
		
	}
}
