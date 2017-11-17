import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx1 extends JFrame{
	Container contentPane;
	GraphicsDrawImageEx1(){
		setTitle("drawImage 사용 예제 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		ImageIcon icon = new ImageIcon("images/image0.jpg");
		Image img = icon.getImage();
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			//g.drawImage(img, 20, 20, this);
			//g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.drawImage(img, 20, 20, 250, 100, 100, 50, 200, 200, this);
			
		}
	}
	
	public static void main(String [] args){
		new GraphicsDrawImageEx1();
	}
}
