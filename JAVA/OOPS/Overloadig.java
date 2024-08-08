package JAVA.OOPS;
class First{
	public void m1(){
		System.out.println("first.m1()");
	}
	public  void m2(){
		System.out.println("first.m2()");
	}
}
class Second extends First{
	public void m1(){
		System.out.println("second.m1()");
	}

	@Override
	public void m2() {
		System.out.println("second.m2()");
	}

	public  void m3(){
		System.out.println("second.m3()");
	}
}
public class Overloadig {
	public static void main(String[] args) {
		First f = new First();
		f.m1();
		f.m2();
		System.out.println("****************");
		Second s = new Second();
		s.m1();
		s.m2();
		s.m3();
		System.out.println("****************");
		First f1 = new Second();
		f1.m1();
		f1.m2();
		System.out.println("****************");
	}
}
