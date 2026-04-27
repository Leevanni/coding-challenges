package com.example.challenges;

import java.util.HashMap;
import java.util.LinkedList;

public class CodingQuestions {

    // Find factors of N
    public static int factors(int n) {
        int count = 0;
     
     for(int i = 0; i * i <= n; i++) {
    	 if(n % i == 0) {
    		 
    		 if(i == n / i) {
    			 count++;
    		 } else {
    			 count += 2;
    		 }
    	 }
     }
     
     return count;
    
    }

    public static void main(String[] args) {

    }
    
    
    public static int isPrimeNumber(int n) {
    	
    	for(int i = 1; i <= n; i++) {
    		if(i * i == n) {
    			return i;
    		}
    	}
    	
    	return -1;
    }
    

//    public int binarySearchTree(int[] nums, int target) {
//    	int left = 0;
//    	int right = nums.length - 1;
//    	
//    	while (left <= right) {
//    		int mid = left + (right - left) / 2;
//    		
//    		if (nums[mid] == target) {
//    			return mid;
//    		}
//    		
//    		if (nums[mid] < target) {
//    			left = mid + 1;
//    		} else {
//    			right = mid - 1;
//    		}
//    	}
//    	
//    	return -1; // Value not found
//    }
    
    public int searchFirstPosition(int[] nums, int target) {
    	int left = 0;
    	int right = nums.length - 1;
    	
    	while (left <= right) {
    		int mid = left + (right - left) / 2;
    		
    		if (nums[mid] == target) {
    			return mid;
    		}
    		
    		if (nums[mid] < target) {
    			left = mid + 1;
    		} else {
    			right = mid - 1;
    		}
    	}
    	
    	return left; 
    }
    
    public int firstBadVerstion(int n) {
    	
    	
    	int left = 1;
    	int right = n;
    	
    	while (left < right) {
    		
    		int mid = left + (right - left) / 2;
    		
    		if (isBadVersion(mid)) {
    			right = mid;
    		} else {
    			left = mid + 1;
    		}
    	}
    	
    	return left;
    }

	public boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public int findPeakElement(int[] nums) {
		
		
		int left = 0;
		int right = nums.length - 1;
		
		while (left < right) {
			int mid = left + (right - left) / 2;
			
			if (nums[mid] < nums[ mid + 1]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		
		return left;
	}

	
	public static int[] twoSum(int nums[], int target) {
		
		int[] results = new int[2];
		
		HashMap<Integer, Integer> hash = new HashMap<>();
		
		for (int i = 0; i < nums[i]; i++) {
			
			int compliment = target - nums[i];
			
			if (hash.containsKey(compliment)) {
				results[1] = i;
				results[0] = hash.get(compliment);
				
				return results;
			} else {
				hash.put(nums[i], i);
			}
		}
		
		return results;
	}
	
	
	public static boolean validPalidrome(String str) {
		str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
		int left = 0;
		int right = str.length() - 1;
		char[] charArray = str.toCharArray();
		
		while (left <= right) {
			if (charArray[left] != charArray[right]) {
				return false;
			}
			
			left += 1;
			right -= 1;
		}
		
		return true;
	}
	
	public static void middleOfLinkedList(LinkedList list) {
	
	
	}
	
	public int[][] modifiedMatrix(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		int[][] answer = new int[rows][cols];
		int[] columnMax = new int[cols];
		
		for (int col = 0; col < cols; col++) {
			int max = matrix[0][cols];
			
			for (int row = 0; row < rows; row++) {
				
				if (matrix[col][row] > max) {
					max = matrix[col][row];
				}
			}
			
			columnMax[col] = max;
		}
		
		
		for (int row = 0; row < rows; row++ ) {
			for (int col = 0; col < cols; col++) {
				
				if (matrix[col][row] == -1) {
					answer[col][row] = columnMax[col];
				} else {
					answer[col][row] = matrix[col][row];
				}
			}
		}
		
		return answer;
	}
	
	
	public void fixedSlidingWindow(int[] nums, int windowSize) {
		
	}
	
	
	public String reverseString(String string) {
		
		String str = "";
		
		for (int i = 0; i < string.length(); i++) {
			str = string.charAt(i) + str;
		}
		
		return str;
	}
}
