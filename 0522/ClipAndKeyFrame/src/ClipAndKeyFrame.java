import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClipAndKeyFrame extends JFrame {
	public ClipAndKeyFrame(){
		super("Open Challenge 12");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImagePanel p = new ImagePanel();
		setContentPane(p);
		
		setSize(1200, 800);
		setVisible(true);
		p.requestFocus();
	}
	
	class ImagePanel extends JPanel{
		Image img = null;
		int clipX = 0, clipY = 0;
		int randX = (int)(Math.random()*(this.getWidth()-10));
		int randY = (int)(Math.random()*(this.getHeight()-10));
		
		public ImagePanel(){
			img = new ImageIcon("images/bg.jpg").getImage();
			this.addKeyListener(new MyKeyListener());
		}
		
		public void paintComponent(Graphics g){
			//super.paintComponent(g);
			g.setClip(clipX, clipY, 700, 700);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.drawString("ÀÚ¹Ù", randX, randY);
		}
		
		class MyKeyListener extends KeyAdapter{
			public void keyPressed(KeyEvent e){
				switch(e.getKeyCode()){
				case KeyEvent.VK_UP:
					clipY -= 10;
					if(clipY + 40 < 0)
						clipY = getHeight();
					break;
				case KeyEvent.VK_DOWN:
					clipY += 10;
					if(clipY > getHeight())
						clipY = 0;
					break;
				case KeyEvent.VK_LEFT:
					clipX -= 10;
					if(clipX + 40 < 0)
						clipX = getWidth();
					break;
				case KeyEvent.VK_RIGHT:
					clipX += 10;
					if(clipX > getWidth())
						clipX = 0;
					break;
				}
				repaint();
			}
		}
	}
	
	public static void main(String [] args){
		new ClipAndKeyFrame();
	}
}
