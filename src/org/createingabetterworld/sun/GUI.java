/**
 * 
 */
package org.createingabetterworld.sun;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


/**
 * 
 * ======Susolvku======
 * @author Sun
 * for creatingabetterworld.org
 * GUI.java
 * Last edited: 17.09.2015
 * 
 * TODO 
 * 
 *
 */
public class GUI extends JFrame implements ActionListener {
	private JButton btnSolve,btnExit;
	public static JTable tblBoard;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI();
	}
	public GUI(){
		setTitle("Susolvko");		
		setSize(400,350);
		setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		make();		

	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void make() {
		// TODO Auto-generated method stub
		Vector<String> vecNumbers;
		Vector<String> vecNames = new Vector<String>();
		Vector<Vector> vecRows = new Vector<Vector>();

		Random rndGen = new Random();		
		Container conCP = getContentPane();
		conCP.setLayout(new BorderLayout());
		/*for(int i=1; i < 10;i++){
			vecNumbers = new Vector<String>();
			for(int b=1; b < 10;b++){

				int intAdd = rndGen.nextInt(9) + 1; // Get a random number between 0-8 (9 is EXclusive) and then add 1 to make it fit to Sudoku digits (1-9)
				vecNumbers.add(Integer.toString(intAdd)); // Now adding to the IntList, this will probably be removed once users are able to enter their own puzzles
			}
			vecRows.add(vecNumbers);
		}*/

		//vecNumbers.addAll(lsBoard);
		for(int i=1; i < 10;i++){
			vecNames.add(Integer.toString(i));
		}
		//vecNames.addAll(lsNames);
		//JTable tblBoard = new JTable(vecRows,vecNames);
		tblBoard = new JTable(new BoardModel());
		tblBoard.setFont(new Font("Open Sans",Font.BOLD,20));
		tblBoard.setRowHeight(30);
		DefaultTableCellRenderer crendCenter = new DefaultTableCellRenderer();
		crendCenter.setHorizontalAlignment(JLabel.CENTER);		
		tblBoard.setDefaultRenderer(Object.class,crendCenter);
		for(int u=0;u<tblBoard.getColumnCount();u++){
			tblBoard.getColumnModel().getColumn(u).setPreferredWidth(20);
		}
		conCP.add(tblBoard,BorderLayout.NORTH);
		JPanel pnSouth = new JPanel(new FlowLayout());
		btnSolve = new JButton("Solve");
		btnSolve.addActionListener(this);
		btnExit = new JButton("Exit");
		btnExit.addActionListener(this);
		pnSouth.add(btnSolve, BorderLayout.SOUTH);
		pnSouth.add(btnExit, BorderLayout.SOUTH);
		conCP.add(pnSouth);		
		setLocationRelativeTo(null);
		revalidate();
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(btnExit)){
			System.exit(0);
		}else if(e.getSource().equals(btnSolve)){
			new Susolvku();
		}
	}


}
