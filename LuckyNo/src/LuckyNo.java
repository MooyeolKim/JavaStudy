import java.util.Random;

public class LuckyNo {
	public static void main(String[] args){
		Random rand = new Random();
		
		int lucky = rand.nextInt(45)+1;
		
		System.out.println("������ ����� ���ڴ� " + lucky + "�Դϴ�.");
	}
}
