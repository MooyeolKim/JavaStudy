import java.util.Scanner;

public class DigitNo1 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������: ");
		int n = stdIn.nextInt();
		
		if(n==0)
			System.out.println("0�Դϴ�.");
		else if(n>=-9 && n<=9)
			System.out.println("1�ڸ����Դϴ�.");
		else
			System.out.println("2�ڸ��� �̻��Դϴ�.");
		
		stdIn.close();
	}

}
