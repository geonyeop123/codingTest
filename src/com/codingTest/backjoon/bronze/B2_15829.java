package com.codingTest.backjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_15829 {
    public static void main(String[] args)throws IOException {
        int r = 31;
        int m = 1234567891;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        String s = br.readLine();

        long sum = 0;
        long powValue = 1;

        for (int i = 0; i < length; i++) {
            int number = (s.charAt(i) - 96);
            sum += number * powValue % m;
            powValue = powValue * r % m;
        }

        System.out.println(sum % m);
    }
}
