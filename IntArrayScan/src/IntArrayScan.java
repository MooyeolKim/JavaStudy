import java.util.Scanner;

public class IntArrayScan {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("¿ä¼Ò ¼ö : ");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for(int i=0 ; i<a.length ; i++){
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		
		for(int i=0 ; i<a.length ; i++){
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
