import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class draw extends JPanel{
	
	public void drawing(){
		repaint();
		
	}
	public void paintComponent(Graphics g){
		super.paintComponent (g);
		
		g.setColor(Color.BLUE);
		g.fillRect(10, 10, 30, 30);
		
	}
	
}
