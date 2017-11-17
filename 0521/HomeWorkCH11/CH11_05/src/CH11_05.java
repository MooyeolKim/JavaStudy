import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class CH11_05 extends JFrame{
	Container contentPane;
	JLabel la = new JLabel();
	JTextField tf = new JTextField(10);
	
	CH11_05(){
		setTitle("Focus Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		la.setText("�Է��� �� �ٸ� â�� ���콺 Ŭ���ϸ� �빮�ڷ� ���մϴ�.");
		contentPane.add(la);
		
		tf.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				//JTextField t = (JTextField)e.getSource();
				//t.setText(t.getText().toUpperCase());
				tf.setText(tf.getText().toUpperCase());
			}
		});
		
		contentPane.add(tf);
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new CH11_05();
	}
}
