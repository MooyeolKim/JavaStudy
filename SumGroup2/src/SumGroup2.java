import java.util.Scanner;

public class SumGroup2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ ������ ����մϴ�.");
		int total = 0;
		
	Outer:
		for(int i=1 ; i<=10 ; i++){
			System.out.println("�� ��" + i + "�׷�");
			int sum = 0;
		
			for(int j=0 ; j<5 ; j++){
				System.out.print("���� : ");
				int t = stdIn.nextInt();
				if(t==99999)
					break Outer;
				else if(t==88888)
					continue Outer;
				total += t;
			}
		}
		System.out.println("\n�հ�� " + total + "�Դϴ�.");
	}
}