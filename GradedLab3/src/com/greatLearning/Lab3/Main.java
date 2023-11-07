package com.greatLearning.Lab3;

import java.util.Scanner;
import com.greatLearning.Lab3Service.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String exp = "({[]})";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the bracket expression for balance checking: ");
		String exp = sc.next();
		
		
		Service service = new Service();
		
		if(service.balanceCheck(exp)) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
			
		
	}

}
