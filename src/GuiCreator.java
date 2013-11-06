import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class GuiCreator extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private String[] algor = { "CLOOK", "CSCAN", "FCFS", "LOOK", "SCAN" , "SSTF"};
	private String[] tsen = { "CLOOK", "CSCAN", "FCFS", "User defined"};
	private JButton go_button;
	private JFrame window;
	private JComboBox algorList;
	private JComboBox tsenList;
	
	private JCheckBox s0;
	private JCheckBox s1;
	private JCheckBox s2;
	private JCheckBox s3;
	private JCheckBox s4;
	private JCheckBox s5;
	private JCheckBox s6;
	private JCheckBox s7;
	private JCheckBox s8;
	private JCheckBox s9;
	private JCheckBox s10;
	private JCheckBox s11;
	private JCheckBox s12;
	private JCheckBox s13;
	private JCheckBox s14;
	private JCheckBox s15;
	private JCheckBox s16;
	private JCheckBox s17;
	private JCheckBox s18;
	private JCheckBox s19;
	private JCheckBox s20;
	private JCheckBox s21;
	private JCheckBox s22;
	private JCheckBox s23;
	private JCheckBox s24;
	private JCheckBox s25;
	private JCheckBox s26;
	private JCheckBox s27;
	private JCheckBox s28;
	private JCheckBox s29;
	private JCheckBox s30;
	private JCheckBox s31;
	
	
	public GuiCreator() {
		this.setSize(640, 480);
		this.setName("Warehouse tab");
		window = new JFrame();
		this.setResizable(false);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	private void initGui(){
		
	}
	
	private void initCheckBox(){
		
		s0 = new JCheckBox("1");
		s0.setLocation(0,0);
		s0.setHorizontalTextPosition(SwingConstants.CENTER);
        s0.setVerticalTextPosition(SwingConstants.BOTTOM);
        
		s1 = new JCheckBox("1");
		s1.setHorizontalTextPosition(SwingConstants.CENTER);
        s1.setVerticalTextPosition(SwingConstants.BOTTOM);
        
	}

}
