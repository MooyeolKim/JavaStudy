import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CH10_05 extends JFrame{
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel();
	int size = 10;
	
	CH10_05(){
		setTitle("+, - 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setContentPane(contentPane);
		la.setText("Love Java " + size + "pt");
		la.setSize(100, 20);
		la.setFont(new Font("Arial", Font.PLAIN, size));
		la.addKeyListener(new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_RIGHT){
					size += 5;
					la.setText("Love Java " + size + "pt");
					la.setFont(new Font("Arial", Font.PLAIN, size));
				}
				if(e.getKeyCode() == KeyEvent.VK_LEFT){
					size -= 5;
					la.setText("Love Java " + size + "pt");
					la.setFont(new Font("Arial", Font.PLAIN, size));
				}
			}
			
			public void keyTyped(KeyEvent e){}
			public void keyReleased(KeyEvent e){}
		});
		contentPane.add(la);
				
		setSize(500, 300);
		setVisible(true);
		
		la.requestFocus(true);
	}
	
	public static void main(String [] args){
		new CH10_05();
	}
}
