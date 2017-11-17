import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CH11_07 extends JFrame{
	JSlider sl;
	JLabel la = new JLabel();
	Container contentPane;
	
	CH11_07(){
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		sl = new JSlider(JSlider.HORIZONTAL, 1, 100, 50);
		sl.setPaintLabels(true);
		sl.setPaintTicks(true);
		sl.setPaintTrack(true);
		sl.setMajorTickSpacing(20);
		sl.setMinorTickSpacing(5);
		sl.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				la.setFont(new Font("Arial", Font.PLAIN, sl.getValue()));
			}
		});
		la.setText("I Love Java");
		la.setHorizontalAlignment(la.CENTER);
		la.setFont(new Font("Arial", Font.PLAIN, sl.getValue()));
		
		contentPane.add(sl, BorderLayout.NORTH);
		contentPane.add(la, BorderLayout.CENTER);
		
		setSize(700, 300);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new CH11_07();
	}

	
}
