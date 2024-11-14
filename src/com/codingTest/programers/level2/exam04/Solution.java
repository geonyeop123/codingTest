package com.codingTest.programers.level2.exam04;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
* 이진 변환 반복하기
*
* */

public class Solution {

    public int[] solution(String s) {
        int transferCount = 0;
        int removeZeroCount = 0;

        while(s.length() != 1){
            int length = s.length();
            s = s.replaceAll("0", "");
            removeZeroCount += length - s.length();
            transferCount++;
            s = Integer.toBinaryString(s.length());
        }

        return new int[]{transferCount, removeZeroCount};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

    }
}
