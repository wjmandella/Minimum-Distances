// My solution to the HackerRank.com problem "Minimum Distances."
// https://www.hackerrank.com/challenges/minimum-distances/problem

import java.util.ArrayList;
import java.util.Scanner;

public class MinimumDistancesApp {
    static int minimumDistances(int[] a) {

    	int minDist = 100001;
    	ArrayList<Integer> tempArray = new ArrayList<>();
    	for(int idx1 = 0; idx1 < a.length; idx1++) {
    		for(int idx2 = (idx1+1); idx2 < a.length; idx2++) {
    			if(a[idx1] == a[idx2]) {
    				tempArray.add(Math.abs(idx1 - idx2));
    			}
    		}
    	}
    	System.out.println("TempArray = "+ tempArray.toString());
    	
    	for(int idx3 = 0; idx3 < tempArray.size(); idx3 ++) {
    		minDist = Math.min(minDist, tempArray.get(idx3));
    	}    
    	if(minDist == 100001) {
    		minDist = -1;
    	}
    	return minDist;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of array elements, n (integer 1-1000): "); 
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            System.out.print("Enter array element #"+(a_i +1)+" (integer 1-100000): "); 
            a[a_i] = in.nextInt();
        }
        int result = minimumDistances(a);
        System.out.println(result);
        in.close();
    }
}
