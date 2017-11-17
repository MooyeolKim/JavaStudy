

/**
 * 클래스 AbstLine은 직선을 나타내는 추상 클래스입니다.
 * 이 클래스는 도형을 나타내는 추상 클래스 Shape로부터 파생된 클래스입니다.
 * 추상 클래스이기 때문에 이 클래스의 인스턴스를 생성할 수는 없습니다.
 * 구체적인 직선 클래스는 이 클래스로부터 파생됩니다.
 * @author 김무열
 * @see Shape
 * @see HorzLine Virtline
*/
public abstract class AbstLine extends Shape {
	
	/**
	 * 직선의 길이를 나타내는 int형 필드입니다.	
	 */
	private int length;
	
	/**
	 * 직선을 생성하는 생성자입니다.
	 * 길이를 인수로 전달받습니다.
	 * @param length 생성할 직선의 길이.
	 */
	public AbstLine(int length){
		setLength(length);
	}
	
	/**
	 * 직선의 길이를 취득합니다.
	 * @return 직선의 길이
	 */
	public  int getLength(){
		return length;
	}
	
	/**
	 * 직선의 길이를 설정합니다.
	 * @param length 설정할 직선의 길이.
	 */
	public void setLength(int length){
		this.length = length;
	}

	/**
	 * 메소드 toString은 직선에 관한 도형 정보를 나타내는 문자열을 반환합니다.
	 * @return 문자열 "AbstLine(length:3)"을 반환합니다.
	 * 			3은 길이의 값입니다.
	 */
	
	public String toString(){
		return "AbstLine(length : " + length + ")";
	}
}
