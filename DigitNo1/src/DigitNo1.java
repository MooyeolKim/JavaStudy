import java.util.Scanner;

public class DigitNo1 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값: ");
		int n = stdIn.nextInt();
		
		if(n==0)
			System.out.println("0입니다.");
		else if(n>=-9 && n<=9)
			System.out.println("1자릿수입니다.");
		else
			System.out.println("2자릿수 이상입니다.");
		
		stdIn.close();
	}

}
