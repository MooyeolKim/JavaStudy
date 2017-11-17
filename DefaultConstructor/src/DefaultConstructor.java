class A{
	private int a;
	A(int x){
		a = x;
	}
	A(){}
	int getA(){
		return a;
	}
}

class B extends A{
}

public class DefaultConstructor {
	public static void main(String [] args){
		B x = new B();
		
		System.out.println("x.getA() = " + x.getA());
	}
}
