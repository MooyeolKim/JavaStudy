import java.util.Scanner;

public class SwitchBreak {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		int n = stdIn.nextInt();
		
		switch(n){
		case 0:
			System.out.print("A");
			System.out.print("B");
			break;
		case 2:
			System.out.print("C");
		case 5:
			System.out.print("D");
			break;
		case 6:
		case 7:
			System.out.print("E");
			break;
		default:
			System.out.print("F");
			break;
		}
		System.out.println();
		stdIn.close();
	}
}
