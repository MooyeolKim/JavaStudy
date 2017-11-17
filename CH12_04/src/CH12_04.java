import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class CH12_04 extends JFrame{
	Container contentPane;
	
	CH12_04(){
		setTitle("그래픽 이미지 확대 축소 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(400, 400);
		setVisible(true);
		
		panel.requestFocus();
	}
	
	class MyPanel extends JPanel{
		ImageIcon icon = new ImageIcon("images/apple.jpg");
		Image img = icon.getImage();
		int width = 100;
		int height = 100;
		
		public MyPanel(){
			addKeyListener(new KeyAdapter(){
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar() == '+'){
						width = (int)(width*1.1);
						height = (int)(height*1.1);
						repaint();
					} else if(e.getKeyChar() == '-'){
						width = (int)(width*0.9);
						height = (int)(height*0.9);
						repaint();
					}
					
					
				}
			});
		}
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawImage(img, 10, 10, width, height, this);
		}
	}
	
	public static void main(String [] args){
		new CH12_04();
	}
}
