
public class Argument {
	static void method(int x, int y, int z){
		System.out.println("x = " + x + " y = " + y + " z = " + z);
	}
	
	public static void main(String[] args){
		int i=0;
		method(i, i=5, ++i);
		System.out.println("i = " + i);
		
	}
}
