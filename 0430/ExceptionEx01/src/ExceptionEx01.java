import java.util.Scanner;


public class ExceptionEx01 {
	public static void main(String [] args){
		Scanner stdIn = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		
		System.out.print("�������� �Է��Ͻÿ�. : ");
		dividend = stdIn.nextInt();
		System.out.print("�������� �Է��Ͻÿ�. : ");
		divisor = stdIn.nextInt();
		System.out.println(dividend + "�� " + divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�. ");
	}
}
