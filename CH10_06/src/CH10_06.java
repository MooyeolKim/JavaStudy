import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CH10_06 extends JFrame{
	JPanel contentPane = new JPanel();
	JLabel la;
	
	CH10_06(){
		setTitle("클릭 연습용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		la = new JLabel("C");
		la.setLocation(100, 100);
		la.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				la.setLocation((int)(Math.random()*350), (int)(Math.random()*350));
			}
		});
		la.setSize(100, 20);
		
		contentPane.add(la);
		setSize(400, 400);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new CH10_06();
	}
	
}
