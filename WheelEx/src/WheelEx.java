import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WheelEx extends JFrame{
	JPanel contentPane = new JPanel();
	
	WheelEx(){
		setTitle("Wheel ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.addMouseWheelListener(new MyMouseListener());
		setSize(600, 500);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter{
		public void mouseWheelMoved(MouseWheelEvent e){
			int r = (int)(Math.random()*256);
			int g = (int)(Math.random()*256);
			int b = (int)(Math.random()*256);
			
			JPanel p = (JPanel)e.getSource();
			p.setBackground(new Color(r, g, b));
		}
	}
	
	public static void main(String [] args){
		new WheelEx();
	}
}
