package javaproject;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class testing extends JFrame{
	int x,y;
	int ax,by;
	
	public testing() {
		setTitle("Graph");
		setSize(650,600);
		
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x = 30;
		y = 300;
	}
	
	/*Sine drawing*/
	public void sine() {
		try {
			//Speed of drawing
			Thread.sleep(10);
			/*stay in bounds of the axis*/
			if(x<600&&y>30&&y!=600) {
				ax = x-300;
				by = y-300;
				/*Specify function*/
				by = (int)(80*Math.sin(0.5*ax/3.14));
				x = ax+300;
				y = 300-by;
				x++;
			}
		}catch(Exception e){
			System.out.println("Uh-oh something happened");
		}
	}
	///////////////////////////////////////////////////////////////////////

	public void straight_line() {
		try {
			Thread.sleep(1);
			if(x<600&&y>30&&y!=600){	
				 ax = x-300;
				 by = y-300;
			     ax++;
				
				x=300+ax;
				y=300-by;
			}
		}catch(Exception e) {
			System.out.println("Uh-oh something happened");
		}
	}
	///////////////////////////////////////////////////////////////////////
	public void parabola() {
		try {
			Thread.sleep(10);
			if(x<600&&y>30&&y!=600){
				 ax = x-300;
				 by = y-300;
			     ax++;
			     by=ax*ax/500; 
			     x=300+ax;
			     y=300-by;	
			}
			
		}catch(Exception e) {
			System.out.println("Uh-oh something happened");
		}
	}
	///////////////////////////////////////////////////////////////////////
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
	///////////////////////////////////////////////////////////////////////
	public void y_mx() {
		try {
			Thread.sleep(10);	
			if(x<600&&y>30&&y!=600){	
				 ax = x-300;
				 by = y-300;
			      ax++;		
			      by = ax; 
				x=300+ax;
				y=300-by;

			}
		}catch(Exception e) {
			System.out.println("Uh-oh something happened");
		}
	}
	///////////////////////////////////////////////////////////////////////
	public void cosine() {
		try {
			Thread.sleep(10);
			if(x<600&&y>30&&y!=600) {
				ax = x-300;
				by = y-300;
				ax++;
				/*Specify function*/
				by = (int)(80*Math.cos(0.2*ax/3.14));
				x = ax+300;
				y = 300-by;
			}
		}catch(Exception e){
			System.out.println("Uh-oh something happened");
		}
	}
	///////////////////////////////////////////////////////////////////////
	public void tan() {
		try {
			Thread.sleep(10);
			if(x<600&&y>30&&y!=600) {
				ax = x-300;
				by = y-300;
				ax++;
				/*Specify function*/
				by = (int)(20*Math.tan(0.2*ax/3.14));
				x = ax+300;
				y = 300-by;
			}
		}catch(Exception e){
			System.out.println("Uh-oh something happened");
		}
	}
	///////////////////////////////////////////////////////////////////////

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
		
		
		/*JUST UNCOMMENT THE ONE YOU WANT TO DO*/
		//sine();
		//straight_line();
		//parabola();
		xcubed();
		//y_mx(); //Basic y=x (the m is to scale)
		//cosine();
		//tan(); //Not working right
		repaint();
	}
	
	public static void main(String[] args) {
		new testing();
	}
}