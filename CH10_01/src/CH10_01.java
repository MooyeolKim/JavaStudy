import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CH10_01 extends JFrame{
	JPanel contentPane = new JPanel();
	JLabel la;
	
	CH10_01(){
		setTitle("마우스 올리기 내리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		la = new JLabel("Love Java");
		la.setSize(100, 50);
		la.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e){
				la.setText("사랑해");
			}
			
			public void mouseExited(MouseEvent e){
				la.setText("Love Java");
			}
		});
		contentPane.add(la);
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new CH10_01();
	}
}
