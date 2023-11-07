package com.greatlearning.BST.main;

import java.util.Scanner;
import com.greatlearning.BST.service.Node;
import com.greatlearning.BST.service.FindPair;

public class Driver {

	public static void main(String[] args) {
		
		Node root = null;
		
		Scanner sc = new Scanner(System.in);
		FindPair findPair = new FindPair();

		//inserting value to BST
		
		root = findPair.insert(root, 40);
		root = findPair.insert(root, 20);
		root =findPair.insert(root, 60);
		root = findPair.insert(root, 10);
		root = findPair.insert(root, 30);
		root = findPair.insert(root, 50);
		root = findPair.insert(root, 70);
		
		System.out.println("Enter the sum value: ");
		int sum = sc.nextInt();
		
		findPair.findPairGivenSum(root,sum);
			

	}

}
