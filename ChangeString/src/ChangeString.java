
public class ChangeString {
	public static void main(String [] args){
		String s1 = "ABC";
		String s2 = "XYZ";
		s1 = "XYZ";
//		s1 = s2;
		System.out.println("���ڿ� s1 = " + s1);
		System.out.println("���ڿ� s2 = " + s2);
		System.out.println("s1�� s2�� ���� ���ڿ� ���ͷ��� ����" + 
					((s1==s2) ? "�ϰ��ִ�." : "�����ʴ´�."));
	}
}
