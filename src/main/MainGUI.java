package main;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Composite;

import java.awt.Frame;

import org.eclipse.swt.awt.SWT_AWT;

import java.awt.Panel;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Queue;

import javax.swing.JRootPane;

import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.custom.ScrolledComposite;



public class MainGUI{

	Algorithm algoritm;
	protected Shell shlAlgoritmidKvaketastel;
	private Text readLocation;
	private Text outputText;
	private int head = 0;
	private ArrayList<Integer> outOrder = new ArrayList<Integer>();
	private Text compareAmmount;
	private ArrayList<Integer> order = new ArrayList<Integer>();

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainGUI window = new MainGUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlAlgoritmidKvaketastel.open();
		shlAlgoritmidKvaketastel.layout();
		while (!shlAlgoritmidKvaketastel.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */

	protected void createContents() {
		
		
		
		final boolean[] bools = new boolean[32];

		
		shlAlgoritmidKvaketastel = new Shell();
		shlAlgoritmidKvaketastel.setMinimumSize(new Point(800, 600));
		shlAlgoritmidKvaketastel.setSize(450, 300);
		shlAlgoritmidKvaketastel.setText("Algoritmid k\u00F5vaketastel");
		
		Group grpAlgoritm = new Group(shlAlgoritmidKvaketastel, SWT.NONE);
		grpAlgoritm.setText("Algoritm");
		grpAlgoritm.setBounds(10, 10, 110, 80);
		
		final Combo algChoice = new Combo(grpAlgoritm, SWT.NONE);
		algChoice.setItems(new String[] {"NOOP", "FCFS", "SSTF", "SCAN", "LOOK", "C-SCAN", "C-LOOK"});
		algChoice.addSelectionListener (new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
			}
		});
		algChoice.setBounds(10, 30, 91, 23);
		
		Group grpValim = new Group(shlAlgoritmidKvaketastel, SWT.NONE);
		grpValim.setText("Valim");
		grpValim.setBounds(10, 96, 110, 80);
	
		
		Group grpValitudSektorid = new Group(shlAlgoritmidKvaketastel, SWT.NONE);
		grpValitudSektorid.setText("Valitud sektorid");
		grpValitudSektorid.setBounds(126, 10, 648, 110);
		
		Label l0 = new Label(grpValitudSektorid, SWT.NONE);
		l0.setAlignment(SWT.CENTER);
		l0.setBounds(22, 72, 13, 15);
		l0.setText("0");
		
		Label l1 = new Label(grpValitudSektorid, SWT.NONE);
		l1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		l1.setText("1");
		l1.setAlignment(SWT.CENTER);
		l1.setBounds(41, 72, 13, 15);
		
		Label l2 = new Label(grpValitudSektorid, SWT.NONE);
		l2.setText("2");
		l2.setAlignment(SWT.CENTER);
		l2.setBounds(60, 72, 13, 15);
		
		Label l3 = new Label(grpValitudSektorid, SWT.NONE);
		l3.setText("3");
		l3.setAlignment(SWT.CENTER);
		l3.setBounds(79, 72, 13, 15);
		
		Label l4 = new Label(grpValitudSektorid, SWT.NONE);
		l4.setText("4");
		l4.setAlignment(SWT.CENTER);
		l4.setBounds(98, 72, 13, 15);
		
		Label l5 = new Label(grpValitudSektorid, SWT.NONE);
		l5.setText("5");
		l5.setAlignment(SWT.CENTER);
		l5.setBounds(117, 72, 13, 15);
		
		Label l11 = new Label(grpValitudSektorid, SWT.NONE);
		l11.setText("11");
		l11.setAlignment(SWT.CENTER);
		l11.setBounds(231, 72, 13, 15);
		
		Label l10 = new Label(grpValitudSektorid, SWT.NONE);
		l10.setText("10");
		l10.setAlignment(SWT.CENTER);
		l10.setBounds(212, 72, 13, 15);
		
		Label l9 = new Label(grpValitudSektorid, SWT.NONE);
		l9.setText("9");
		l9.setAlignment(SWT.CENTER);
		l9.setBounds(193, 72, 13, 15);
		
