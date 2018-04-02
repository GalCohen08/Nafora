package Nafora.com.assignment.Assignment;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


import Nafora.com.assignment.Assignment.ParseInputLine;;

public class TestParseInputLine {
	
	ParseInputLine parseInputLine;

	String[] array;
 	
	@Before
	public void setUp() throws Exception{
		String str = "2;;;6;;7;;;";
		parseInputLine = new ParseInputLine(str);
	}
	
	@Test
	public void testParseInputLine() {
		int expectedArray[] = new int[9];
		expectedArray[0]=2;
		expectedArray[3]=6;
		expectedArray[5]=7;

		assertArrayEquals(expectedArray, parseInputLine.getLineArray());
	}
}
