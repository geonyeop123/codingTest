package com.codingTest.backjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_2775 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        for(int i = 1; i <= cnt; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] floor  = new int[k + 1][n];
            for(int j = 0; j < n; j++) {
                floor[0][j] = j + 1;
            }

            for(int j = 1; j <= k; j++) {
                int sum = 0;
                for(int l = 0; l < n; l++) {
                    sum += floor[j - 1][l];
                    floor[j][l] = sum;
                }
            }

            sb.append(floor[k][n - 1]).append("\n");
        }
        System.out.println(sb);
    }
}
