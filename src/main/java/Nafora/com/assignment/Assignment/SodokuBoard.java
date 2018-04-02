package Nafora.com.assignment.Assignment;

import java.util.Arrays;

public class SodokuBoard {

	private static int[][] board;
	private int size;
	public SodokuBoard(int size){
		this.board = new int[size][size];
		this.size = size;
	}
	
	void SetBoardRow(int row, int[] array){
		board[row] = Arrays.copyOf(array, array.length);
	}
	
	public void printBoard(){
        for (int i = 0; i < 9; ++i) {
            if (i % 3 == 0)
                System.out.println("+-------+-------+-------+");
            for (int j = 0; j < 9; ++j) {
                if (j % 3 == 0){
                	System.out.print("| ");
                }
                if(board[i][j] == 0){
                	System.out.print(" ");
                }else{
                	System.out.print(board[i][j]);
                }
                System.out.print(' ');
            }
            System.out.println("|");
        }
        System.out.println("+-------+-------+-------+");
	}
	
	public int[][] getSodokuBoard(){
		return board;
	}
	
	public boolean solveSodoku(int i, int j){
        if (i == size){
        	i = 0;
            if (++j == size){
                return true;
            }
        }
        if (board[i][j] != 0){
            return solveSodoku(i+1,j);
        }
        for (int val = 1; val <= size; ++val) {
            if (isLegal(i,j,val)) {
            	board[i][j] = val;
                if (solveSodoku(i+1,j)){
                	  return true;
                }
            }
        }
        board[i][j] = 0; 
        return false;
	}
	
	 static boolean isLegal(int row, int col, int val){
		 for (int i = 0; i < 9; ++i){
			 if(val == board[i][col]){
				 return false;
			 }
		 }
		 for (int j = 0; j < 9; ++j){
			 if(val == board[row][j]){
				 return false;
			 }
		 }
		 int smallRowOffset = (row / 3)*3;
	     int smallColOffset = (col / 3)*3;
	     for (int k = 0; k < 3; ++k){
	    	 for (int m = 0; m < 3; ++m){
	             if (val == board[smallRowOffset+k][smallColOffset+m]){
	            	 return false;
	             }
	    	 }
	     }
		return false;
	 }
	

}
