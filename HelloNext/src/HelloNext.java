import java.util.Scanner;

public class HelloNext {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�̸��� : ");
		String s1 = stdIn.next();
		
		System.out.print("�̸��� : ");
		String s2 = stdIn.nextLine();
		
		System.out.println("�ȳ��ϼ��� " + s1 + "��!");
		System.out.println("�ȳ��ϼ��� " + s2 + "��!");
		stdIn.close();
	}

}
