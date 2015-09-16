/**
 * 
 */
package org.createingabetterworld.sun;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTable;


/**
 * 
 * ======Susolvku======
 * @author Gizeh
 * for creatingabetterworld.org
 * GUI.java
 * Last edited: 16.09.2015
 * 
 * TODO fill board
 * 
 *
 */
public class GUI extends JFrame implements ActionListener {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI();
	}
	public GUI(){
		setTitle("Susolvko");
		setVisible(true);
		setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		make();		
		
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void make() {
		// TODO Auto-generated method stub
		List<Integer> lsBoard = new ArrayList<Integer>();
		List<String> lsNames = new ArrayList<String>();
		Random rndGen = new Random();		
		Container conCP = getContentPane();
		conCP.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		for(int i=0; i < 82;i++){
			int intAdd = rndGen.nextInt(9) + 1; // Get a random number between 0-8 (9 is EXclusive) and then add 1 to make it fit to Sudoku digits (1-9)
			lsBoard.add(intAdd); // Now adding to the IntList, this will probably be removed once users are able to enter their own puzzles
		
		}
		Vector<Integer> vecNumbers = new Vector<>();
		//vecNumbers.addAll(lsBoard);
		for(int i=0; i < 10;i++){
			lsNames.add(Integer.toString(i));
		}
		Vector<String> vecNames = new Vector();
		//vecNames.addAll(lsNames);
		JTable tblBoard = new JTable(vecNumbers,vecNames);
		conCP.add(tblBoard);
		pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
