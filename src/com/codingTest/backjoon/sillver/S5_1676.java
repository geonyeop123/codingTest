package com.codingTest.backjoon.sillver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S5_1676 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        int n = Integer.parseInt(input);
        int cnt = 0;
        while (n >= 5) {
            cnt += n / 5;
            n /= 5;
        }

        System.out.println(cnt);
    }
}
