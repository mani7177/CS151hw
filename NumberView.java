package cs151hw3P_2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NumberView extends JFrame{
	private static final long serialVersionUID = 1L;
	Numbers model;
	
	public NumberView(int num1, int num2, int num3, Numbers model) {
		this.model = model;
		
		add(new JLabel("Yellow"));
		JTextField yellowField = new JTextField(10);
		yellowField.setText(num1 + "");
		add(yellowField);
		
		add(new JLabel("Black"));
		JTextField blackField = new JTextField(10);
		blackField.setText(num2 + "");
		add(blackField);
		
		add(new JLabel("Green"));
		JTextField greenField = new JTextField(10);
		greenField.setText(num3 + "");
		add(greenField);
		
		JButton submit = new JButton("submit");
		add(submit);
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		submit.addActionListener(event -> {
			int n1 = Integer.parseInt(yellowField.getText());
			int n2 = Integer.parseInt(blackField.getText());
			int n3 = Integer.parseInt(greenField.getText());
			model.updateNumbers(n1, n2, n3);
		});
	}
}
