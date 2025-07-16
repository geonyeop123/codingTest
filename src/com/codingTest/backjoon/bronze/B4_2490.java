package com.codingTest.backjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4_2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < 3; i++){
            String[] arr = br.readLine().split(" ");
            int cnt = 0;
            for(String s : arr){
                int j = Integer.parseInt(s);
                if(j == 0){
                    cnt++;
                }
            }
            // 기본 값 E에서 1 나온만큼 빼기,대신 0이면 0으로 세팅
            int result = cnt == 0 ? 0 : 5 - cnt;
            char c = (char)(69 - result);
            sb.append(c).append("\n");
        }
        System.out.println(sb);
    }
}
