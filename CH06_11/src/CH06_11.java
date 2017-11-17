import java.util.Random;
import java.util.Scanner;


public class CH06_11 {
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("요소 수(10 이하) : ");
			n = stdIn.nextInt();
		}while(n>10);
		
		int[] a = new int[n];
	
		for(int i=0 ; i<a.length ; i++){
			a[i] = 1 + rand.nextInt(10);
			for(int j=0 ; j<i ; j++){
				if(a[i] == a[j]){
//					a[i] = 1 + rand.nextInt(10);
//					j=-1;
					i--;
					break;
				}
			}
		}
				
		for(int i=0 ; i<a.length ; i++){
			System.out.printf("a[%d] = %-3d", i, a[i]);
			for(int j=0 ; j<a[i] ; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
