package com.codingTest.level2.exam07;

/*
* 다음 큰 숫자
* */

import java.util.Arrays;

public class Solution {

    public int solution(int n) {
        String binaryString = Integer.toBinaryString(n);
        int length = binaryString.replaceAll("0", "").length();
        while(true){
            n++;
            binaryString = Integer.toBinaryString(n);
            int newLength = binaryString.replaceAll("0", "").length();
            if(newLength == length){
                break;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(78));
    }
}
