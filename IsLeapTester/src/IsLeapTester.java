import java.util.Scanner;


public class IsLeapTester {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��� : ");
		int y = stdIn.nextInt();
		System.out.println("�� ������ ����" + 
		(new Day(y).isLeap() ? "�Դϴ�." : "�� �ƴմϴ�."));
	}
}
