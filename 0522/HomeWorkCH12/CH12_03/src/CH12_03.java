import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CH12_03 extends JFrame{
	Container contentPane;
	
	CH12_03(){
		setTitle("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setLayout(null);
		
		ImageIcon apple = new ImageIcon("images/image0.jpg");
		JLabel imgLa = new JLabel(apple);
		imgLa.setSize(apple.getIconWidth(), apple.getIconHeight());
		imgLa.setLocation(10, 10);
		MyMouseListener ml = new MyMouseListener();
		imgLa.addMouseListener(ml);
		imgLa.addMouseMotionListener(ml);
		
		contentPane.add(imgLa);
		
		setSize(500, 600);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter{
		Point startP = new Point();
		Point endP = new Point();
		public void mousePressed(MouseEvent e){
			startP = e.getPoint();
		}
		public void mouseReleased(MouseEvent e){
			endP = e.getPoint();
		}
		/*public void mouseDragged(MouseEvent e){
			endP = e.getPoint();
			JLabel la = (JLabel)(e.getSource());
			Point p = la.getLocation();
			la.setLocation(p.x + endP.x - startP.x, p.y + endP.y - startP.y );
		}*/
		public void mouseDragged(MouseEvent e){
			JLabel la = (JLabel)e.getSource();
			la.setLocation(endP.x + e.getX() - startP.x, endP.y + e.getY() - startP.y);
		}
	}
	
	public static void main(String [] args){
		new CH12_03();
	}
}
