import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class CH11_06 extends JFrame{
	JLabel la = new JLabel();
	JSlider sl;
	Container contentPane;
	
	CH11_06(){
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		sl = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		sl.setPaintLabels(true);
		sl.setPaintTicks(true);
		sl.setPaintTrack(true);
		sl.setMajorTickSpacing(50);
		sl.setMinorTickSpacing(10);
		sl.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				la.setText(Integer.toString(slider.getValue()));
			}
		});
		la.setOpaque(true);
		la.setBackground(Color.GREEN);
		la.setText(Integer.toString(sl.getValue()));
		
		contentPane.add(sl);
		contentPane.add(la);
		setSize(400, 100);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new CH11_06();
	}
}
