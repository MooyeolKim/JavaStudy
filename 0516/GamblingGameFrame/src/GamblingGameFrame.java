import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GamblingGameFrame extends JFrame{
	public GamblingGameFrame(){
		super("Open Challenge 10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new GamePanel());
		
		setSize(300, 200);
		setVisible(true);
		
		getContentPane().requestFocus();
	}
	
	class GamePanel extends JPanel{
		JLabel[] label = new JLabel[3];
		JLabel result = new JLabel("시작합니다.");
		
		public GamePanel(){
			setLayout(null);
			
			for(int i=0 ; i<label.length ; i++){
				label[i] = new JLabel("0");
				label[i].setSize(60, 30);
				label[i].setLocation(30+80*i, 50);
				label[i].setHorizontalAlignment(JLabel.CENTER);
				label[i].setOpaque(true);
				label[i].setBackground(Color.MAGENTA);
				label[i].setForeground(Color.YELLOW);
				label[i].setFont(new Font("Tahoma", Font.ITALIC, 30));
				
				add(label[i]);
			}
			
			result.setSize(200, 20);
			result.setLocation(100, 120);
			add(result);
			
			addKeyListener(new KeyAdapter(){
				public void keyPressed(KeyEvent e){
					if(e.getKeyChar() == '\n'){
						int x1 = (int)(Math.random()*5);
						label[0].setText(Integer.toString(x1));
						int x2 = (int)(Math.random()*5);
						label[1].setText(Integer.toString(x2));
						int x3 = (int)(Math.random()*5);
						label[2].setText(Integer.toString(x3));
						
						if(x1 == x2 && x2 == x3)
							result.setText("축하합니다.");
						else
							result.setText("아쉽군요");
					}
				}
			});
		}
	}
	public static void main(String [] args){
		new GamblingGameFrame();
	}
}
