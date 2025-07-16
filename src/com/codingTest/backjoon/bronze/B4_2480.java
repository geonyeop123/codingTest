package com.codingTest.backjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int first = Integer.parseInt(input[0]);
        int second = Integer.parseInt(input[1]);
        int third = Integer.parseInt(input[2]);
        int sum = 0;
        // 모두 다른 경우
        if(first != second && second != third && first != third){
            int max = Math.max(first, Math.max(second, third));
            sum = max * 100;
        // 모두 같은 경우
        }else if(first == second && first == third){
            sum = 10000 + first * 1000;
        }
        // 둘만 같은 경우 f - s, f - t가 아니면 무조건 s
        else if(first == second || first == third){
            sum = 1000 + first * 100;
        }else {
            sum = 1000 + second * 100;
        }



        System.out.println(sum);
    }
}
