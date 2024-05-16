package javabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIntervelTest1 {


	    public static int[][] merge(int[][] intervals) {
	        if (intervals == null || intervals.length == 0) {
	            return new int[0][];
	        }

	        // Sort intervals based on start times
	        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

	        List<int[]> mergedIntervals = new ArrayList<>();
	        mergedIntervals.add(intervals[0]);

	        for (int i = 1; i < intervals.length; i++) {
	            int[] currentInterval = intervals[i];
	            int[] lastMergedInterval = mergedIntervals.get(mergedIntervals.size() - 1);
	      

	            // If the current interval overlaps with the last merged interval, merge them
	            if (currentInterval[0] <= lastMergedInterval[1]) {
	                lastMergedInterval[1] = Math.max(lastMergedInterval[1], currentInterval[1]);
	            } else {
	                // If the current interval doesn't overlap, add it to the merged list
	                mergedIntervals.add(currentInterval);
	            }
	        }

	        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
	    }
	


	    public static void main(String[] args) {
	        

	        int[][] intervals1 = {{1,3},{2,6},{8,10},{15,18}};
	        int[][] result1 = merge(intervals1);
	        for (int[] interval : result1) {
	            System.out.println(Arrays.toString(interval));
	        }
	        // Output: [1, 6], [8, 10], [15, 18]

	        int[][] intervals2 = {{1,4},{4,5}};
	        int[][] result2 = merge(intervals2);
	        for (int[] interval : result2) {
	            System.out.println(Arrays.toString(interval));
	        }
	        // Output: [1, 5]
	    }
	

}
