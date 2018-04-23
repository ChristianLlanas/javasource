package javaproject;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class XCubed extends JFrame{
	int x,y;
	int ax,by;
	
	public XCubed() {
		setTitle("Graph");
		setSize(650,600);
		
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x = 30;
		y = 300;
	}
	
	/*Sine drawing*/
	public void xcubed() {
		try {
			Thread.sleep(10);
			if(x<600&&y>30&&y!=600){	
			 ax = x-300;
			 by = y-300;
			 ax++;	
			 by = ax*ax*ax/5000; 
			 x=300+ax;
			 y=300-by;
			}
		}catch(Exception e) {
			System.out.println("Uh-oh something happened");
		}
	}
	
	/*Draw y and x axis*/
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		/*Y-AXIS*/
		g.drawLine(300, 30, 300, 600);
		/*X-AXIS*/
		g.drawLine(30, 300, 600, 300);
		
		g.drawString("Y", 310, 40);
		g.drawString("X", 30, 314);
		
		
		g.fillOval(x, y, 4, 4);
		
		xcubed();
		
		repaint();
	}
	
	public static void main(String[] args) {
		new XCubed();
	}
}