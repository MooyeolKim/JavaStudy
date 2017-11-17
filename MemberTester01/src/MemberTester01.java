
public class MemberTester01 {
	public static void main(String [] args){
		Member[] m = {
				new Member("하나", 101, 27),
				new SpecialMember("두리", 102, 31, "회비 무료"),
				new SpecialMember("아름", 103, 52, "회비 무료"),
				new SpecialMember("무열", 104, 25, "회비 무료")
		};
		
		for(Member k : m){
			k.print();
			System.out.println();
		}
	}
}
