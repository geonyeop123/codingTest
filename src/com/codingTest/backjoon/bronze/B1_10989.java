package com.codingTest.backjoon.bronze;

import java.io.*;

public class B1_10989 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int max = 10000;
        int[] arr = new int[max + 1];

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            arr[number] += 1;
        }


        for(int i = 0; i <= max; i++){
            while(arr[i] > 0) {
                arr[i] -= 1;
                bw.append(String.valueOf(i)).append("\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
