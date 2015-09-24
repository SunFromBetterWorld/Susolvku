/**
 * 
 */
package org.createingabetterworld.sun;

import java.util.Random;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

/**
 * 
 * ======Susolvku======
 * @author Sun
 * for creatingabetterworld.org
 * BoardModel.java
 * Last edited: 17.09.2015
 * 
 * TODO
 * 
 *
 */
public class BoardModel extends AbstractTableModel{
	public static int[][] intBoard = new int[9][9];
	Random rndGen = new Random();
	
	public BoardModel(){
		/*for(int r=0;r<9;r++){
			for(int c=0;c<9;c++){
				int intAdd = rndGen.nextInt(10);
				intBoard[r][c] = intAdd;
			}
			
		}*/
		intBoard[0][0] = 0;
		intBoard[0][1] = 0;
		intBoard[0][2] = 3;
		intBoard[0][3] = 4;
		intBoard[1][0] = 3;
		intBoard[1][1] = 4;
		intBoard[1][2] = 0;
		intBoard[1][3] = 0;
		intBoard[2][0] = 0;
		intBoard[2][1] = 0;
		intBoard[2][2] = 4;
		intBoard[2][3] = 3;
		intBoard[3][0] = 3;
		intBoard[3][3] = 4;
		intBoard[3][2] = 0;
		intBoard[3][0] = 0;
	}
	/**
	 * @param args
	 */
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return intBoard.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return intBoard[0].length;
	}

	@Override
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		if(intBoard[row][col]==0){
			return null;
		}else{
			return new Integer(intBoard[row][col]);			
		}
		
	}
	public boolean isCellEditable(int row, int col){
		return true;
	}
	
	  public void setValueAt(Object obj, int row, int col) {
		  
		    intBoard[row][col] = Integer.valueOf((String) obj);
		    
		  }
	 public int[][] getBoard(){
		 return intBoard;
	 }
}
