import java.io.*;


public class JPGCopy {
	public static void main(String [] args){
		File src = new File("a.jpg");
		File dst = new File("C:\\b.jpg");
		FileInputStream fi = null;
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		int c;
		
		try{
			in = new BufferedInputStream(new FileInputStream(src));
			out = new BufferedOutputStream(new FileOutputStream(dst));
			byte[] b = new byte[1024];
			int cnt = 1;
			while((c = in.read(b)) != -1){
				out.write(b, 0, c);
			}
			in.close();
			out.close();
		} catch(IOException e){
			System.out.println("입출력 오류");
		}
		
	}
}
