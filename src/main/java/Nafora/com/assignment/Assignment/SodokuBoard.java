package Nafora.com.assignment.Assignment;

import java.util.Arrays;

public class SodokuBoard {

	private int[][] board;

	public SodokuBoard(int size){
		this.board = new int[size][size];
	}
	
	void SetBoardRow(int row, int[] array){
		board[row] = Arrays.copyOf(array, array.length);
	}
	
	public void printBoard(){
		for (int k = 0; k < board.length; k++) {
	    	   System.out.print(Arrays.toString(board[k]) + " ");
	    	   System.out.println("\n");
	        }
	}
	

}
