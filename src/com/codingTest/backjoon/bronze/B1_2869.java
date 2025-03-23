package com.codingTest.backjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_2869 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        long v = Long.parseLong(arr[2]);
        long result = 1;

        if(a != v) {
            result += (int) Math.ceil((v - a) / (double) (a - b));
        }

        System.out.println(result);
    }
}
