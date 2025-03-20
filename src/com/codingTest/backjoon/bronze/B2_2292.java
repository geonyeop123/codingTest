package com.codingTest.backjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_2292 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        int max = 1;
        int step = 6;

        for(int i = 0; i <= n;i++) {
            answer++;
            max = max + i * step;
            if(n <= max){
                break;
            }
        }

        System.out.println(answer);
    }
}
