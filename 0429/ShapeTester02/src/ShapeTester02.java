
public class ShapeTester02 {
	public static void main(String [] args){
		Shape [] p = new Shape[5];
		
		p[0] = new Point();
		p[1] = new HorzLine(5);
		p[2] = new VirtLine(3);
		p[3] = new Rectangle(4, 3);
		p[4] = new Parallelogram(8, 3);
		
		for(Shape s : p){
			s.print();
			if(s instanceof Plane2D)
				System.out.println("Area : " + ((Plane2D)s).getArea());
				
			System.out.println();
		}
	}
}
