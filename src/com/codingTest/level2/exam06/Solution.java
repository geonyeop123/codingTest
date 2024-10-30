package com.codingTest.level2.exam06;

/*
* 숫자의 표현
* */

public class Solution {

    public int solution(int n) {
        int count = 1;
        int end = n % 2 == 0 ? n / 2 : n / 2 + 1;

        // 1 2 3 4 5 6 7
        for(int i = 1; i < end; i++) {

            int sum = i;
            int j = i;
            while(sum < n){
                j++;
                sum += j;
                if(sum == n) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(15));
    }
}
