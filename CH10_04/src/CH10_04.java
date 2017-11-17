import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CH10_04 extends JFrame{
	JPanel contentPane = new JPanel();
	JLabel la;
	String st = new String("Love Java");
	
	CH10_04(){
		setTitle("Left키로 문자열 바꾸기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		la = new JLabel(st);
		contentPane.add(la);
		contentPane.addKeyListener(new KeyListener(){
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT){
					st = st.substring(1) + st.substring(0, 1);
					la.setText(st);
				}		
			}

			public void keyTyped(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
			
		});
		
		setSize(400, 200);
		setVisible(true);
		
		contentPane.requestFocus(true);		
	}
	
	public static void main(String [] args){
		new CH10_04();
	}
}
