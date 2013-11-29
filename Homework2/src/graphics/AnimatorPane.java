package graphics;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.ScrollPaneConstants;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class AnimatorPane extends JPanel {
	private JTextField DebugField;
	private JTextField DisplayField;
	private JProgressBar progressBar;
	public AnimatorPane() {
		initPane();
	}

	private void initPane() {
		setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setViewportBorder(new MatteBorder(1, 1, 1, 1,(Color) new Color(0, 0, 0)));
		add(scrollPane, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new BorderLayout(0, 0));

		progressBar = new JProgressBar();
		panel.add(progressBar, BorderLayout.NORTH);
		
		JPanel ActingPane = new JPanel();
		panel.add(ActingPane, BorderLayout.CENTER);
		ActingPane.setLayout(new BorderLayout(0, 0));
		
		DebugField = new JTextField();
		DebugField.setEditable(false);
		ActingPane.add(DebugField, BorderLayout.NORTH);
		DebugField.setColumns(10);
		
		DisplayField = new JTextField();
		DisplayField.setEditable(false);
		ActingPane.add(DisplayField, BorderLayout.CENTER);
	}
	public void debug(String text){
		DebugField.setText(text);
	}
	public void setDisplayText(String text){
		DisplayField.setText(text);
	}
}
