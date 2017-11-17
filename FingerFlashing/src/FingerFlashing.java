import java.util.Random;
import java.util.Scanner;


public class FingerFlashing {
	public static void main(String [] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		String[] hands = {"가위", "바위", "보"};
		int retry;
		
		do{
			int comp = rand.nextInt(3);
			
			int user;
			do {
				System.out.print("가위바위보");
				for(int i=0 ; i<3 ; i++)
					System.out.printf("(%d)%s ", i, hands[i]);
				System.out.print(" : ");
				user = stdIn.nextInt();
			}while(user < 0 || user > 2);
			
			System.out.println("나는 " + hands[comp] + "이고, 당신은 "+ 
								hands[user] + "입니다.");
			
			int judge = (user - comp + 3)%3;
			switch(judge){
			case 0:
				System.out.println("비겼습니다.");
				break;
			case 1:
				System.out.println("당신이 이겼습니다.");
				break;
			case 2:
				System.out.println("당신이 졌습니다.");
				break;
			}
			
			do{
				System.out.print("한번 더? (0)아니오 (1)예 : ");
				retry = stdIn.nextInt();
			}while(retry != 0 && retry != 1);
		}while(retry == 1);
	}
}
