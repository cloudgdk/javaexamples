package javabase;

import java.util.HashMap;

public class ArrayIntervalsTest2 {

	


	    public static int[] twoSum(int[] nums, int target) {
	        // Create a hashmap to store the elements and their indices
	        HashMap<Integer, Integer> map = new HashMap<>();
	        
	        // Iterate through the array
	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];
	            // If the complement exists in the hashmap, return the indices
	            if (map.containsKey(complement)) {
	                return new int[] { map.get(complement), i };
	            }
	            // Otherwise, add the current element and its index to the hashmap
	            map.put(nums[i], i);
	        }
	        
	        // No solution found, return an empty array
	        return new int[] {};
	    }
	

	
	    public static void main(String[] args) {
	       

	        int[] nums = {2, 7, 11, 15};
	        int target = 9;
	        int[] result = twoSum(nums, target);
	        for (int index : result) {
	            System.out.print(index + " ");
	        }
	        // Output: 0 1
	    }
	
}
