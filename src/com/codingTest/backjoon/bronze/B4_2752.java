package com.codingTest.backjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B4_2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int[] arr = new int[3];
        String[] split = br.readLine().split(" ");
        for(int i = 0; i < 3; i++){
            arr[i] = Integer.parseInt(split[i]);
        }

        Arrays.sort(arr);

        for(int i : arr){
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}
