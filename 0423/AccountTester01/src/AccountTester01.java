public class AccountTester01 {
	public static void main(String[] args){

		Account chulsoo = new Account("철수", "123456", 1000);
		Account younghee = new Account("영희", "654321", 200);
		Account mooyeol = new Account("무열", "121212", 999999999);
		
		chulsoo.withdraw(200);
		younghee.deposit(100);
				
		System.out.println("■ 철수의 계좌");
		System.out.println("  계좌명의 : " + chulsoo.getName());
		System.out.println("  계좌번호 : " + chulsoo.getNo());
		System.out.println("  예금잔고 : " + chulsoo.getBalance());
		System.out.println("  식별번호 : " + chulsoo.getId());
		
		System.out.println("■ 영희의 계좌");
		System.out.println("  계좌명의 : " + younghee.getName());
		System.out.println("  계좌번호 : " + younghee.getNo());
		System.out.println("  예금잔고 : " + younghee.getBalance());
		System.out.println("  식별번호 : " + younghee.getId());
		
		System.out.println("■ 무열의 계좌");
		System.out.println("  계좌명의 : " + mooyeol.getName());
		System.out.println("  계좌번호 : " + mooyeol.getNo());
		System.out.println("  예금잔고 : " + mooyeol.getBalance());
		System.out.println("  식별번호 : " + mooyeol.getId());
	
	}
}