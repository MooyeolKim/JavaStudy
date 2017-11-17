import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class ListenerMouseEx extends JFrame{
	ListenerMouseEx(){
		setTitle("��ư�� Mouse �̺�Ʈ ������ �ۼ�");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Mouse Event �׽�Ʈ ��ư");
		btn.setBackground(Color.YELLOW);
		MyMouseListener listener = new MyMouseListener();
		btn.addMouseListener(listener);
		
		add(btn);
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new ListenerMouseEx();
	}
}

class MyMouseListener implements MouseListener{
	public void mouseEntered(MouseEvent e){
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.RED);
	}

	public void mouseExited(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.YELLOW);
	}

	public void mouseClicked(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		if(btn.getBackground() == Color.YELLOW)
			btn.setBackground(Color.YELLOW);
		else
			btn.setBackground(Color.RED);
	}
	
	public void mousePressed(MouseEvent arg0) {}
	public void mouseReleased(MouseEvent arg0) {}
}
