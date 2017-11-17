import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TenLabelsFrame extends JFrame{
	JLabel[] gameLabels = new JLabel[10];
	Color[] color = {Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.PINK,
			Color.BLUE, Color.MAGENTA, Color.GRAY, Color.LIGHT_GRAY, Color.RED};
	JLabel label = new JLabel();
	int nextPressed = 0;
	public TenLabelsFrame(){
		super("Ten 레이블 클릭");
		setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i=0 ; i<gameLabels.length ; i++){
			Container c = getContentPane();
			gameLabels[i] = new JLabel(Integer.toString(i));
			gameLabels[i].setForeground(color[i%10]);
			c.add(gameLabels[i]);
			
			label.setText(Integer.toString(nextPressed));
			label.setLocation(0, 0);
			label.setFont(new Font("Arial", Font.BOLD, 30));
			label.setSize(30, 30);
			label.setVisible(true);
			c.add(label);
			
			gameLabels[i].addMouseListener(new MouseAdapter(){
				/*public void mousePressed(MouseEvent e){
					JLabel la = (JLabel)e.getSource();
					if(Integer.parseInt(la.getText()) == nextPressed){
						nextPressed++;
						if(nextPressed == 100){
							nextPressed = 0;
							configure();
						} 
						else
							la.setVisible(false);
					}
				}*/
				public void mouseEntered(MouseEvent e){
					JLabel la = (JLabel)e.getSource();
					if(Integer.parseInt(la.getText()) == nextPressed){
						nextPressed++;
						label.setText(Integer.toString(nextPressed));
						if(nextPressed == 100){
							nextPressed = 0;
							configure();
						} 
						else
							la.setVisible(false);
					}
					
				}
			});
		}
		setSize(800, 800);
		setVisible(true);
		configure();
	}
	
	void configure(){
		Container c = getContentPane();
		c.setBackground(Color.WHITE);
		
		for(int i=0 ; i<gameLabels.length ; i++){
			int xBound = c.getWidth() - gameLabels[i].getWidth();
			int yBound = c.getHeight() - gameLabels[i].getHeight();
			int x = (int)(Math.random()*xBound);
			int y = (int)(Math.random()*yBound);
			
			
			gameLabels[i].setLocation(x, y);
			gameLabels[i].setFont(new Font("Arial", Font.BOLD, (int)(Math.random()*10)+15));
			
			gameLabels[i].setSize(30, 30);
			gameLabels[i].setVisible(true);
		}
	}
	
	public static void main(String [] args){
		new TenLabelsFrame();
	}
	
}
