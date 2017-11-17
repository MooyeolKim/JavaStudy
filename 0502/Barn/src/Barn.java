public class Barn {
		public static void main(String[] args) {
		new Barn().go("hi");
		new Barn().go("hi", "world");
	}
		
		public void go(String... y) {
			System.out.print(y[y.length - 1] + " ");
		}
		
}