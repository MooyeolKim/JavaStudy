import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CH11_01 extends JFrame{
	Container contentPane;
	JCheckBox deactivity = new JCheckBox("��ư ��Ȱ��ȭ");
	JCheckBox disappear = new JCheckBox("��ư ���߱�");
	JButton btn = new JButton("test Button");
	
	CH11_01(){
		setTitle("CheckBox Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		btn.setSize(100, 20);
		
		deactivity.addItemListener(new ItLtnr());
		disappear.addItemListener(new ItLtnr());
		
		contentPane.add(deactivity);
		contentPane.add(disappear);
		contentPane.add(btn);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	class ItLtnr implements ItemListener{
		public void itemStateChanged(ItemEvent e){
			if(e.getStateChange() == ItemEvent.SELECTED){
				if(e.getItem() == deactivity)
					btn.setEnabled(false);
				if(e.getItem() == disappear)
					btn.setVisible(false);
			}
			else{
				if(e.getItem() == deactivity)
					btn.setEnabled(true);
				if(e.getItem() == disappear)
					btn.setVisible(true);
			}
		}
	}
	
	public static void main(String [] args){
		new CH11_01();
	}
}
