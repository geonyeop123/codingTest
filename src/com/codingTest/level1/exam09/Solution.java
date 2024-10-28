package com.codingTest.level1.exam09;

/*
*  [카카오 인턴] 키패드 누르기
* */

import java.util.Arrays;
import java.util.List;

public class Solution {

    public String solution(int[] numbers, String hand) {

        int left = 10;
        int right = 12;
        StringBuilder sb = new StringBuilder();


        for (int number : numbers) {
            String chooseHand = "";
            if(List.of(1, 4, 7).contains(number)) {
                chooseHand = "L";
                left = number;
            }else if(List.of(3, 6, 9).contains(number)) {
                chooseHand = "R";
                right = number;
            }else {

                if(0 == number){
                    number = 11;
                }

                int leftDistance = ((Math.abs(left - number)) / 3) + ((Math.abs(left - number)) % 3 );
                int rightDistance = ((Math.abs(right - number)) / 3) + ((Math.abs(right - number)) % 3 );

                if(rightDistance < leftDistance) {
                    chooseHand = "R";
                    right = number;
                }else if(leftDistance < rightDistance) {
                    chooseHand = "L";
                    left = number;
                }else {
                    if(hand.equals("left")) {
                        chooseHand = "L";
                        left = number;
                    }else {
                        chooseHand = "R";
                        right = number;
                    }
                }
            }

            sb.append(chooseHand);
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
    }
}
