import java.util.Scanner;

public class Equal {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수a : ");	int a = stdIn.nextInt();
		System.out.print("정수b : ");	int b = stdIn.nextInt();
		
		if(a == b)
			System.out.println("두 값은 같습니다.");
		else
			System.out.println("두 값은 다릅니다.");
		
		stdIn.close();
		
	}

}
