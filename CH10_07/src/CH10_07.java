import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CH10_07 extends JFrame{
	JPanel contentPane = new JPanel();
	JLabel la;
	int size = 10;
	
	CH10_07(){
		setTitle("마우스 활용 굴려 폰트크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		la = new JLabel("Love Java " + size + "pt");
		la.setFont(new Font("Arial", Font.PLAIN, size));
		la.setSize(100, 20);
		la.addMouseWheelListener(new MouseAdapter(){
			public void mouseWheelMoved(MouseWheelEvent e){
				int n = e.getWheelRotation();
				if(n < 0){
					size -= 5;
					la.setText("Love Java " + size + "pt");
					la.setFont(new Font("Arial", Font.PLAIN, size));
				}
				else{
					size += 5;
					la.setText("Love Java " + size + "pt");
					la.setFont(new Font("Arial", Font.PLAIN, size));
				}
			}
		});
		contentPane.add(la);
		setSize(400, 400);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new CH10_07();
	}
}
