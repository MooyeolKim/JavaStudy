import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CH12_02 extends JFrame{
	Container contentPane;
	
	CH12_02(){
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
			
		setSize(400, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		ImageIcon icon = new ImageIcon("images/a.jpg");
		Image img = icon.getImage();
		int x = 0;
		int y = 0;
		
		public MyPanel(){
			addMouseMotionListener(new MouseAdapter(){
				public void mouseDragged(MouseEvent e){
					x = e.getX();
					y = e.getY();
					
					repaint();
				}
			});
		}
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.GREEN);
			g.fillOval(x, y, 20, 20);
		}
			
	}
	
	public static void main(String [] args){
		new CH12_02();
	}
}
