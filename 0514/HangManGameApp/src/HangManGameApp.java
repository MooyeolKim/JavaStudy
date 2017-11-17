import java.io.*;
import java.util.*;

class Words{
	public final int WORDMAX = 25143;
	private String fileName;
	private Random r = new Random();
	
	public Words(String fileName){
		this.fileName = fileName;
	}
	
	public String getRandomWord(){
		BufferedReader in = null;
		try{
			in = new BufferedReader(new FileReader(fileName));
		} catch(FileNotFoundException e){
			System.out.println("file not found error");
			System.exit(0);
		}
		int n = r.nextInt(WORDMAX);
		return readWord(in, n);
	}
	
	private String readWord(BufferedReader in, int n){
		String line = null;
		try{
			while(n>0){
				line = in.readLine();
				if(line == null)
					break;
				n--;
			}
		} catch(IOException e){
			System.exit(0);
		}
		return line;
	}
}

public class HangManGameApp {
	public final int HIDDENCHAR = 2;
	StringBuffer hiddenWord;
	String newWord;
	Scanner scanner;
	int failCount;
	
	public HangManGameApp(){
		scanner = new Scanner(System.in);
	}
	
	public void run(){
		System.out.println("지금부터 행맨 게임을 시작합니다.");
		Words words = new Words("words.txt");
		while(true){
			newWord = words.getRandomWord();
			if(newWord == null) break;
			makeHidden();
			go();
			System.out.print("Next(y/n)?");
			String answer = scanner.next();
			if(answer.equals("n"))
				break;
		}
	}
	
	void makeHidden(){
		hiddenWord = new StringBuffer(newWord);
		Random r = new Random();
		char c = ' ';
		for(int k=0 ; k<HIDDENCHAR ; k++){
			int index;
			do{
				index = r.nextInt(newWord.length());
			} while(c == newWord.charAt(index));
			c = newWord.charAt(index);
			for(int i=0 ; i<newWord.length() ; i++){
				if(hiddenWord.charAt(i) == c)
					hiddenWord.setCharAt(i, '-');
			}
		}
	}
	
	void go() {
		failCount = 0;
		char key;
		do{
			if(failCount == 5){
				System.out.println("5번 실패 하였습니다.");
				break;
			}
			System.out.println(hiddenWord);
			System.out.print(">>");
			String text = scanner.next();
			key = text.charAt(0);
		} while(!complete(key));
		System.out.println(newWord);
	}
	
	boolean complete(char key){
		boolean hit = false;
		for(int i=0 ; i<newWord.length() ; i++){
			if(hiddenWord.charAt(i) == '-' && newWord.charAt(i) == key){
				hiddenWord.setCharAt(i, key);
				hit = true;
			}
		}
		if(!hit)
			failCount++;
		for(int i=0 ; i<newWord.length() ; i++){
			if(hiddenWord.charAt(i) == '-')
				return false;
		}
		System.out.println("축하합니다. 짝짝짝\n시도횟수 : " + failCount);
		return true;
	}
	
	public static void main(String [] args){
		HangManGameApp app = new HangManGameApp();
		app.run();
	}
}
