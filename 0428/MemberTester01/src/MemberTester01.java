
public class MemberTester01 {
	public static void main(String [] args){
		Member[] m = {
				new Member("�ϳ�", 101, 27),
				new SpecialMember("�θ�", 102, 31, "ȸ�� ����"),
				new SpecialMember("�Ƹ�", 103, 52, "ȸ�� ����"),
				new SpecialMember("����", 104, 25, "ȸ�� ����")
		};
		
		for(Member k : m){
			k.print();
			System.out.println();
		}
	}
}
