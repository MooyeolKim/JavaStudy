import java.util.Scanner;

public class IsoscelesTriangle04 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("우하변이 직각인 삼각형을 표시합니다.");
		System.out.print("몇 단 : ");
		int n = stdIn.nextInt();
		
		for(int i=1 ; i<=n ; i++){
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
