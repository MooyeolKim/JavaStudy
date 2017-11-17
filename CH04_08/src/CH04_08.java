import java.util.Scanner;

public class CH04_08 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int count = 0;
		int n;
		
		System.out.println("자릿수 출력");
		
		do{
			System.out.print("양의 정수를 입력 : ");
			n = stdIn.nextInt();
		} while(n<=0);
		
		while(n > 0){
			n /= 10;
			count++;
		}
		
		System.out.println("이값은 " + count + "자릿수 입니다.");
		
	}
}
