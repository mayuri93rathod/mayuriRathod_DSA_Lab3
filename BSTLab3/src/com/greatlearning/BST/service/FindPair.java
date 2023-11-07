package com.greatlearning.BST.service;

import java.util.*;

public class FindPair {
	
	public Node insert(Node root, int key) //inserting node to BST
	{
		if (root == null)
			return new Node(key);
		if (key < root.data)
			root.left = insert(root.left, key);
		else
			root.right = insert(root.right, key);
		return root;
	}

	public void findPairGivenSum(Node root, int sum) {
		
		HashSet<Integer> set = new HashSet<Integer>();//to maintain record
		
		if (!findPair(root, sum, set))
			System.out.print("Pairs do not exit" + "\n");
	}

	public boolean findPair(Node root, int sum, HashSet<Integer> set) {
		
					if (root == null)
						return false;
			
					if (findPair(root.left, sum, set))
						return true;
			
					if (set.contains(sum - root.data)) {
						System.out.println("Pair is found ("
								+ (sum - root.data) + ", "
								+ root.data + ")");
						return true;
					}
					else
						set.add(root.data);
			
					return findPair(root.right, sum, set);
					
	}
	

}
