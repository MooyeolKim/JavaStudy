import java.util.Scanner;


public class ExceptionEx02 {
	public static void main(String [] args){
		Scanner stdIn = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		
		System.out.print("�������� �Է��Ͻÿ�. : ");
		dividend = stdIn.nextInt();
		System.out.print("�������� �Է��Ͻÿ�. : ");
		divisor = stdIn.nextInt();
		try{
			System.out.println(dividend + "�� " + divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�. ");
		} catch(ArithmeticException e){
			System.out.println("0���� ���� �� �����ϴ�.");
		}
	}
}
