import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListEx extends JFrame{
	Container contentPane;
	String[] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach",
						"berry", "strawberry", "blackberry"};
	ImageIcon[] images = {
			new ImageIcon("images/icon1.png"),
			new ImageIcon("imgaes/icon2.png"),
			new ImageIcon("images/icon3.png"),
			new ImageIcon("images/icon4.png")
	};
	
	ListEx(){
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JList strList = new JList(fruits);
		contentPane.add(strList);
		
		JList imageList = new JList();
		imageList.setListData(images);
		contentPane.add(imageList);
		
		JList scrollList = new JList(fruits);
		contentPane.add(new JScrollPane(scrollList));
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new ListEx();
	}
}
