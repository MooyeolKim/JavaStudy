import java.util.Scanner;

public class PutAsterisk1 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�� ���� *�� ǥ���մϱ�? : ");
		int n = stdIn.nextInt();
		
//		int i = 0;
//		int i = 1;
//		while(i < n){
//		while(i <= n){
//		while(n-- > 0){
		while(--n >= 0){
			System.out.print('*');
//			i++;
		}
		System.out.println();
	}
}
