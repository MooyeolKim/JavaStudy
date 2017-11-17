import java.util.Scanner;

public class Sign {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int n = stdIn.nextInt();
		
		if(n > 0)
			System.out.println("이 값은 양수입니다.");
		else if(n < 0)
			System.out.println("이 값은 음수입니다.");
		else
			System.out.println("이 값은 0입니다.");
		
		stdIn.close();		
	}
}
