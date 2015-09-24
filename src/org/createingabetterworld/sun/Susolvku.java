/**
 * 
 */
package org.createingabetterworld.sun;

import java.util.Arrays;

/**
 * 
 * ======Susolvku======
 * @author Sun
 * for creatingabetterworld.org
 * Susolvku.java
 * Last edited: 17.09.2015
 * 
 * TODO algorithm
 * 
 *
 */
public class Susolvku {

	/**
	 * @param args
	 */
	public boolean boolSolved(int[][] board){
		int row = 0, col = 0;
		if(!intEmpty(board,row,col)){
			return true;
		}
		for(int num=1; num<=board[0].length;num++){
			if(isSafe(board,row,col,num)){
				board[row][col] = num;
				if(boolSolved(board)){
					return true;
				}
				board[row][col] = 0;
			}
		}
		return false;
			
	}
	public Susolvku(){
		int[][] intBoard = BoardModel.intBoard;		
		if(boolSolved(intBoard)){
			//update board
		}else{
			System.out.println("No solution found");
		}
		
	}
	private boolean intEmpty(int[][] board,int row, int col){
		for(row=0;row<GUI.tblBoard.getRowCount();row++){
			for(col=0;col<GUI.tblBoard.getColumnCount();col++){
				if(board[row][col]==0){					
					return true;				
				}
			}

		}
		return false;}
	private boolean isSafe(int[][] board, int row, int col, int num){
		return (!usedinRow(board,row,num)) && (!usedinCol(board,col,num)) && (!usedinBox(board,row/3,col/3,num));

	}
	private boolean usedinCol(int[][] board, int col, int num) {
		// TODO Auto-generated method stub
		for(int row=0;row<board[0].length;row++){
			if(board[row][col] == num){
				return true;
			}
		}
		return false;
	}
	private boolean usedinRow(int[][] board, int row, int num) {
		// TODO Auto-generated method stub
		for(int col =0;col<board[row].length;col++){
			if(board[row][col] == num){
				return true;
			}
		}
		return false;
	}
	private boolean usedinBox(int[][] board, int rowStart, int colStart, int num) {
		// TODO Auto-generated method stub
		for(int row = 0; row<board[0].length;row++){
			for(int col=0; col<board[row].length;col++){
				if(board[row+rowStart][col+colStart] == num){
					return true;
				}

			}
		}
		return false;
	}
}
