package com.codingTest.programers.level2.exam10;

/*
* 점프와 순간 이동
* */


public class Solution {

    public int solution(int n) {
        int battery = 0;

        while(n != 0) {
            if(n % 2 == 0){
                n = n / 2;
            }else{
                n--;
                battery++;
            }
        }
        return battery;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(5000));
    }
}
