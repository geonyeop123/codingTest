package com.codingTest.level2.exam05;

/*
* 짝지어 제거하기
*
* Stack을 사용하면 효율성 테스트에서 탈락, ArrayDeque를 사용하여 효율성 증대
* */

import java.util.ArrayDeque;

public class Solution {

    public int solution(String s) {

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();


        for(String ss : s.split("")) {
            if(!arrayDeque.isEmpty() && arrayDeque.peek().equals(ss)) {
                arrayDeque.pop();
            }else{
                arrayDeque.addFirst(ss);
            }
        }

        return arrayDeque.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("baabaa"));
    }
}
