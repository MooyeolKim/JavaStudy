import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame{
	Container contentPane;
	LabelEx(){
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel textlabel = new JLabel("����մϴ�");
		
		ImageIcon beauty = new ImageIcon("images/beauty.jpg");
		
		JLabel imageLabel = new JLabel(beauty);
		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		
		JLabel label = new JLabel("��������� ��ȭ�ϼ���", normalIcon, SwingConstants.CENTER);
		
		contentPane.add(textlabel);
		contentPane.add(imageLabel);
		contentPane.add(label);
		
		setSize(400, 600);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new LabelEx();
	}
}
