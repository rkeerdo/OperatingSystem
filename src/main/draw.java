package main;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;


public class draw extends JPanel{
	
	//suurused
	//x - 628
	//y -312
	
	private ArrayList<Integer> input = new ArrayList<Integer>();
	private ArrayList<Integer> order2 = new ArrayList<Integer>();
	private boolean alg_check;
	
	public draw(ArrayList<Integer> input, ArrayList<Integer> order, boolean bool) {
		this.input = input;
		this.order2 = order;
		this.alg_check = bool;
		
	}
	
	public void setInput(ArrayList<Integer> outOrder) {
		this.input = outOrder;
		
	}
	
	public void setOrder(ArrayList<Integer> Order) {
		this.order2 = Order;
		
	}
	
	public void setBool(boolean check) {
		this.alg_check = check;
		
	}
	
	public void drawing(){
		repaint();
	}

	
	


	public void paintComponent(Graphics g){
		//System.out.println("painting");
		float cons_x = (float) (628/32.0);
		if (input.size() == 0){
			//System.out.println("nope");
		}
		else{
			ArrayList<Integer> newList = new ArrayList<Integer>(order2);
			String output = "";
			for(Integer i:newList){
				output = output + i;
			}
			System.out.println(output);
			
			float cons_y = (float) (312/input.size());
			super.paintComponent (g);
			
			g.setColor(Color.GRAY);
			g.fillRect(0,0,1000,1000);
			
			g.setColor(Color.BLACK);
			
			int y = 1;
			newList.add(-2);
			for(Integer i:input){
				if (alg_check){
					if(newList.get(0) == i){
						g.setColor(Color.RED);
						newList.remove(0);
					}
					else{
						g.setColor(Color.BLACK);
					}
					g.drawOval((int) (cons_x * i),(int) (cons_y * y),3,3);
					y++;
				}
				else{
					if(newList.contains(i)){
						g.setColor(Color.RED);
						newList.remove(newList.indexOf(i));
					}
					else{
						g.setColor(Color.BLACK);
					}
					g.drawOval((int) (cons_x * i),(int) (cons_y * y),3,3);
					y++;
				}
			}
		}
	}
}
