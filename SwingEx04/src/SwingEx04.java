import java.awt.*;
import javax.swing.*;

public class SwingEx04 extends JFrame{
	SwingEx04(){
		setTitle("Ten Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(1, 10);
		setLayout(grid);
		Color[] colorset = {Color.RED, new Color(255, 187, 0), Color.YELLOW, Color.GREEN, new Color(0, 216, 255), new Color(3, 0, 102), Color.MAGENTA,
							new Color(130, 110, 93), Color.PINK, Color.LIGHT_GRAY};
		for(int i=0 ; i<10 ; i++){
			JButton btn = new JButton(Integer.toString(i));
			add(btn);
			btn.setBackground(colorset[i]);
		}
		
		setSize(600, 250);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new SwingEx04();
	}
}
