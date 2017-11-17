public class EvaluationOrder {
	public static void main(String[] args){
		int a = 3;
		int x = (a++) * (2 + a); // x = 3 * (2+4)
		System.out.println("a = " + a);
		System.out.println("x = " + x);
	}
}
