
public class PortablePlayer implements Player, Skinnable {
	private int skin = BLACK;
	public PortablePlayer(){}
	
	public void play(){
		System.out.println("◆ 재생시작!");
	}
	public void stop(){
		System.out.println("◆ 재생종료!");
	}
	
	public void changeSkin(int skin){
		System.out.print("스킨을 ");
		switch(skin){
		case BLACK:
			System.out.print("검정");
			break;
		case RED:
			System.out.print("빨강");
			break;
		case GREEN:
			System.out.print("녹색");
			break;
		case BLUE:
			System.out.print("파랑");
			break;
		case LEOPARD:
			System.out.print("표범 무늬");
			break;
		default:
			System.out.print("기본값");
			break;
		}
		System.out.println("(으)로 변경했습니다.");
	}
	
}
