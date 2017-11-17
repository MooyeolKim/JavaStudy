import java.util.Scanner;

public class HelloNext {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("¿Ã∏ß¿∫ : ");
		String s1 = stdIn.next();
		
		System.out.print("¿Ã∏ß¿∫ : ");
		String s2 = stdIn.nextLine();
		
		System.out.println("æ»≥Á«œººø‰ " + s1 + "ææ!");
		System.out.println("æ»≥Á«œººø‰ " + s2 + "ææ!");
		stdIn.close();
	}

}
