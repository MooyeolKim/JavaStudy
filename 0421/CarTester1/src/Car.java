
public class Car {
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	
	Car(String name, int width, int height, int length, double fuel){
		this.name = name; this.width = width; this.height = height; this.length = length;
		this.fuel = fuel; x=y=0.0;
	}
	
	double getX(){
		return x;
	}
	
	double getY(){
		return y;
	}
	
	double getFuel(){
		return fuel;
	}
	
	void putSpec(){
		System.out.println("이름 : " + name);
		System.out.println("차 너비 : " + width + "mm");
		System.out.println("차 높이 : " + height + "mm");
		System.out.println("차 길이 : " + length + "mm");
	}
	
	boolean move(double dx, double dy){
		double dist = Math.sqrt(dx*dx + dy*dy);
		
		if(dist>fuel)
			return false;
		else{
			fuel -= dist;
			x += dx;
			y += dy;
			return true;
		}
	}
}
