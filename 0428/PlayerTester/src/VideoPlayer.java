
public class VideoPlayer implements Player {
	private int id;
	private static int count = 0;
	
	public VideoPlayer(){
		id = ++count;
	}
	public void play(){
		System.out.println("■ 비디오 재생시작!");
	}
	public void stop(){
		System.out.println("■ 비디오 재생종료!");
	}
	public void printInfo(){
		System.out.println("이 기계의 제조번호는 [" + id + "]입니다.");
	}
}
