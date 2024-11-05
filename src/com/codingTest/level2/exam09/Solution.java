package com.codingTest.level2.exam09;

/*
* 피보나치 수
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        for(int i = 3; i <= total; i++) {
            for(int j = i; j < brown / 2; j++) {
                int k = i * j;
                if(k > total){
                    break;
                }else if(k == total){
                    answer[0] = j;
                    answer[1] = i;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(10, 2)));
    }
}
