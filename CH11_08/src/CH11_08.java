import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class CH11_08 extends JFrame{
	JSlider sl;
	JTextArea ta;
	
	CH11_08(){
		setTitle("Text Area Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ta = new JTextArea();
		sl = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
		sl.setPaintLabels(true);
		sl.setPaintTicks(true);
		sl.setPaintTrack(true);
		sl.setMajorTickSpacing(20);
		sl.setMinorTickSpacing(5);
		sl.setEnabled(false);
		
		ta.addInputMethodListener(new InputMethodListener(){

			@Override
			public void inputMethodTextChanged(InputMethodEvent event) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void caretPositionChanged(InputMethodEvent event) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		add(new JScrollPane(ta), BorderLayout.NORTH);
	}
}
