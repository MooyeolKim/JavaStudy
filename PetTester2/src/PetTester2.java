
public class PetTester2 {
	static void intro(Pet p){
		p.introduce();
	}
	
	public static void main(String [] args){
		Pet[] a;
		a = new Pet[]{
				new Pet("Kurt", "����"),
				new RobotPet("R2D2", "��ũ"),
				new Pet("����Ŭ", "����"),
		};
		
		for(Pet p : a){
			intro(p);
			System.out.println();
		}
	}
	
}
