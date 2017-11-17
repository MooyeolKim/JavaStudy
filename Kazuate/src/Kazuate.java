import java.util.Scanner;
import java.util.Random;

public class Kazuate {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		int no = rand.nextInt(100);
		
		System.out.println("숫자 맞히기 게임 시작!!");
		System.out.println("0~99 사이의 수를 맞혀주세요.");
		
		int x;
		do{
			System.out.print("몇 일까요? : ");
			x = stdIn.nextInt();
			
			if(x > no)
				System.out.println("더 작은 수입니다.");
			else if(x < no)
				System.out.println("더 큰 수입니다.");
		}while(x != no);
		
		System.out.println("정답입니다.");
		
		stdIn.close();
	}
}
