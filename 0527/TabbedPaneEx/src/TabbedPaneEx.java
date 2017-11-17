import javax.swing.*;
import java.awt.*;

public class TabbedPaneEx extends JFrame{
	Container contentPane;
	TabbedPaneEx(){
		setTitle("���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		JTabbedPane pane = createTabbedPane();
		contentPane.add(pane, BorderLayout.CENTER);
		setSize(250, 250);
		setVisible(true);
	}
	
	JTabbedPane createTabbedPane(){
		JTabbedPane pane = new JTabbedPane();
		pane.addTab("tab1", new JLabel(new ImageIcon("images/img1.jpg")));
		pane.addTab("tab2", new JLabel(new ImageIcon("images/img2.jpg")));
		pane.addTab("tab3", new MyPanel());
		return pane;
	}
	
	class MyPanel extends JPanel{
		MyPanel(){
			this.setBackground(Color.YELLOW);
		}
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.BLUE);
			g.fillOval(10, 70, 50, 50);
			g.setColor(Color.BLACK);
			g.drawString("tab 3�� ���� JPanel �Դϴ�.", 30, 50);
		}
	}
	
	public static void main(String [] args){
		new TabbedPaneEx();
	}
}
