import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class CH11_02 extends JFrame{
	JTextField tf = new JTextField(20);
	JComboBox tfbox = new JComboBox();
	
	CH11_02(){
		setTitle("JTextBox and JComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		tf.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {	
				tfbox.addItem(tf.getText());
				tf.setText("");
			}
		});
		
		add(tf);
		add(tfbox);
		
		setSize(500, 300);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new CH11_02();
	}
}
