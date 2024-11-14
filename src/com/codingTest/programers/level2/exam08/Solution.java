package com.codingTest.programers.level2.exam08;

/*
* 피보나치 수
* */

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int solution(int n) {
        List<Integer> list = new ArrayList<>(100000);
        list.add(0);
        list.add(1);

        for(int i = 2; i <= n; i++){
            list.add((list.get(i - 1) + list.get(i - 2)) % 1234567);
        }

        System.out.println(list);

        return list.get(n);
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(40));
    }
}
