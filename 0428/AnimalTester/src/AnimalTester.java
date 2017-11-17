
public class AnimalTester {
	public static void main(String [] args){
		Animal[] a = {
				new Dog("πŸµœ¿Ã", "ªªÏ∞≥"),
				new Cat("æ∆∑’¿Ã", 7),
				new Dog("πÈµŒ", "¡¯µæ∞≥")
		};
		
		for(Animal k : a){
			k.introduce();
			System.out.println();
		}
	}
}
