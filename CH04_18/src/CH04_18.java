import java.util.Scanner;

public class CH04_18 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int n = stdIn.nextInt();
		
		for(int i=1 ; i<=n ; i++){
			System.out.println(i + "의 제곱은 " + i*i);
		}
	}
}