		Label l8 = new Label(grpValitudSektorid, SWT.NONE);
		l8.setText("8");
		l8.setAlignment(SWT.CENTER);
		l8.setBounds(174, 72, 13, 15);
		
		Label l7 = new Label(grpValitudSektorid, SWT.NONE);
		l7.setText("7");
		l7.setAlignment(SWT.CENTER);
		l7.setBounds(155, 72, 13, 15);
		
		Label l6 = new Label(grpValitudSektorid, SWT.NONE);
		l6.setText("6");
		l6.setAlignment(SWT.CENTER);
		l6.setBounds(136, 72, 13, 15);
		
		Label l17 = new Label(grpValitudSektorid, SWT.NONE);
		l17.setText("17");
		l17.setAlignment(SWT.CENTER);
		l17.setBounds(345, 72, 13, 15);
		
		Label l16 = new Label(grpValitudSektorid, SWT.NONE);
		l16.setText("16");
		l16.setAlignment(SWT.CENTER);
		l16.setBounds(326, 72, 13, 15);
		
		Label l15 = new Label(grpValitudSektorid, SWT.NONE);
		l15.setText("15");
		l15.setAlignment(SWT.CENTER);
		l15.setBounds(307, 72, 13, 15);
		
		Label l14 = new Label(grpValitudSektorid, SWT.NONE);
		l14.setText("14");
		l14.setAlignment(SWT.CENTER);
		l14.setBounds(288, 72, 13, 15);
		
		Label l13 = new Label(grpValitudSektorid, SWT.NONE);
		l13.setText("13");
		l13.setAlignment(SWT.CENTER);
		l13.setBounds(269, 72, 13, 15);
		
		Label l12 = new Label(grpValitudSektorid, SWT.NONE);
		l12.setText("12");
		l12.setAlignment(SWT.CENTER);
		l12.setBounds(250, 72, 13, 15);
		
		Label l23 = new Label(grpValitudSektorid, SWT.NONE);
		l23.setText("23");
		l23.setAlignment(SWT.CENTER);
		l23.setBounds(459, 72, 13, 15);
		
		Label l22 = new Label(grpValitudSektorid, SWT.NONE);
		l22.setText("22");
		l22.setAlignment(SWT.CENTER);
		l22.setBounds(440, 72, 13, 15);
		
		Label l21 = new Label(grpValitudSektorid, SWT.NONE);
		l21.setText("21");
		l21.setAlignment(SWT.CENTER);
		l21.setBounds(421, 72, 13, 15);
		
		Label l20 = new Label(grpValitudSektorid, SWT.NONE);
		l20.setText("20");
		l20.setAlignment(SWT.CENTER);
		l20.setBounds(402, 72, 13, 15);
		
		Label l19 = new Label(grpValitudSektorid, SWT.NONE);
		l19.setText("19");
		l19.setAlignment(SWT.CENTER);
		l19.setBounds(383, 72, 13, 15);
		
		Label l18 = new Label(grpValitudSektorid, SWT.NONE);
		l18.setText("18");
		l18.setAlignment(SWT.CENTER);
		l18.setBounds(364, 72, 13, 15);
		
		Label l29 = new Label(grpValitudSektorid, SWT.NONE);
		l29.setText("29");
		l29.setAlignment(SWT.CENTER);
		l29.setBounds(573, 72, 13, 15);
		
		Label l28 = new Label(grpValitudSektorid, SWT.NONE);
		l28.setText("28");
		l28.setAlignment(SWT.CENTER);
		l28.setBounds(554, 72, 13, 15);
		
		Label l27 = new Label(grpValitudSektorid, SWT.NONE);
		l27.setText("27");
		l27.setAlignment(SWT.CENTER);
		l27.setBounds(535, 72, 13, 15);
		
		Label l26 = new Label(grpValitudSektorid, SWT.NONE);
		l26.setText("26");
		l26.setAlignment(SWT.CENTER);
		l26.setBounds(516, 72, 13, 15);
		
		Label l25 = new Label(grpValitudSektorid, SWT.NONE);
		l25.setText("25");
		l25.setAlignment(SWT.CENTER);
		l25.setBounds(497, 72, 13, 15);
		
