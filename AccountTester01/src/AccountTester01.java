public class AccountTester01 {
	public static void main(String[] args){

		Account chulsoo = new Account("ö��", "123456", 1000);
		Account younghee = new Account("����", "654321", 200);
		Account mooyeol = new Account("����", "121212", 999999999);
		
		chulsoo.withdraw(200);
		younghee.deposit(100);
				
		System.out.println("�� ö���� ����");
		System.out.println("  ���¸��� : " + chulsoo.getName());
		System.out.println("  ���¹�ȣ : " + chulsoo.getNo());
		System.out.println("  �����ܰ� : " + chulsoo.getBalance());
		System.out.println("  �ĺ���ȣ : " + chulsoo.getId());
		
		System.out.println("�� ������ ����");
		System.out.println("  ���¸��� : " + younghee.getName());
		System.out.println("  ���¹�ȣ : " + younghee.getNo());
		System.out.println("  �����ܰ� : " + younghee.getBalance());
		System.out.println("  �ĺ���ȣ : " + younghee.getId());
		
		System.out.println("�� ������ ����");
		System.out.println("  ���¸��� : " + mooyeol.getName());
		System.out.println("  ���¹�ȣ : " + mooyeol.getNo());
		System.out.println("  �����ܰ� : " + mooyeol.getBalance());
		System.out.println("  �ĺ���ȣ : " + mooyeol.getId());
	
	}
}