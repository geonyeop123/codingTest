package com.codingTest.backjoon.bronze.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 2231. 분해 합
*
* */

public class Main {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int length = s.length();
        int n = Integer.parseInt(s);
        int answer = 0;

        for(int i = (n - length * 9); i < n; i++) {
            int number = i;
            int sum = 0;

            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if(n == sum + i){
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
