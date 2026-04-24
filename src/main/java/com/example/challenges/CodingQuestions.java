package com.example.challenges;

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
    
    
    public static int binarySearch(int[] num, int target) {
    	
    	int left  = 0;
    	int right = num.length - 1;
    	
    	while (left <= right) {
    		
    		int mid = left + (right - left) / 2;
    		
    		if (num[mid] == target) {
    			return mid;
    		}
    		
    		if (num[mid] < target) {
    			left = mid + 1;
    			
    		} else {
    			right = mid - 1;
    		}
    	}
    	
    	return -1;
    }
}
