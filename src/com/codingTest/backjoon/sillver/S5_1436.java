package com.codingTest.backjoon.sillver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S5_1436 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int plus = 666;
        int cnt = 0;
        while(cnt < n){
            if(String.valueOf(plus).contains("666")){
                cnt++;
            }
            if(cnt == n){
                sb.append(plus);
                break;
            }
            plus++;
        }
        System.out.println(sb);
    }
}
