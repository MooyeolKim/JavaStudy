import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class InnerClassListener extends JFrame{
	InnerClassListener(){
		setTitle("Action");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Action");
		btn.setBackground(Color.RED);
		MyActionListener listener = new MyActionListener();
		btn.addActionListener(listener);
		
		add(btn);
		setSize(300, 150);
		setVisible(true);
	}
	
	private class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JButton b = (JButton)e.getSource();
			
			if(b.getText().equals("Action")){
				b.setBackground(Color.YELLOW);
				b.setText("¾×¼Ç");
			}
				
			else{
				b.setBackground(Color.RED);
				b.setText("Action");
			}
			
			setTitle(b.getText());
		}
	}
	
	public static void main(String [] args){
		new InnerClassListener();
	}
}



