import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CH12_03 extends JFrame{
	Container contentPane;
	
	CH12_03(){
		setTitle("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setLayout(null);
		
		ImageIcon apple = new ImageIcon("images/apple.jpg");
		JLabel imgLa = new JLabel(apple);
		imgLa.setSize(apple.getIconWidth(), apple.getIconHeight());
		imgLa.setLocation(10, 10);
		imgLa.addMouseMotionListener(new MouseAdapter(){
			public void mouseDragged(MouseEvent e){
				JLabel la = (JLabel)e.getSource();
				la.setLocation(e.getX(), e.getY());
			}
		});
		
		contentPane.add(imgLa);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		setSize(screenSize.width, screenSize.height);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new CH12_03();
	}
}
