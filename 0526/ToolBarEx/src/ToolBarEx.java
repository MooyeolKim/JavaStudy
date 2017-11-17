import javax.swing.*;

import java.awt.*;

public class ToolBarEx extends JFrame{
	Container contentPane;
	
	ToolBarEx(){
		setTitle("���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setSize(400, 200);
		setVisible(true);
	}
	
	void createToolBar(){
		JToolBar toolBar = new JToolBar("Kitae Menu");
		toolBar.setFloatable(false);
		toolBar.setBackground(Color.LIGHT_GRAY);
		JButton newBtn = new JButton("New");
		newBtn.setToolTipText("������ �����մϴ�");
		toolBar.add(newBtn);
		
		JButton openBtn = new JButton(new ImageIcon("images/open.jpg"));
		openBtn.setToolTipText("������ ���ϴ�.");
		toolBar.add(openBtn);
		toolBar.addSeparator();
		JButton saveBtn = new JButton(new ImageIcon("images/save.jpg"));
		saveBtn.setToolTipText("������ �����մϴ�.");
		toolBar.add(saveBtn);
		
		toolBar.add(new JLabel("search"));
		
		JTextField tf = new JTextField("text field");
		tf.setToolTipText("ã�����ϴ� ���ڿ��� �Է��ϼ���.");
		toolBar.add(tf);
		
		JComboBox combo = new JComboBox();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		toolBar.add(combo);
		
		contentPane.add(toolBar, BorderLayout.NORTH);
	}
	
	public static void main(String [] args){
		new ToolBarEx();
	}
}
