
public class Member {
	private String name;
	private int no;
	private int age;
	
	Member(String name, int no, int age){
		this.name = name;
		this.no = no;
		this.age = age;
	}
	
	void print(){
		System.out.println("No." + no + " : " + name + 
				" (" + age + "¼¼) ");
	}
}