		Label l24 = new Label(grpValitudSektorid, SWT.NONE);
		l24.setText("24");
		l24.setAlignment(SWT.CENTER);
		l24.setBounds(478, 72, 13, 15);
		
		Label l31 = new Label(grpValitudSektorid, SWT.NONE);
		l31.setText("31");
		l31.setAlignment(SWT.CENTER);
		l31.setBounds(611, 72, 13, 15);
		
		Label l30 = new Label(grpValitudSektorid, SWT.NONE);
		l30.setText("30");
		l30.setAlignment(SWT.CENTER);
		l30.setBounds(592, 72, 13, 15);
		
		final ArrayList<Label> labels = new ArrayList<Label>();
		labels.add(l0);
		labels.add(l1);
		labels.add(l2);
		labels.add(l3);
		labels.add(l4);
		labels.add(l5);
		labels.add(l6);
		labels.add(l7);
		labels.add(l8);
		labels.add(l9);
		labels.add(l10);
		labels.add(l11);
		labels.add(l12);
		labels.add(l13);
		labels.add(l14);
		labels.add(l15);
		labels.add(l16);
		labels.add(l17);
		labels.add(l18);
		labels.add(l19);
		labels.add(l20);
		labels.add(l21);
		labels.add(l22);
		labels.add(l23);
		labels.add(l24);
		labels.add(l25);
		labels.add(l26);
		labels.add(l27);
		labels.add(l28);
		labels.add(l29);
		labels.add(l30);
		labels.add(l31);
		
