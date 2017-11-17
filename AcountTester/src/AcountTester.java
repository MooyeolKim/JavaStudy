class Account{
	private String name;
	private String no;
	private long balance;
		
	Account(String n, String num, long z){
		name = n;
		no = num;
		balance = z;
	}
	
	
	String getName(){
		return name;
	}
	
	String getNo(){
		return no;
	}
	
	long getBalance(){
		return balance;
	}
	
	void deposit(long k){
		balance += k;
	}
	
	void withdraw(long k){
		balance -= k;
	}
}

public class AcountTester {
	public static void main(String[] args){
/*		Account chulsoo = new Account();
		Account younghee = new Account();
		
		chulsoo.name = "ö��";
		chulsoo.no = "123456";
		chulsoo.balance = 1000;
		
		younghee.name = "����";
		younghee.no = "654321";
		younghee.balance = 200;
		
		chulsoo.balance -= 200;
		younghee.balance += 100;
		
		System.out.println("�� ö���� ����");
		System.out.println("  ���¸��� : " + chulsoo.name);
		System.out.println("  ���¹�ȣ : " + chulsoo.no);
		System.out.println("  �����ܰ� : " + chulsoo.balance);
		
		System.out.println("�� ������ ����");
		System.out.println("  ���¸��� : " + younghee.name);
		System.out.println("  ���¹�ȣ : " + younghee.no);
		System.out.println("  �����ܰ� : " + younghee.balance);
*/
		Account chulsoo = new Account("ö��", "123456", 1000);
		Account younghee = new Account("����", "654321", 200);
		
		chulsoo.withdraw(200);
		younghee.deposit(100);
				
		System.out.println("�� ö���� ����");
		System.out.println("  ���¸��� : " + chulsoo.getName());
		System.out.println("  ���¹�ȣ : " + chulsoo.getNo());
		System.out.println("  �����ܰ� : " + chulsoo.getBalance());
		
		System.out.println("�� ������ ����");
		System.out.println("  ���¸��� : " + younghee.getName());
		System.out.println("  ���¹�ȣ : " + younghee.getNo());
		System.out.println("  �����ܰ� : " + younghee.getBalance());
	}
}
