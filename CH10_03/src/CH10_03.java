import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class CH10_03 extends JFrame{
	JPanel contentPane = new JPanel();
	JLabel la;
	String st = new String("Love Java");
	
	CH10_03(){
		setTitle("Left키로 문자열 바꾸기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setContentPane(contentPane);
		la = new JLabel();
		la.setText(st);
		contentPane.addKeyListener(new KeyListener(){			
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT){
					StringBuffer sb = new StringBuffer(st);
					st = new String(sb.reverse());
					la.setText(st);
				}		
			}

			public void keyTyped(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
			
		});
		contentPane.add(la);
		
		setSize(400, 200);
		setVisible(true);
		
		contentPane.requestFocus(true);	
	}
	
	public static void main(String [] args){
		new CH10_03();
	}
	
}
