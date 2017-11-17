
/**
 * 클래스 Point는 점을 나타내는 클래스입니다.
 * 이 클래스는 도형을 나타내는 클래스 Shape로부터 파생된 클래스입니다.
 * 필드는 없습니다.
 * @author 김무열
 * @see Shape
 */

public class Point extends Shape {
	
	/**
	 * 점을 생성하는 생성자입니다.
	 * 전달 받는 인수는 없습니다.
	 */
	public Point(){}
	
	/**
	 * 메소드 toString은 점에 관한 도형 정보를 나타내는 문자열을 반환합니다.
	 * 반환하는 문자열은 항상 "Point"입니다.
	 * @return 문자열 "Point"를 반환합니다.
	 */
	public String toString(){
		return "Point";
	}
	
	/**
	 * 메소드 draw는 점을 그리는 메소드입니다.
	 * 플러스 기호 '+'를 1개만 표시하고 줄 바꿈을 합니다.
	 */
	public void draw() {
		System.out.println('+');
	}
	
}
