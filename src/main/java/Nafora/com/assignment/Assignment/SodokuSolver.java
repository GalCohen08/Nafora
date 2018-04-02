package Nafora.com.assignment.Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class SodokuSolver 
{
	private static BufferedReader br;
    public static void main( String[] argv ) throws Exception
    {
    	SodokuBoard sodokuBoard = new SodokuBoard(9);
    	String dataFilePath = argv[0];
    	br = new BufferedReader(new FileReader(dataFilePath));
        String newLine;
        int i =0;
        while((newLine = br.readLine()) !=null){       
        	if(!newLine.isEmpty()){
        		int[] arrayLine = Arrays.copyOf(new ParseInputLine(newLine).getLineArray(), new ParseInputLine(newLine).getLineArray().length);
        		sodokuBoard.SetBoardRow(i,  Arrays.copyOf(arrayLine, arrayLine.length));
        		i++;
        	}  
        }
        sodokuBoard.solveSodoku(0, 0);
        sodokuBoard.printBoard();
    }
}
