package com.codingTest.backjoon.bronze;

import java.io.*;

public class B5_10871 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);

        String[] arr = br.readLine().split(" ");

        for(int i = 0;i < n; i++){
            int number = Integer.parseInt(arr[i]);
            if(number < x){
                bw.write(number + " ");
            }
        }

        bw.flush();
    }
}
