import java.util.GregorianCalendar;
//import static java.util.GregorianCalendar.*;

class DateId{
	private static int counter;
	private int id;
	
	static{
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(GregorianCalendar.YEAR);
		int m = today.get(GregorianCalendar.MONTH)+1;
		int d = today.get(GregorianCalendar.DATE);
		
		System.out.printf("오늘은 %04d년 %02d월 %02d일입니다.\n", y, m, d);
		counter = y*1000000 + m*10000 + d*100;
	}
	
	public DateId(){
		id = ++counter;
	}
	public int getId(){
		return id;
	}
}

public class DateIdTester {
	public static void main(String[] args){
		DateId a = new DateId();
		DateId b = new DateId();
		DateId c = new DateId();
		
		System.out.println("a의 식별번호 : " + a.getId());
		System.out.println("b의 식별번호 : " + b.getId());
		System.out.println("c의 식별번호 : " + c.getId());
	}
}
