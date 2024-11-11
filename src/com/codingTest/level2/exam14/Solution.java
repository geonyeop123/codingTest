package com.codingTest.level2.exam14;

/*
* 멀리 뛰기 (피보나치 수열)
* */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

    public long solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        for(int i = 2; i < n; i++) {
            list.add((list.get(i-2) + list.get(i-1)) % 1234567);
        }
        return list.get(list.size()-1);
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(6));
    }
}
