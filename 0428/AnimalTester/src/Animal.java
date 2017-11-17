
public abstract class Animal {
	private String name;
	public Animal(String name){
		this.name = name;
	}
	
	public abstract void bark();
	public abstract String toString();
	
	public String getName(){
		return name;
	}
	public void introduce(){
		System.out.print(toString() + "¿‘¥œ¥Ÿ. ");
		bark();
	}
	
}
