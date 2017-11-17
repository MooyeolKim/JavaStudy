import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuActionEventEx extends JFrame{
	Container contentPane;
	JLabel label = new JLabel("Hello");
	
	MenuActionEventEx(){
		setTitle("Menu에 Action 리스너 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label, BorderLayout.CENTER);
		createMenu();
		setSize(400, 300);
		setVisible(true);
	}
	
	void createMenu(){
		JMenuBar mb = new JMenuBar();
		JMenuItem[] menuItem = new JMenuItem[8];
		String[] itemTitle = {"Color", "Font", "Top", "Bottom", "Left", "Right", "VCenter", "HCenter"};
		JMenu fileMenu = new JMenu("Text");
		
		for(int i=0 ; i<menuItem.length ; i++){
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(new MenuActionListener());
			
			fileMenu.add(menuItem[i]);
		}
		
		mb.add(fileMenu);
		setJMenuBar(mb);
	}
	
	class MenuActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String cmd = e.getActionCommand();
			if(cmd.equals("Color"))
				label.setForeground(Color.BLUE);
			else if(cmd.equals("Font"))
				label.setFont(new Font("Ravie", Font.ITALIC, 30));
			else if(cmd.equals("Top"))
				label.setVerticalAlignment(SwingConstants.TOP);
			else if(cmd.equals("Bottom"))
				label.setVerticalAlignment(SwingConstants.BOTTOM);
			else if(cmd.equals("Left"))
				label.setHorizontalAlignment(SwingConstants.LEFT);
			else if(cmd.equals("Right"))
				label.setHorizontalAlignment(SwingConstants.RIGHT);
			else if(cmd.equals("VCenter"))
				label.setVerticalAlignment(SwingConstants.CENTER);
			else
				label.setHorizontalAlignment(SwingConstants.CENTER);
		}
	}
	
	public static void main(String [] args){
		new MenuActionEventEx();
	}
}
