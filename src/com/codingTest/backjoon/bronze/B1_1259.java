package com.codingTest.backjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_1259 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String s = br.readLine();
            if(s.equals("0")) break;
            sb.append(isPalindrome(s));
        }
        System.out.println(sb);
    }

    public static String isPalindrome(String s){
        String[] arr = s.split("");
        for(int i = 0; i < s.length() / 2; i++){
            if(!arr[i].equals(arr[arr.length - 1 - i])){
                return "no\n";
            }
        }
        return "yes\n";
    }
}
