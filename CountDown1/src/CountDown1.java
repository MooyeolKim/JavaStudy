import java.util.Scanner;

public class CountDown1 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("카운트 다운합니다.");
		int x;
		
		do{
			System.out.print("양의 정수값 : ");
			x = stdIn.nextInt();
		}while(x <= 0);
		
		/*while(x >= 0){
			System.out.println(x);
			x--;
		}*/
		
		while(x >= 0)
			System.out.println(x--);
			
		stdIn.close();
	}
}
