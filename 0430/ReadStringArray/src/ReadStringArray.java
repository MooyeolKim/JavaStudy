import java.util.Scanner;


public class ReadStringArray {
	public static void main(String [] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("문자열의 개수 : ");
		int n = stdIn.nextInt();
		String[] sx = new String[n];
		
		for(int i=0 ; i<sx.length ; i++){
			System.out.print("sx[" + i + "] = ");
			sx[i] = stdIn.next();
		}
		
		for(int i=0 ; i<sx.length ; i++){
			System.out.println("sx[" + i + "] = \"" + sx[i] + "\"");
		}
	}
}
