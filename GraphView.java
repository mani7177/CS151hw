package cs151hw3P_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JFrame;

public class GraphView extends JFrame{
	private static final long serialVersionUID = 1L;
	int num1, num2, num3;
	
	public GraphView(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
		public void updateGraph(int num1, int num2, int num3) {
			this.num1 = num1;
			this.num2 = num2;
			this.num3 = num3;
			repaint();
		}
		
	@Override 
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		int h1 = getHeight() - num1 - 15;
        int h2 = getHeight() - num2 - 15;
        int h3 = getHeight() - num3 - 15;
        
        g2.setColor(Color.YELLOW);
        Rectangle r1 = new Rectangle(10, h1, 50, num1);
        g2.draw(r1);
        g2.fill(r1);
        g2.setColor(Color.BLACK);
        Rectangle r2 = new Rectangle(50, h2, 100, num2);
        g2.draw(r2);
        g2.fill(r2);
        g2.setColor(Color.GREEN);
        Rectangle r3 = new Rectangle(100, h3, 100, num3);
        g2.draw(r3);
        g2.fill(r3);
	}
	
}
