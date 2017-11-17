import javax.swing.*;
import java.awt.*;

public class CH12_CheckTime extends JFrame{
	Container contentPane;
	
	CH12_CheckTime(){
		setTitle("CheckTime");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(200, 600);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawLine(10, 10, 130, 130);
			g.drawOval(10, 220, 110, 200);
			g.setColor(Color.RED);
			int[] x = {60, 10, 110};
			int[] y = {100, 150, 200};
			g.fillPolygon(x, y, 3);
			g.fillArc(10, 450, 100, 100, 90, 120);
			g.setColor(Color.BLUE);
			g.fillArc(10, 450, 100, 100, 210, 120);
			g.setColor(Color.YELLOW);
			g.fillArc(10, 450, 100, 100, 330, 120);
		}
	}
	
	public static void main(String [] args){
		new CH12_CheckTime();
	}
}
