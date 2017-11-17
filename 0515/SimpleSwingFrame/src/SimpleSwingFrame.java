import java.awt.*;
import javax.swing.*;

public class SimpleSwingFrame extends JFrame{
	public SimpleSwingFrame(){
		super("Open Challenge 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new NorthPanel(), BorderLayout.NORTH);
		add(new CenterPanel(), BorderLayout.CENTER);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class NorthPanel extends JPanel {
		public NorthPanel(){
			setBackground(Color.LIGHT_GRAY);
			setLayout(new FlowLayout());
			add(new JButton("Open"));
			add(new JButton("Read"));
			add(new JButton("Close"));
		}
	}
	
	class CenterPanel extends JPanel{
		public CenterPanel(){
			setLayout(null);
			
			JLabel a = new JLabel("Hello");
			a.setSize(100, 20);
			a.setLocation(100, 10);
			
			JLabel b = new JLabel("Java");
			b.setSize(100, 20);
			b.setLocation(20, 200);
			
			JLabel c = new JLabel("Love");
			c.setSize(100, 20);
			c.setLocation(200, 150);
			
			
			add(a);
			add(b);
			add(c);
		}
	}
	
	public static void main(String[] args){
		new SimpleSwingFrame();
	}
}
