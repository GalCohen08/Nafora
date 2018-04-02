package Nafora.com.assignment.Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
/**
 * Hello world!
 *
 */
public class SodokuSolver 
{
	private static BufferedReader br;
    public static void main( String[] argv ) throws Exception
    {
    	System.out.println(argv[0]);
    	String dataFilePath = argv[0];
    	br = new BufferedReader(new FileReader(dataFilePath));
        String newLine = br.readLine();
        while((newLine = br.readLine()) !=null){
        	System.out.println(newLine);
        }   	
    }
}
