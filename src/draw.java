import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;


public class draw extends JPanel{
	
	public draw(ArrayList<Integer> input) {
	    input = input;
	}
	
	public void drawing(){
		repaint();
		
	}
	public void paintComponent(Graphics g){
		super.paintComponent (g);
		
		g.setColor(Color.BLUE);
		g.fillRect(0,0,1000,1000);
		
	}
	
}
