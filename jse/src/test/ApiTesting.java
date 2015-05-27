package test;

public class ApiTesting {
	public static void main(String[] args) {
		Test a = new Test();
		Test b = a;
		
		a.set(10);
		b.set(20);
		System.out.println(a);
		System.out.println(b);
		
	}
}
class Test{
	int a;

	public int get() {
		return a;
	}

	public void set(int a) {
		this.a = a;
	}
	
}