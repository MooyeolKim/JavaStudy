import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class CH11_03 extends JFrame{
	Container contentPane;
	String[] text = {"오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"};
	int[] measure = {50000, 10000, 1000, 500, 100, 50, 10, 1};
	JLabel label = new JLabel();
	JLabel[] la = new JLabel[text.length];
	JTextField textField = new JTextField();
	JTextField[] tf = new JTextField[text.length];
	
	JPanel panel = new JPanel();
	
	CH11_03(){
		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 20));
		contentPane.setBackground(Color.PINK);
		
		for(int i=0 ; i<text.length ; i++){
			la[i] = new JLabel();
			tf[i] = new JTextField();
		}
		label.setText("금액");
		label.setHorizontalAlignment(label.CENTER);
		JButton btn = new JButton();
		btn.setText("계산");
		btn.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				int intText = Integer.parseInt(textField.getText());
				for(int i=0 ; i<text.length ; i++){
					tf[i].setText(Integer.toString(intText/measure[i]));
					//intText = intText - measure[i]*(intText/measure[i]);
					intText = intText%measure[i];
				}
			}
		});
		textField.setColumns(13);
		contentPane.add(label);
		contentPane.add(textField);
		contentPane.add(btn);
		panel.setSize(20, 300);
		panel.setLayout(new GridLayout(8, 3, 20, 0));
		panel.setBackground(Color.PINK);
		for(int i=0 ; i<text.length ; i++){
			la[i].setText(text[i]);
			la[i].setSize(40, 10);
			la[i].setHorizontalAlignment(la[i].RIGHT);
			tf[i].setColumns(10);
			panel.add(la[i]);
			panel.add(tf[i]);			
			contentPane.add(panel);
		}
		setSize(440, 400);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new CH11_03();
	}
}
