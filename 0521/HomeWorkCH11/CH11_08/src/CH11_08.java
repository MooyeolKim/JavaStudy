import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.BadLocationException;

import java.awt.*;
import java.awt.event.*;

public class CH11_08 extends JFrame{
	JSlider sl;
	JTextArea ta;
	
	CH11_08(){
		setTitle("Text Area Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ta = new JTextArea(7, 20);
		sl = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
		sl.setPaintLabels(true);
		sl.setPaintTicks(true);
		sl.setPaintTrack(true);
		sl.setMajorTickSpacing(20);
		sl.setMinorTickSpacing(5);
		sl.setEnabled(false);
		
		ta.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e){
				int size = ta.getText().length();
				try{
					if(size>100)
						ta.setText(ta.getText(0, 100));
				}catch(BadLocationException ex){}
				
				sl.setValue(size);
			}
			
		});
		
		add(new JScrollPane(ta), BorderLayout.NORTH);
		add(sl, BorderLayout.CENTER);
		
		setSize(400, 300);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new CH11_08();
	}
}
