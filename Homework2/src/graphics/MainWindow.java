package graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;

import data.DefaultDataStore;


public class MainWindow {

	private JFrame frame;
	private JTextField txtEnter;
	private JTextField textField_2;
	private JComboBox<String> PatternSelector;
	private JComboBox<String> AlgorithmSelector;
	private JButton GoTime;
	private DefaultDataStore storage;
	private algorithms.AlgorithmSelector algorithms;
	private AnimatorPane animatorPane;
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public MainWindow() {
		storage = new DefaultDataStore();
		initialize();
		initInteractiveSystem();
		algorithms = new algorithms.AlgorithmSelector(animatorPane);
		
	}

	public void display(){
		frame.setVisible(true);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JSplitPane MainSplit = new JSplitPane();
		frame.getContentPane().add(MainSplit);
		
		JPanel LeftSidePanel = new JPanel();
		MainSplit.setLeftComponent(LeftSidePanel);
		LeftSidePanel.setLayout(new BorderLayout(0, 0));
		
		PatternSelector = new JComboBox<String>();
		PatternSelector.setModel(new DefaultComboBoxModel<String>(new String[] {"Preset 1", "Preset 2", "Preset 3", "Custom"}));
		PatternSelector.setMaximumRowCount(4);
		PatternSelector.setToolTipText("Select the preset or make your own pattern.");
		LeftSidePanel.add(PatternSelector, BorderLayout.NORTH);
		
		JLabel Credits = new JLabel("2013 Rainer Keerdo");
		LeftSidePanel.add(Credits, BorderLayout.SOUTH);
		
		JPanel BufferPanel = new JPanel();
		LeftSidePanel.add(BufferPanel, BorderLayout.CENTER);
		BufferPanel.setLayout(new BorderLayout(0, 0));
		
		AlgorithmSelector = new JComboBox<String>();
		AlgorithmSelector.setModel(new DefaultComboBoxModel<String>(new String[] {"First-fit", "Best-fit", "Worst-fit", "Random-fit"}));
		AlgorithmSelector.setToolTipText("Select Algorithm");
		BufferPanel.add(AlgorithmSelector, BorderLayout.NORTH);
		
		GoTime = new JButton("Go!");
		BufferPanel.add(GoTime, BorderLayout.SOUTH);
		
		JPanel RightMainPanel = new JPanel();
		MainSplit.setRightComponent(RightMainPanel);
		RightMainPanel.setLayout(new BorderLayout(0, 0));
		
		JSplitPane VertSplitter = new JSplitPane();
		VertSplitter.setOrientation(JSplitPane.VERTICAL_SPLIT);
		RightMainPanel.add(VertSplitter);
		
		JPanel RightPanelUp = new JPanel();
		VertSplitter.setLeftComponent(RightPanelUp);
		RightPanelUp.setLayout(new BorderLayout(0, 0));
		
		txtEnter = new JTextField();
		txtEnter.setToolTipText("Format : '[size,duration];[size,duration]' and so on.");
		txtEnter.setText("Enter pattern [Size, duration]");
		RightPanelUp.add(txtEnter, BorderLayout.CENTER);
		txtEnter.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setToolTipText("Size of the memory block will be displayed here");
		RightPanelUp.add(textField_2, BorderLayout.EAST);
		textField_2.setColumns(10);
		
		JPanel RightPanelDown = new JPanel();
		VertSplitter.setRightComponent(RightPanelDown);
		RightPanelDown.setLayout(new BorderLayout(0, 0));
		
		animatorPane = new AnimatorPane();
		RightPanelDown.add(animatorPane, BorderLayout.CENTER);
	}
	
	private void initInteractiveSystem(){
		AlgorithmSelector.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				selectAlgorithm();
			}
			
		});
		PatternSelector.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				selectPattern();
			}
			
		});
		GoTime.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				GoTimeAction();
			}
			
		});
	}
	private void selectAlgorithm(){
		storage.setCurrentAlgorithm(AlgorithmSelector.getSelectedIndex());
	}
	private void selectPattern(){
		int current = PatternSelector.getSelectedIndex();
		if(current==3){
			txtEnter.setEnabled(true);
			String text = storage.getCurrentCustom();
			txtEnter.setText(text);
		} else {
			txtEnter.setEnabled(false);
			txtEnter.setText(storage.getPreset(current));
		}
	}
	private void GoTimeAction(){
		storage.setSelectedInput(txtEnter.getText());
		storage.pushAlgorithmStart(algorithms);
	}
}
