package com.codingTest.backjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_28702 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final String REGEX = "[0-9]+";

        int numberPoint = 0;
        int number = 0;
        for(int i = 0; i < 3; i++){
            String str = br.readLine();
            if(str.matches(REGEX)){
                numberPoint = i;
                number = Integer.parseInt(str);
            }
        }
        number += 3-numberPoint;
        if(number % 3 == 0){
            sb.append("Fizz");
        }
        if(number % 5 == 0){
            sb.append("Buzz");
        }
        if(sb.length() == 0){
            sb.append(number);
        }

        System.out.println(sb);
    }
}
