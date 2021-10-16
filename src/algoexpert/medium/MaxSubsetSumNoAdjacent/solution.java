package algoexpert.medium.MaxSubsetSumNoAdjacent;

import java.util.*;

class Program {
  public static int maxSubsetSumNoAdjacent(int[] array) {
    // Write your code here.
		if(array.length == 0) return 0;
		if(array.length == 1) return array[0];
		array[1] = Math.max(array[0],array[1]);
		for(int i=2;i<array.length;i++){
			array[i] = Math.max(array[i-1], array[i] + array[i-2]);
		}
    return array[array.length-1];
  }
}
