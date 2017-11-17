import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFiedlEx extends JFrame {
	Container contentPane;
	TextFiedlEx(){
		setTitle("텍스트 필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("이름 : "));
		contentPane.add(new JTextField(10));
		contentPane.add(new JLabel("학과 : "));
		contentPane.add(new JTextField("컴퓨터공학과(수정)"));
		contentPane.add(new JLabel("주소 : "));
		contentPane.add(new JTextField("서울시...", 20));
		
		setSize(350, 200);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new TextFiedlEx();
	}
}
