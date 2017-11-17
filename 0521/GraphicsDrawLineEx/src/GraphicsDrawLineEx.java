import java.awt.*;
import javax.swing.*;

public class GraphicsDrawLineEx extends JFrame{
	Container contentPane;
	GraphicsDrawLineEx(){
		setTitle("drawLine 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 600);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawLine(20, 20, 100, 100);
			g.drawOval(20, 120, 80, 80);
			g.drawRect(20, 220, 80, 80);
			g.drawRoundRect(20, 320, 120, 80, 40, 60);
			g.drawArc(20, 420, 80, 80, 90, 270);
			g.drawArc(21, 421, 80, 80, 90, 270);
			g.drawArc(19, 419, 80, 80, 90, 270);
			int[] x = {180, 140, 180, 220};
			int[] y = {40, 120, 200, 120};
			g.drawPolygon(x, y, 4);
		}
	}
	
	public static void main(String [] args){
		new GraphicsDrawLineEx();
	}
}
