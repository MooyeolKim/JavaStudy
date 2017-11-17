import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class ButtonAndImageLabelFrame extends JFrame{
	Container contentPane;
	JLabel imageLabel;
	ImageIcon[] images = new ImageIcon[10];
	int currentId;
	
	public ButtonAndImageLabelFrame(){
		setTitle("좌우로 이미지 넘기기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		//contentPane.setBackground(Color.LIGHT_GRAY);
		
		for(int i=0 ; i<images.length ; i++)
			//images[i] = new ImageIcon("images/image" + i + ".jpg");
			//images[i] = new ImageIcon("images/" + i + ".jpg");
			images[i] = new ImageIcon("images/Yuna Kim 0" + i + ".png");
		
		currentId = 0;
		imageLabel = new JLabel(images[currentId]);
		contentPane.add(imageLabel, BorderLayout.CENTER);
		contentPane.add(new MenuPanel(), BorderLayout.SOUTH);
		
		setSize(650, 900);
		setVisible(true);
		setResizable(false);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width - 650)/2, (screenSize.height - 900) / 2);
	}
	
	class MenuPanel extends JPanel{
		public MenuPanel(){
			//setBackground(Color.LIGHT_GRAY);
			ImageIcon leftIcon = new ImageIcon("images/left.png");
			ImageIcon rightIcon = new ImageIcon("images/right.png");
			
			JButton leftBtn = new JButton(leftIcon);
			JButton rightBtn = new JButton(rightIcon);
			add(leftBtn);
			add(rightBtn);
			
			leftBtn.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					currentId--;
					currentId += images.length;
					currentId %= images.length;
					imageLabel.setIcon(images[currentId]);
				}
			});
			
			rightBtn.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					currentId++;
					currentId %= images.length;
					
					imageLabel.setIcon(images[currentId]);
				}
			});
		}
	}
	
	public static void main(String [] args){
		new ButtonAndImageLabelFrame();
	}
}
