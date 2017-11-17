import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class FlyingTextEx extends JFrame{
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel("Hello");
	final int FLYING_UNIT = 10;
	final int FRAME_HSIZE = 300;
	final int FRAME_WSIZE = 300;
	
	FlyingTextEx(){
		setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addKeyListener(new MyKeyListener());
		la.setLocation(50, 50);
		la.setSize(100, 20);
		contentPane.add(la);
		setSize(FRAME_HSIZE, FRAME_WSIZE);
		setVisible(true);
		contentPane.requestFocus();
	}
	
	//움직이지않게 하는 경우
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			int x = la.getX();
			int y = la.getY();
			
			
			switch(e.getKeyCode()){
			case KeyEvent.VK_UP:
				y = la.getY()-FLYING_UNIT;
				break;
			case KeyEvent.VK_DOWN:
				y = la.getY()+FLYING_UNIT;
				break;
			case KeyEvent.VK_LEFT:
				x = la.getX()-FLYING_UNIT;
				break;
			case KeyEvent.VK_RIGHT:
				x = la.getX()+FLYING_UNIT;
				break;
			}
			
			if(x < 0) x = 0;
			if(x + 30 > contentPane.getWidth()) x -= FLYING_UNIT;
			if(y < 0) y = 0;
			if(y + la.getHeight() > contentPane.getHeight()) y -= FLYING_UNIT;

			
			la.setLocation(x, y);
		}
	}
	
	//반대편으로 나오는 경우
	/*class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			int x = la.getX();
			int y = la.getY();
			
			
			switch(e.getKeyCode()){
			case KeyEvent.VK_UP:
				y = la.getY()-FLYING_UNIT;
				break;
			case KeyEvent.VK_DOWN:
				y = la.getY()+FLYING_UNIT;
				break;
			case KeyEvent.VK_LEFT:
				x = la.getX()-FLYING_UNIT;
				break;
			case KeyEvent.VK_RIGHT:
				x = la.getX()+FLYING_UNIT;
				break;
			}
			
			if(x < -30) x = contentPane.getWidth();
			if(x > contentPane.getWidth()) x = (-30);
			if(y < -la.getHeight()) y = contentPane.getHeight();
			if(y > contentPane.getHeight()) y = (-la.getHeight());

			
			la.setLocation(x, y);
		}
	}*/
	
	public static void main(String [] args){
		new FlyingTextEx();
	}
}
