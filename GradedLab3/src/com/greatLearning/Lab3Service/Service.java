package com.greatLearning.Lab3Service;

import java.util.*;

public class Service {

	public boolean balanceCheck(String exp) {
		
		Stack stack = new Stack();
		
		//expression traversing
		for(int i =0; i< exp.length(); i++) {
			
			char x = exp.charAt(i);
			
			if(x == '(' || x == '{' || x == '[') {
				stack.push(x);
				continue;
			}
			
			//check stack empty
			if(stack.isEmpty())
				return false;
			
			char check;
			
			switch(x) {
			case ')' : check = (char) stack.pop(); 
            if (check == '{' || check == '[') 
                return false; 
            break; 
			 case '}': 
	                check = (char) stack.pop(); 
	                if (check == '(' || check == '[') 
	                    return false; 
	                break; 
	  
	            case ']': 
	                check = (char) stack.pop(); 
	                if (check == '(' || check == '{') 
	                    return false; 
	                break; 
			
			}
			
		}//for loop
		
		
		// Check Empty Stack 
        return (stack.isEmpty()); 
	}

}