		final Button order0 = new Button(grpValitudSektorid, SWT.NONE);
		order0.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order0.setEnabled(false);
				order0.setText(Integer.toString(order.size()));
				order.add(0);
			}
		});
		order0.setBounds(22, 44, 13, 25);
		
		Label lblNewLabel = new Label(grpValitudSektorid, SWT.NONE);
		lblNewLabel.setBounds(22, 27, 488, 15);
		lblNewLabel.setText("J\u00E4rjekord (Kliki nuppudele j\u00E4rjekorras, milles requeste saadetakse, kui l\u00E4heb valesti, reseti.)");
		
		final Button order1 = new Button(grpValitudSektorid, SWT.NONE);
		order1.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order1.setEnabled(false);
				order1.setText(Integer.toString(order.size()));
				order.add(1);
			}
		});
		order1.setBounds(41, 44, 13, 25);
		
		final Button order2 = new Button(grpValitudSektorid, SWT.NONE);
		order2.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order2.setEnabled(false);
				order2.setText(Integer.toString(order.size()));
				order.add(2);
			}
		});
		order2.setBounds(60, 44, 13, 25);
		
		final Button order3 = new Button(grpValitudSektorid, SWT.NONE);
		order3.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order3.setEnabled(false);
				order3.setText(Integer.toString(order.size()));
				order.add(3);
			}
		});
		order3.setBounds(79, 44, 13, 25);
		
		final Button order4 = new Button(grpValitudSektorid, SWT.NONE);
		order4.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order4.setEnabled(false);
				order4.setText(Integer.toString(order.size()));
				order.add(4);
			}
		});
		order4.setBounds(98, 44, 13, 25);
		
		final Button order5 = new Button(grpValitudSektorid, SWT.NONE);
		order5.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order5.setEnabled(false);
				order5.setText(Integer.toString(order.size()));
				order.add(5);
			}
		});
		order5.setBounds(117, 44, 13, 25);
		
		final Button order6 = new Button(grpValitudSektorid, SWT.NONE);
		order6.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order6.setEnabled(false);
				order6.setText(Integer.toString(order.size()));
				order.add(6);
			}
		});
		order6.setBounds(136, 44, 13, 25);
		
		final Button order7 = new Button(grpValitudSektorid, SWT.NONE);
		order7.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order7.setEnabled(false);
				order7.setText(Integer.toString(order.size()));
				order.add(7);
			}
		});
		order7.setBounds(155, 44, 13, 25);
		
		final Button order8 = new Button(grpValitudSektorid, SWT.NONE);
		order8.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order8.setEnabled(false);
				order8.setText(Integer.toString(order.size()));
				order.add(8);
			}
		});
		order8.setBounds(174, 44, 13, 25);
		
		final Button order9 = new Button(grpValitudSektorid, SWT.NONE);
		order9.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order9.setEnabled(false);
				order9.setText(Integer.toString(order.size()));
				order.add(9);
			}
		});
		order9.setBounds(193, 44, 13, 25);
		
		final Button order10 = new Button(grpValitudSektorid, SWT.NONE);
		order10.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order10.setEnabled(false);
				order10.setText(Integer.toString(order.size()));
				order.add(10);
			}
		});
		order10.setBounds(212, 44, 13, 25);
		
		final Button order11 = new Button(grpValitudSektorid, SWT.NONE);
		order11.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order11.setEnabled(false);
				order11.setText(Integer.toString(order.size()));
				order.add(11);
			}
		});
		order11.setBounds(231, 44, 13, 25);
		
		final Button order12 = new Button(grpValitudSektorid, SWT.NONE);
		order12.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order12.setEnabled(false);
				order12.setText(Integer.toString(order.size()));
				order.add(12);
			}
		});
		order12.setBounds(250, 44, 13, 25);
		
		final Button order13 = new Button(grpValitudSektorid, SWT.NONE);
		order13.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order13.setEnabled(false);
				order13.setText(Integer.toString(order.size()));
				order.add(13);
			}
		});
		order13.setBounds(269, 44, 13, 25);
		
		final Button order14 = new Button(grpValitudSektorid, SWT.NONE);
		order14.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order14.setEnabled(false);
				order14.setText(Integer.toString(order.size()));
				order.add(14);
			}
		});
		order14.setBounds(288, 44, 13, 25);
		
		final Button order15 = new Button(grpValitudSektorid, SWT.NONE);
		order15.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order15.setEnabled(false);
				order15.setText(Integer.toString(order.size()));
				order.add(15);
			}
		});
		order15.setBounds(307, 44, 13, 25);
		
		final Button order16 = new Button(grpValitudSektorid, SWT.NONE);
		order16.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order16.setEnabled(false);
				order16.setText(Integer.toString(order.size()));
				order.add(16);
			}
		});
		order16.setBounds(326, 44, 13, 25);
		
		final Button order17 = new Button(grpValitudSektorid, SWT.NONE);
		order17.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order17.setEnabled(false);
				order17.setText(Integer.toString(order.size()));
				order.add(17);
			}
		});
		order17.setBounds(345, 44, 13, 25);
		
		final Button order18 = new Button(grpValitudSektorid, SWT.NONE);
		order18.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order18.setEnabled(false);
				order18.setText(Integer.toString(order.size()));
				order.add(18);
			}
		});
		order18.setBounds(364, 44, 13, 25);
		
		final Button order19 = new Button(grpValitudSektorid, SWT.NONE);
		order19.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order19.setEnabled(false);
				order19.setText(Integer.toString(order.size()));
				order.add(19);
			}
		});
		order19.setBounds(383, 44, 13, 25);
		
		final Button order20 = new Button(grpValitudSektorid, SWT.NONE);
		order20.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order20.setEnabled(false);
				order20.setText(Integer.toString(order.size()));
				order.add(20);
			}
		});
		order20.setBounds(402, 44, 13, 25);
		
		final Button order21 = new Button(grpValitudSektorid, SWT.NONE);
		order21.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order21.setEnabled(false);
				order21.setText(Integer.toString(order.size()));
				order.add(21);
			}
		});
		order21.setBounds(421, 44, 13, 25);
		
		final Button order22 = new Button(grpValitudSektorid, SWT.NONE);
		order22.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order22.setEnabled(false);
				order22.setText(Integer.toString(order.size()));
				order.add(22);
			}
		});
		order22.setBounds(440, 44, 13, 25);
		
		final Button order23 = new Button(grpValitudSektorid, SWT.NONE);
		order23.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order23.setEnabled(false);
				order23.setText(Integer.toString(order.size()));
				order.add(23);
			}
		});
		order23.setBounds(459, 44, 13, 25);
		
		final Button order29 = new Button(grpValitudSektorid, SWT.NONE);
		order29.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order29.setEnabled(false);
				order29.setText(Integer.toString(order.size()));
				order.add(29);
			}
		});
		order29.setBounds(573, 44, 13, 25);
		
		final Button order28 = new Button(grpValitudSektorid, SWT.NONE);
		order28.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order28.setEnabled(false);
				order28.setText(Integer.toString(order.size()));
				order.add(28);
			}
		});
		order28.setBounds(554, 44, 13, 25);
		
		final Button order27 = new Button(grpValitudSektorid, SWT.NONE);
		order27.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order27.setEnabled(false);
				order27.setText(Integer.toString(order.size()));
				order.add(27);
			}
		});
		order27.setBounds(535, 44, 13, 25);
		
		final Button order26 = new Button(grpValitudSektorid, SWT.NONE);
		order26.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order26.setEnabled(false);
				order26.setText(Integer.toString(order.size()));
				order.add(26);
			}
		});
		order26.setBounds(516, 44, 13, 25);
		
		final Button order25 = new Button(grpValitudSektorid, SWT.NONE);
		order25.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order25.setEnabled(false);
				order25.setText(Integer.toString(order.size()));
				order.add(25);
			}
		});
		order25.setBounds(497, 44, 13, 25);
		
		final Button order24 = new Button(grpValitudSektorid, SWT.NONE);
		order24.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order24.setEnabled(false);
				order24.setText(Integer.toString(order.size()));
				order.add(24);
			}
		});
		order24.setBounds(478, 44, 13, 25);
		
		final Button order31 = new Button(grpValitudSektorid, SWT.NONE);
		order31.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order31.setEnabled(false);
				order31.setText(Integer.toString(order.size()));
				order.add(31);
			}
		});
		order31.setBounds(611, 44, 13, 25);
		
		final Button order30 = new Button(grpValitudSektorid, SWT.NONE);
		order30.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				order30.setEnabled(false);
				order30.setText(Integer.toString(order.size()));
				order.add(30);
			}
		});
		order30.setBounds(592, 44, 13, 25);
		
		final ArrayList<Button> orderButtons = new ArrayList<Button>();
		orderButtons.add(order0);
		orderButtons.add(order1);
		orderButtons.add(order2);
		orderButtons.add(order3);
		orderButtons.add(order4);
		orderButtons.add(order5);
		orderButtons.add(order6);
		orderButtons.add(order7);
		orderButtons.add(order8);
		orderButtons.add(order9);
		orderButtons.add(order10);
		orderButtons.add(order11);
		orderButtons.add(order12);
		orderButtons.add(order13);
		orderButtons.add(order14);
		orderButtons.add(order15);
		orderButtons.add(order16);
		orderButtons.add(order17);
		orderButtons.add(order18);
		orderButtons.add(order19);
		orderButtons.add(order20);
		orderButtons.add(order21);
		orderButtons.add(order22);
		orderButtons.add(order23);
		orderButtons.add(order24);
		orderButtons.add(order25);
		orderButtons.add(order26);
		orderButtons.add(order27);
		orderButtons.add(order28);
		orderButtons.add(order29);
		orderButtons.add(order30);
		orderButtons.add(order31);
		
		final Combo valimChoice = new Combo(grpValim, SWT.NONE);
		valimChoice.setItems(new String[] {"PowerPoint", "Preser 2", "Preser 3", "Self defined"});
		valimChoice.addSelectionListener (new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				int x = valimChoice.getSelectionIndex();
				if (x == 0){
					for(Button j:orderButtons){
						j.setText("");
					}
					order.removeAll(order);
					order.add(15);
					order.add(8);
					order.add(17);
					order.add(27);
					order.add(9);
					order.add(1);
					order.add(14);
					int n = 0;
					for(Integer i:order){
						Button a = orderButtons.get(i);
						//System.out.println(i);
						a.setText(Integer.toString(n));
						n++;
					}
				}
				if (x == 1){
					for(Button j:orderButtons){
						j.setText("");
					}
					order.removeAll(order);
					order.add(21);
					order.add(31);
					order.add(1);
					order.add(16);
					order.add(24);
					order.add(7);
					order.add(9);
					order.add(11);
					order.add(3);
					order.add(28);
					int n = 0;
					for(Integer i:order){
						Button a = orderButtons.get(i);
						//System.out.println(i);
						a.setText(Integer.toString(n));
						n++;
					}
				}
				if (x == 2){
					for(Button j:orderButtons){
						j.setText("");
					}
					order.removeAll(order);
					order.add(3);
					order.add(4);
					order.add(5);
					order.add(21);
					order.add(7);
					order.add(2);
					order.add(30);
					int n = 0;
					for(Integer i:order){
						Button a = orderButtons.get(i);
						//System.out.println(i);
						a.setText(Integer.toString(n));
						n++;
					}
				}
				for(Button i:orderButtons){	
					if (x < 3){
						i.setEnabled(false);
					}
					else{
						order.removeAll(order);
						for(Button j:orderButtons){
							j.setText("");
						}
						i.setEnabled(true);
					}
				}
			}
		});
		valimChoice.setBounds(10, 30, 91, 23);
		
		Group grpLugemispeaPos = new Group(shlAlgoritmidKvaketastel, SWT.NONE);
		grpLugemispeaPos.setText("Lugemispea pos.");
		grpLugemispeaPos.setBounds(10, 182, 110, 82);
		
		readLocation = new Text(grpLugemispeaPos, SWT.BORDER);
		
		readLocation.setBounds(10, 20, 90, 21);
		
		Button readConfirm = new Button(grpLugemispeaPos, SWT.NONE);
		readConfirm.setBounds(10, 47, 90, 25);
		readConfirm.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try { 
			        head = Integer.parseInt(readLocation.getText());
			        if (head < 0 || head > 31){
			        	Integer.parseInt("o");
			        }
			        for(Label i:labels){
						   if (Integer.parseInt(i.getText()) == head){
							   i.setBackground(new Color(null, 255, 1, 1));
						   }
						   else{
							   i.setBackground(new Color(null, 238, 238, 238));
						   }
						}
			    } catch(NumberFormatException f) { 
			    	readLocation.setText("False input");
			    }
			}
				
		});
		readConfirm.setText("Confirm");

		
		Group grpLugemispeaLigikaudneLiikumine = new Group(shlAlgoritmidKvaketastel, SWT.NONE);
		grpLugemispeaLigikaudneLiikumine.setText("Lugemispea ligikaudne liikumine");
		grpLugemispeaLigikaudneLiikumine.setBounds(126, 210, 648, 342);
		
		Composite composite = new Composite(grpLugemispeaLigikaudneLiikumine, SWT.EMBEDDED);
		composite.setBounds(10, 20, 628, 312);
		
		Frame frame = SWT_AWT.new_Frame(composite);
		

		//
		Panel out = new Panel();
		frame.add(out);
		final draw lol = new draw(outOrder, order,true);
		out.setLayout(new BorderLayout(0, 0));
		
		JRootPane rootPane = new JRootPane();
		out.add(rootPane);
		
		out.add(lol);
		ArrayList<Integer> emptyOne = new ArrayList<Integer>();
		emptyOne.add(-8);
		lol.setInput(emptyOne);
		lol.setOrder(emptyOne);
		lol.drawing();

		
		
		Group grpGo = new Group(shlAlgoritmidKvaketastel, SWT.NONE);
		grpGo.setText("Go!");
		grpGo.setBounds(10, 270, 110, 80);

		
		Button goButton = new Button(grpGo, SWT.NONE);
		goButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String output = "";
				int n = 0;
				for(Integer i:order){
					output = output + i;
				}
				
				//System.out.println(output);
				
				for(Button i:orderButtons){
					
				   if (i.getText() != ""){
					   bools[n] = true;
				   }
				   else{
					   bools[n] = false;
				   }
				   n++;
				}
				for (boolean k:bools){
					//System.out.println(k);
				}
				int x = algChoice.getSelectionIndex();
				System.out.println(x);
				
				if (x<2){
					lol.setBool(true);
				}
				else{
					lol.setBool(false);
				}
				
				if (x == 0){
					algoritm = new NOOP();
					algoritm.setUpAlgorithm(order, bools, head);
					outOrder = algoritm.getAlgorithmProcession();
				}
				if (x == 1){
					algoritm = new FCFS();
					algoritm.setUpAlgorithm(order, bools, head);
					outOrder = algoritm.getAlgorithmProcession();
				}
				if (x == 2){
					algoritm = new SSTF();
					algoritm.setUpAlgorithm(order, bools, head);
					outOrder = algoritm.getAlgorithmProcession();
				}
				if (x == 3){
					algoritm = new SCAN();
					algoritm.setUpAlgorithm(order, bools, head);
					outOrder = algoritm.getAlgorithmProcession();
				}
				if (x == 4){
					algoritm = new LOOK();
					algoritm.setUpAlgorithm(order, bools, head);
					outOrder = algoritm.getAlgorithmProcession();
				}
				if (x == 5){
					algoritm = new CSCAN();
					algoritm.setUpAlgorithm(order, bools, head);
					outOrder = algoritm.getAlgorithmProcession();
				}
				if (x == 6){
					algoritm = new CLOOK();
					algoritm.setUpAlgorithm(order, bools, head);
					outOrder = algoritm.getAlgorithmProcession();
				}
				String out = "";
				for(Integer i:outOrder){
						out = out + " " + Integer.toString(i);
					}
			
				outputText.setText(out);
				compareAmmount.setText(Integer.toString(outOrder.size()));
				
				
				lol.setInput(outOrder);
				lol.setOrder(order);
				lol.drawing();
			}
		});
		goButton.setBounds(10, 32, 90, 25);
		goButton.setText("Lets go!");
		
		Group grpVljund = new Group(shlAlgoritmidKvaketastel, SWT.NONE);
		grpVljund.setText("V\u00E4ljund");
		grpVljund.setBounds(126, 126, 648, 78);
		
		outputText = new Text(grpVljund, SWT.BORDER);
		outputText.setEditable(false);
		outputText.setBounds(10, 20, 628, 21);
		
		Label lblPrdumisteHulk = new Label(grpVljund, SWT.NONE);
		lblPrdumisteHulk.setText("P\u00F6\u00F6rdumiste hulk:");
		lblPrdumisteHulk.setBounds(10, 47, 97, 15);
		
		compareAmmount = new Text(grpVljund, SWT.BORDER);
		compareAmmount.setEditable(false);
		compareAmmount.setBounds(113, 44, 44, 21);
		
		Group grpReset = new Group(shlAlgoritmidKvaketastel, SWT.NONE);
		grpReset.setText("Reset");
		grpReset.setBounds(10, 356, 110, 82);
		
		Button btnReset = new Button(grpReset, SWT.NONE);
		btnReset.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				outputText.setText("");
				compareAmmount.setText("");
				ArrayList<Integer> emptyOne = new ArrayList<Integer>();
				emptyOne.add(-8);
				lol.setInput(emptyOne);
				lol.setOrder(emptyOne);
				lol.drawing();
				
				//System.out.println(head);
				for(Label j:labels){
					j.setBackground(new Color(null, 238, 238, 238));
				}
			}
		});
		btnReset.setBounds(10, 33, 90, 25);
		btnReset.setText("Reset");
		
		Group grpCredits = new Group(shlAlgoritmidKvaketastel, SWT.NONE);
		grpCredits.setText("Credits");
		grpCredits.setBounds(10, 444, 110, 108);
		
		Label lblMadeBy = new Label(grpCredits, SWT.NONE);
		lblMadeBy.setBounds(10, 30, 55, 15);
		lblMadeBy.setText("Made by - ");
		
		Label lblRainerKeerdo = new Label(grpCredits, SWT.NONE);
		lblRainerKeerdo.setBounds(10, 51, 90, 15);
		lblRainerKeerdo.setText("Rainer Keerdo");
		
		Label lblAllanKustavus = new Label(grpCredits, SWT.NONE);
		lblAllanKustavus.setBounds(10, 72, 90, 15);
		lblAllanKustavus.setText("Allan Kustavus");

	}
}