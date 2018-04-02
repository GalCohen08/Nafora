package Nafora.com.assignment.Assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ParseInputLine{
	
	private int[] array;
	private String input;
	
	public ParseInputLine(String input){
		this.input  = input;
		array = new int[9];
	}
	
	public int[] getLineArray(){
		perseLine(input);
		return array;
	}
	
	private int[] perseLine(String input){
		char[] chars = input.toCharArray();
		int index = 0;
		if(Character.isDigit(chars[0])){
			array[index] = Integer.parseInt(String.valueOf(chars[0]));
			index++;
		}else{
			index++;
		}
		for(int i = 1 ; i< chars.length ; i++){
			if(Character.isDigit(chars[i])){
				array[index] = Integer.parseInt(String.valueOf(chars[i]));
				index++;
			}else if(!Character.isDigit(chars[i]) && !Character.isDigit(chars[i-1])){
				index++;			
			}
		}
		return null;
	}
}
