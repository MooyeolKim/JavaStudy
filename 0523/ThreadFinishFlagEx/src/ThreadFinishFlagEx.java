import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class RandomThread extends Thread{
	Container contentPane;
	boolean flag = false;
	int lctX, lctY;	
	
	public RandomThread(Container contentPane){
		this.contentPane = contentPane;
	}
	
	void finish(int lctX, int lctY){
		flag = true;
		this.lctX = lctX;
		this.lctY = lctY;
	}
	
	public void run(){
		while(true){
			int x = ((int)(Math.random()*contentPane.getWidth()));
			int y = ((int)(Math.random()*contentPane.getHeight()));
			//int[] rgb = {(int)(Ma)
			JLabel label = new JLabel("Java");
			label.setSize(80, 30);
			label.setLocation(x, y);
			
			contentPane.add(label);
			contentPane.repaint();
			try{
				Thread.sleep(300);
				if(flag == true){
					contentPane.removeAll();
					label = new JLabel("finish");
					label.setSize(80, 30);
					label.setLocation(lctX-20, lctY-15);
					label.setForeground(Color.RED);
					contentPane.add(label);
					contentPane.repaint();
					return;
				}
			} catch(InterruptedException e){
				return;
			}
		}
	}
}

public class ThreadFinishFlagEx extends JFrame {
	RandomThread th;
	
	public ThreadFinishFlagEx(){
		setTitle("ThreadFinishFlagEx ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				th.finish(e.getX(), e.getY());
			}
		});
		setSize(300, 200);
		setVisible(true);
		
		th = new RandomThread(c);
		th.start();
	}
	
	public static void main(String [] args){
		new ThreadFinishFlagEx();
		
	}
}
