package com.codingTest.backjoon.bronze;

import java.io.*;

/*
* 30802. 웰컴 키트
*
* */

public class B3_30802 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] requests = br.readLine().split(" ");
        String[] bundles = br.readLine().split(" ");
        int t = Integer.parseInt(bundles[0]);
        int p = Integer.parseInt(bundles[1]);

        int tCount = 0;
        for(String request : requests){
            tCount += (int) Math.ceil(Double.parseDouble(request) / t);
        }

        sb.append(tCount).append("\n");

        sb.append(n / p).append(" ").append(n % p);
        System.out.println(sb);
    }
}
