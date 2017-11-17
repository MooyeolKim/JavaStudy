import java.util.Scanner;

public class CH04_17 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int n = stdIn.nextInt();
		
		int count = 0;
		for(int i=1 ; i<=n ; i++){
			if(n%i == 0){
				System.out.println(i);
				count++;
			}
		}
		
		System.out.println("약수는 " + count + "개 입니다.");
			
	}
}
