import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class MouseListenerEx extends JFrame{
	JPanel contentPane = new JPanel();
	JLabel la;
	
	MouseListenerEx(){
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLayout(null);
		//contentPane.addMouseListener(new MyMouseListener());
		contentPane.addMouseListener(new MouseListener(){
		//addMouseListener(new MouseListener(){
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x, y);
			}
			
			public void mouseReleased(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
		la = new JLabel("hello");
		la.setSize(50, 20);
		la.setLocation(30,  30);
		contentPane.add(la);
		//add(la);
		setSize(500, 500);
		setVisible(true);
	}
	
	/*class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
		
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}*/
	
	public static void main(String [] args){
		new MouseListenerEx();
	}

}
