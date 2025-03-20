package com.codingTest.backjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
* 2798. 블랙잭
*
* */

public class B2_2798 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        String[] arr = br.readLine().split(" ");

        int[] numbers = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            numbers[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(numbers);

        int answer = 0;
        int sum = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    System.out.println("i = " + i + " j = " + j + " k = " + k);
                    sum = numbers[i] + numbers[j] + numbers[k];
                    if((m - answer) >= (m - sum) && (m - sum >= 0)){
                        answer = sum;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
