import java.util.Random;
import java.util.Scanner;


public class LinearSearch {
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		final int n = 12;
		int[] a = new int[n];
		
		for(int j=0 ; j<n ; j++)
			a[j] = rand.nextInt(10);
		
		System.out.print("배열 a의 모든 요소의 값\n{ ");
		for(int j=0 ; j<n ; j++)
			System.out.print(a[j] + " ");
		System.out.println("}");
		
		System.out.print("검색할 수치 : ");
		int key = stdIn.nextInt();
		
		int i;
		for(i=0 ; i<n ; i++){
			if(a[i] == key)
				break;
		}
		
		if(i<n)
			System.out.println("이것은 a[" + i + "]에 있습니다.");
		else
			System.out.println("이것은 없습니다.");
	}
}
