
public class CarTester02 {
	public static void main(String[] args){
		Car myCar = new Car("마이카", 1885, 1490, 5220, 90.0,
				new Day(2000, 11, 18));
		
		myCar.putSpec();
		System.out.println("구입일 : " + 
					myCar.getPurchaseDay());
	}
}
