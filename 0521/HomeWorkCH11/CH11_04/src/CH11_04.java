import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class CH11_04 extends JFrame{
	Container contentPane;
	String[] text = {"오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"};
	int[] measure = {50000, 10000, 1000, 500, 100, 50, 10, 1};
	JLabel label = new JLabel();
	JLabel[] la = new JLabel[text.length];
	JTextField textField = new JTextField();
	JTextField[] tf = new JTextField[text.length];
	JButton btn = new JButton();
	JCheckBox[] cb = new JCheckBox[text.length];
	JPanel panel = new JPanel();
	int state;
	
	CH11_04(){
		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 20));
		contentPane.setBackground(Color.PINK);
		
		for(int i=0 ; i<text.length ; i++){
			la[i] = new JLabel();
			tf[i] = new JTextField();
			cb[i] = new JCheckBox();
		}
		label.setText("금액");
		label.setHorizontalAlignment(label.CENTER);
		btn.setText("계산");
		btn.setSize(70,	10);
		btn.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				int intText = Integer.parseInt(textField.getText());
				for(int i=0 ; i<text.length-1 ; i++){
					if(state == 1){
						tf[i].setText(Integer.toString(intText/measure[i]));
						intText = intText%measure[i];
					}else
						return;
					
				}
				tf[7].setText(Integer.toString(intText));
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
			cb[i].setBackground(Color.PINK);
			panel.add(la[i]);
			panel.add(tf[i]);
			cb[i].addItemListener(new ItemListener(){
				public void itemStateChanged(ItemEvent e){
					if(e.getStateChange() == ItemEvent.SELECTED)
						state = 1;
					else
						state = 0;
				}
			});
			panel.add(cb[i]);
			contentPane.add(panel);
		}
		cb[7].setEnabled(false);
		cb[7].setVisible(false);
		setSize(440, 400);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new CH11_04();
	}
}
