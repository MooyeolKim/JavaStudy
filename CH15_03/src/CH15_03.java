import java.util.Scanner;


public class CH15_03 {
	public static void main(String [] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("문자열 s1 : ");
		String s1 = stdIn.nextLine();
		System.out.print("문자열 s2 : ");
		String s2 = stdIn.nextLine();
		
		int idx = s1.indexOf(s2);
		System.out.println("문자열 s1 : " + s1);
		System.out.print("문자열 s2 : ");
		for(int i=0 ; i<idx ; i++)
			System.out.print(' ');
		System.out.println(s2);
	}
}
