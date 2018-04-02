package Nafora.com.assignment.Assignment;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


import Nafora.com.assignment.Assignment.ParseInputLine;;

public class TestParseInputLine {
	
	ParseInputLine parseInputLine1;
	ParseInputLine parseInputLine2;
	ParseInputLine parseInputLine3;
	ParseInputLine parseInputLine4;
	ParseInputLine parseInputLine5;
	ParseInputLine parseInputLine6;
	ParseInputLine parseInputLine7;
	ParseInputLine parseInputLine8;
	ParseInputLine parseInputLine9;

	String[] array;
 	
	@Before
	public void setUp() throws Exception{
		String str1 = "2;;;6;;7;;;";
		parseInputLine1 = new ParseInputLine(str1);
		parseInputLine2 = new ParseInputLine(";;9;1;;5;;;");
		parseInputLine3 = new ParseInputLine("7;3;;4;;8;1;;");
		parseInputLine4 = new ParseInputLine("3;;6;9;;2;4;;8");
		parseInputLine5 = new ParseInputLine(";;;3;5;;;2;");
		parseInputLine6 = new ParseInputLine(";;;2;;4;7;;");
		parseInputLine7 = new ParseInputLine(";;3;;1;6;5;;4");
		parseInputLine8 = new ParseInputLine(";4;;5;;;;1;3");
		parseInputLine9 = new ParseInputLine("1;7;;;;8;9;;");
		
	}
	
	@Test
	public void testParseInputLine1() {
		int expectedArray[] = new int[9];
		expectedArray[0]=2;
		expectedArray[3]=6;
		expectedArray[5]=7;
		assertArrayEquals(expectedArray, parseInputLine1.getLineArray());
	}
	
	@Test
	public void testParseInputLine2() {
		int expectedArray[] = new int[9];
		expectedArray[2]=9;
		expectedArray[3]=1;
		expectedArray[5]=5;
		assertArrayEquals(expectedArray, parseInputLine2.getLineArray());
	}
	
	@Test
	public void testParseInputLine3() {
		int expectedArray[] = new int[9];
		expectedArray[0]=7;
		expectedArray[1]=3;
		expectedArray[3]=4;
		expectedArray[5]=8;
		expectedArray[6]=1;
		assertArrayEquals(expectedArray, parseInputLine3.getLineArray());
	}
	
	@Test
	public void testParseInputLine4() {
		int expectedArray[] = new int[9];
		expectedArray[0]=3;
		expectedArray[2]=6;
		expectedArray[3]=9;
		expectedArray[5]=2;
		expectedArray[6]=4;
		expectedArray[8]=8;
		assertArrayEquals(expectedArray, parseInputLine4.getLineArray());
	}
	
	@Test
	public void testParseInputLine5() {
		int expectedArray[] = new int[9];
		expectedArray[3]=3;
		expectedArray[4]=5;
		expectedArray[7]=2;
		assertArrayEquals(expectedArray, parseInputLine5.getLineArray());
	}
	
	@Test
	public void testParseInputLine6() {
		int expectedArray[] = new int[9];
		expectedArray[3]=2;
		expectedArray[5]=4;
		expectedArray[6]=7;
		assertArrayEquals(expectedArray, parseInputLine6.getLineArray());
	}
	
	@Test
	public void testParseInputLine7() {
		int expectedArray[] = new int[9];
		expectedArray[2]=3;
		expectedArray[4]=1;
		expectedArray[5]=6;
		expectedArray[6]=5;
		expectedArray[8]=4;
		assertArrayEquals(expectedArray, parseInputLine7.getLineArray());
	}
	
	@Test
	public void testParseInputLine8() {
		int expectedArray[] = new int[9];
		expectedArray[1]=4;
		expectedArray[3]=5;
		expectedArray[7]=1;
		expectedArray[8]=3;
		assertArrayEquals(expectedArray, parseInputLine8.getLineArray());
	}
	
	@Test
	public void testParseInputLine9() {
		int expectedArray[] = new int[9];
		expectedArray[0]=1;
		expectedArray[1]=7;
		expectedArray[5]=8;
		expectedArray[6]=9;
		assertArrayEquals(expectedArray, parseInputLine9.getLineArray());
	}
}
