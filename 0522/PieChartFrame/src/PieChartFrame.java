import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PieChartFrame extends JFrame {
	Container contentPane;
	int[] data = {0, 0, 0, 0};
	int[] arcAngle = new int[4];
	Color[] color = {Color.RED, Color.BLUE, Color.MAGENTA, Color.ORANGE};
	String[] itemName = {"apple", "cherry", "strawberry", "prune"};
	JTextField[] tf = new JTextField[4];
	ChartPanel chartpanel = new ChartPanel();
	
	PieChartFrame(){
		setTitle("파이 차트 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.add(new InputPanel(), BorderLayout.NORTH);
		contentPane.add(chartPanel, BorderLayout.CENTER);
		setSize(500, 350);
		setVisible(true);
		drawChart();
	}
	
	void drawChart(){
		int sum = 0;
		for(int i=0 ; i<data.length ; i++){
			data[i] = Integer.parseInt(tf[i].getText());
			sum += data[i];
		}
		
		if(sum == 0) return;
		
		for(int i=0 ; i<data.length ; i++)
			arcAngle[i] = (int)Math.round((double)data[i]/(double)sum*360);
		
		chartPanel.repaint();
	}
	
	class InputPanel extends JPanel{
		InputPanel(){
			this.setBackground(Color.LIGHT_GRAY);
			for(int i=0 ; i<tf.length ; i++){
				tf[i]
			}
		}
	}
}
