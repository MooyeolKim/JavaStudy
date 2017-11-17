import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyCodeEx extends JFrame{
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel();
	
	KeyCodeEx(){
		setTitle("Key Code���� : F1Ű(�ʷϻ�), %Ű(�����)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.addKeyListener(new MyKeyListener());
		contentPane.add(la);
		setSize(500, 300);
		setVisible(true);
		
		contentPane.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			KeyEvent ke = e;
			//if(ke == KeyEvent.VK_SHIFT && e.getKeyCode())
			la.setText(e.getKeyText(e.getKeyCode()) + "Ű�� �ԷµǾ���");
			
			if(e.getKeyChar() == '%')
			//if(e.getKeyCode() == KeyEvent.VK_5)
				contentPane.setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				contentPane.setBackground(Color.GREEN);
		}
	}
	
	public static void main(String [] args){
		new KeyCodeEx();
	}
}
