package com.codingTest.level2.exam07;

/*
* 다음 큰 숫자
* */

import java.util.Arrays;

public class Solution {

    public int solution(int n) {
        int count = Integer.bitCount(n);
        while(true){
            n++;
            int newCount = Integer.bitCount(n);

            if(count == newCount){
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
