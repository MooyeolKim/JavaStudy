import java.util.Scanner;
import java.util.Random;

public class Kazuate {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		int no = rand.nextInt(100);
		
		System.out.println("���� ������ ���� ����!!");
		System.out.println("0~99 ������ ���� �����ּ���.");
		
		int x;
		do{
			System.out.print("�� �ϱ��? : ");
			x = stdIn.nextInt();
			
			if(x > no)
				System.out.println("�� ���� ���Դϴ�.");
			else if(x < no)
				System.out.println("�� ū ���Դϴ�.");
		}while(x != no);
		
		System.out.println("�����Դϴ�.");
		
		stdIn.close();
	}
}
