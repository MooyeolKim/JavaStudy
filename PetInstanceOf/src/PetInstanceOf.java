
public class PetInstanceOf {
	public static void main(String [] args){
		Pet[] a;
		a = new Pet[]{
				new Pet("Kurt", "����"),
				new RobotPet("R2D2", "��ũ"),
				new Pet("����Ŭ", "����"),
		};
		
		for(int i=0 ; i<a.length ; i++){
			System.out.println("a[" + i + "]");
			if(a[i] instanceof RobotPet)
				((RobotPet)a[i]).work(0);
			else
				a[i].introduce();
	
			/*if(a[i] instanceof Pet)
				a[i].introduce();
			else
				((RobotPet)a[i]).work(0);*/
		}
	}
}
