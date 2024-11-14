package com.codingTest.backjoon.bronze.exam01;

import java.io.*;
import java.util.Arrays;

/*
* 4153. 직각삼각형
*
* */

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double[] intArr = new double[3];
        while(true){
            String input = br.readLine();

            if(input.equals("0 0 0")){
                bw.flush();
                break;
            }

            String[] inputArr = input.split(" ");
            for(int i = 0;i < inputArr.length;i++){
                intArr[i] = Math.pow(Integer.parseInt(inputArr[i]), 2);
            }
            Arrays.sort(intArr);

            bw.write((intArr[2] == intArr[0] + intArr[1]) ? "right\n" : "wrong\n");
        }
    }
}
