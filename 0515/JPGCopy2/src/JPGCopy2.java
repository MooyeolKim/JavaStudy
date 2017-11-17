import java.io.*;


public class JPGCopy2 {
	public static void main(String [] args){
		File src = new File("a.jpg");
		File dst = new File("c:\\b.jpg");
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		int c;
		
		try{
			in = new BufferedInputStream(new FileInputStream(src));
			out = new BufferedOutputStream(new FileOutputStream(dst));
			int cnt=1;
			int srclen = (int)src.length()/10;
 			while((c = in.read()) != -1){
				out.write(c);
				System.out.print(cnt);
 			}
			in.close();
			out.close();
		} catch(IOException e){
			System.out.println("입출력 오류");
		}
		
	}
}
