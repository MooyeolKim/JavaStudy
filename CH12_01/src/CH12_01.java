import javax.swing.*;
import java.awt.*;

public class CH12_01 extends JFrame{
	Container contentPane;
	CH12_01(){
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		JButton btn = new JButton("Hello");
		panel.add(btn);
		setSize(400, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		ImageIcon icon = new ImageIcon("images/a.jpg");
		Image img = icon.getImage();
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
			
	}
	
	public static void main(String [] args){
		new CH12_01();
	}
}
