import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;


public class draw extends JPanel{
	
	//suurused
	//x - 628
	//y -312
	
	private ArrayList<Integer> input = new ArrayList<Integer>();
	
	public draw(ArrayList<Integer> input) {
		this.input = input;
		
	}
	
	public void setInput(ArrayList<Integer> outOrder) {
		this.input = outOrder;
		
	}
	
	public void drawing(){
		repaint();
	}

	public void paintComponent(Graphics g){
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println("painting");
		float cons_x = (float) (628/32.0);
		if (input.size() == 0){
			//System.out.println("nope");
		}
		else{
			float cons_y = (float) (312/input.size());
			super.paintComponent (g);
			
			g.setColor(Color.GRAY);
			g.fillRect(0,0,1000,1000);
			
			g.setColor(Color.BLACK);
			
			int y = 1;
			for(Integer i:input){
				g.drawOval((int) (cons_x * i),(int) (cons_y * y),3,3);
				y++;
			}
		}
		repaint();
	}
}
