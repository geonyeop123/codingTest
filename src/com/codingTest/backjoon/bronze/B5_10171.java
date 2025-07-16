package com.codingTest.backjoon.bronze;

import java.io.*;

public class B5_10171 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        sb.append(x + y).append("\n");
        sb.append(x - y).append("\n");
        sb.append(x * y).append("\n");
        sb.append(x / y).append("\n");
        sb.append(x % y).append("\n");

        System.out.println(sb);
    }
}
