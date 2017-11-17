import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CH10_02 extends JFrame {
	JPanel contentPane = new JPanel();
	
	CH10_02(){
		setTitle("µå·¡±ëµ¿¾È YELLO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setBackground(Color.GREEN);
		contentPane.addMouseMotionListener(new MyMouseListener());
		contentPane.addMouseListener(new MyMouseListener());
				
		setSize(400, 400);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter{
		public void mouseDragged(MouseEvent e){
			contentPane.setBackground(Color.YELLOW);
		}
		
		public void mouseReleased(MouseEvent e){
			contentPane.setBackground(Color.GREEN);
		}
	}
	
	public static void main(String [] args){
		new CH10_02();
	}
}
