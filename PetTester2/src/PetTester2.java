
public class PetTester2 {
	static void intro(Pet p){
		p.introduce();
	}
	
	public static void main(String [] args){
		Pet[] a;
		a = new Pet[]{
				new Pet("Kurt", "아이"),
				new RobotPet("R2D2", "루크"),
				new Pet("마이클", "영진"),
		};
		
		for(Pet p : a){
			intro(p);
			System.out.println();
		}
	}
	
}
