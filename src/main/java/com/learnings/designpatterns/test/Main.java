package com.learnings.designpatterns.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Result {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int minSum = 0;
        int maxSum = 0;

        Collections.sort(arr);
        for(int i=0; i<=arr.size()-2; i++ ){
            minSum = minSum + arr.get(i);
        }
        for(int i=1; i<=arr.size()-1; i++ ){
            maxSum = maxSum + arr.get(i);
        }
        System.out.print(minSum+" "+maxSum);

    }
}

public class Main{
    public static void main(String args[]) {
        Result.miniMaxSum(Arrays.asList(3,5,7,8,4,2));
    }

}