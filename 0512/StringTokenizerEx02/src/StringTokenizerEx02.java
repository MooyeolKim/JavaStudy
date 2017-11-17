import java.util.StringTokenizer;


public class StringTokenizerEx02 {
	public static void main(String[] args){
		int sum = 0;
		
		String query = "2+3+5+66+88+323";
		StringTokenizer st = new StringTokenizer(query, "+");
		
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token);
			sum += Integer.parseInt(token);
		}
		
		System.out.println("гу╟Х " + sum);
	}
}
