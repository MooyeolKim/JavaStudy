import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetHistogramApp {
	int[] histoData = new int[26];
	StringBuffer sb = new StringBuffer();
	
	public AlphabetHistogramApp(){
		for(int i=0 ; i<histoData.length ; i++){
			histoData[i] = 0;
		}
	}
	
	public void run(){
		readString();
		makeHistogram();
		drawHistogram();
	}
	
	public void readString(){
		InputStreamReader rd = new InputStreamReader(System.in);
		try{
			while(true){
				int c = rd.read();
				if(c == -1)
					break;
				sb.append((char)c);
			}
		} catch(IOException e){
			System.out.println("입력 에러 발생");
		}
	}
	
	public void makeHistogram(){
		String s = sb.toString();
		s = s.toUpperCase();
		
		for(int i=0 ; i<s.length() ; i++){
			char c = s.charAt(i);
			if(c>='A' && c<='Z'){
				int index = c - 'A';
				histoData[index]++;
			}
		}
	}
	
	public void drawHistogram(){
		System.out.println("\n히스토그램을 그립니다.");
		for(int i=0 ; i<histoData.length ; i++){
			System.out.print((char)('A' + i));
			
			for(int j=0 ; j<histoData[i] ; j++)
				System.out.print('-');
			System.out.println();
		}
	}
	
	public static void main(String [] args){
		AlphabetHistogramApp app = new AlphabetHistogramApp();
		app.run();
	}
}
