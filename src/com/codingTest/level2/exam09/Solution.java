package com.codingTest.level2.exam09;

/*
* 카펫
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] solution(int brown, int yellow) {
        // yellow = width - 2 * height * 2;
        // min = 3 / yellow 1 = 3
        // max = area / 3
        int[] answer = new int[2];

        int area = brown + yellow;
        int min = 3;
        int max = area / 3;

        for(int width = min; width <= max; width++) {
            for(int height = min; height <= width; height++) {
                if(width * height == area && yellow == (width - 2) * (height - 2)){
                    return new int[]{width, height};
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
