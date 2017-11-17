import java.awt.*;
import javax.swing.*;

public class SwingEx05 extends JFrame{
	SwingEx05(){
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4, 4);
		setLayout(grid);
		Color[] colorset = {Color.RED, new Color(255, 187, 0), Color.YELLOW, Color.GREEN, new Color(0, 216, 255), 
						new Color(3, 0, 102), new Color(153, 0, 133), new Color(130, 110, 93), Color.PINK, Color.LIGHT_GRAY,
						Color.WHITE, new Color(48, 0, 0), Color.BLACK, new Color(255, 187, 0), new Color(3, 0, 102), new Color(153, 0, 133)};
		for(int i=0 ; i<16 ; i++){
			JLabel label = new JLabel(Integer.toString(i));
			label.setOpaque(true);
			label.setBackground(colorset[i]);
			add(label);		
		}
		
		setSize(600, 240);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new SwingEx05();
	}
}
