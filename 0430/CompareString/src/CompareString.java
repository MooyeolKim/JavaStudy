import java.util.Scanner;


public class CompareString {
	public static void main(String [] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���ڿ� s1 : ");
		String s1 = stdIn.nextLine();
		System.out.print("���ڿ� s2 : ");
		String s2 = stdIn.nextLine();
		
		s1 = "ABC";
		s2 = "ABC";
		
		if(s1 == s2)
			System.out.println("s1 == s2 �Դϴ�.");
		else
			System.out.println("s1 != s2 �Դϴ�.");
		
		if(s1.equals(s2))
			System.out.println("s1�� s2�� ������ ����.");
		else
			System.out.println("s1�� s2�� ������ �ٸ���.");
	}
}
