import java.util.Scanner;

public class IsoscelesTriangle03 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("����� ������ �ﰢ���� ǥ���մϴ�.");
		System.out.print("�� �� : ");
		int n = stdIn.nextInt();
		
		for(int i=n ; i>=1 ; i--){
			for(int j=1 ; j<=n-i ; j++){
				System.out.print(' ');
			}
			for(int j=1 ; j<=i ; j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
