import javax.swing.*;
import java.awt.*;

public class GraphicsClipEx extends JFrame{
	Container contentPane;
	GraphicsClipEx(){
		setTitle("클리핑 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 400);
		setVisible(true);
		
	}
	
	class MyPanel extends JPanel{
		ImageIcon icon = new ImageIcon("images/image0.jpg");
		Image img = icon.getImage();
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setClip(100, 20, 150, 150);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("Go Gator!", 100, 150);
			
		}
	}
	
	public static void main(String [] args){
		new GraphicsClipEx();
	}
}
