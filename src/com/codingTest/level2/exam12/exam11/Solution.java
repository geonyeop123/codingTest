package com.codingTest.level2.exam12.exam11;

/*
* 구명보트
* */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {

    public int solution(int[] people, int limit) {
        int answer = 0;
        int smallWeightIdx = people.length - 1;
        Integer[] people1 = Arrays.stream(people).boxed().toArray(Integer[]::new);
        Arrays.sort(people1, Collections.reverseOrder());

        for(int i = 0; i <= smallWeightIdx; i++) {
            int smallWeight = people1[smallWeightIdx];
            int bigWeight = people1[i];
            if(smallWeight + bigWeight <= limit) {
                smallWeightIdx--;
            }
            answer++;
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{70, 70, 70, 50, 30, 20}, 70));
        //                                                    0 1 2 3
        System.out.println(s.solution(new int[]{70, 50, 80, 50}, 100));
    }
}
