package com.codingTest.level2.exam15;


/*
*
* 2017 팁스타운
*   예상 대진표
* */
public class Solution {

    public int solution(int n, int a, int b) {
        int answer = 0;
        while(a != b){
            answer++;
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
