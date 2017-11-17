import java.util.Scanner;

public class PutAsteriskFor {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("몇 개의 *을 표시합니까? : ");
		int n = stdIn.nextInt();

//		for(int i=0 ; i<n ; i++){
		for(int i=1 ; i<=n ; i++){
			System.out.print('*');
		}
	}
}
