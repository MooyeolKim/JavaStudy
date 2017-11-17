import javax.swing.*;
import java.awt.*;

public class SwingEx06 extends JFrame{
	SwingEx06(){
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		setSize(300, 300);
		setVisible(true);
		
		for(int i=0 ; i<20 ; i++){
			JLabel label = new JLabel();
			int x = (int)(Math.random()*200) + 50;
			int y = (int)(Math.random()*200) + 50;
			label.setBackground(Color.BLUE);
			label.setLocation(x, y);
			label.setSize(10, 10);
			label.setOpaque(true);
			add(label);
		}
	}
	
	public static void main(String [] args){
		new SwingEx06();
	}
}
