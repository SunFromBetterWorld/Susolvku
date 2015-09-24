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
		intBoard[0][1] = 2;
		intBoard[0][3] = 1;
		intBoard[0][4] = 7;
		intBoard[0][5] = 8;
		intBoard[0][7] = 3;
		intBoard[1][1] = 4;
		intBoard[1][3] = 3;
		intBoard[1][5] = 2;
		intBoard[1][7] = 9;
		intBoard[2][0] = 1;
		intBoard[2][8] = 6;
		intBoard[3][2] = 8;
		intBoard[3][3] = 6;
		intBoard[3][5] = 3;
		intBoard[3][6] = 5;
		intBoard[4][0] = 3;
		intBoard[4][8] = 4;
		intBoard[5][2] = 6;
		intBoard[5][3] = 7;
		intBoard[5][5] = 9;
		intBoard[5][6] = 2;
		intBoard[6][0] = 9;
		intBoard[6][8] = 2;
		intBoard[7][1] = 8;
		intBoard[7][3] = 9;
		intBoard[7][5] = 1;
		intBoard[7][7] = 6;
		intBoard[8][1] = 1;
		intBoard[8][3] = 4;
		intBoard[8][4] = 3;
		intBoard[8][5] = 6;
		intBoard[8][7] = 5;
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
