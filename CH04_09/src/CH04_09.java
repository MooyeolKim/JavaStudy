import java.util.Scanner;

public class CH04_09 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("���� ���� : ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		int i = 1;
		int mul = 1;
		while(i <= n){
			mul *= i;
			i++;
		}
		
		System.out.println("1���� " + n + "������ ���� " + mul + "�Դϴ�.");
		
	}
}
