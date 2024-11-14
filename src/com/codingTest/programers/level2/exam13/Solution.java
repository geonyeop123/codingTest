package com.codingTest.programers.level2.exam13;

/*
* 귤 고르기
* */


import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public int solution(int k, int[] tangerine) {

        Map<Integer, Long> groupMap = Arrays.stream(tangerine).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        List<Integer> keySet = new ArrayList<>(groupMap.keySet());

        keySet.sort((o1, o2) -> groupMap.get(o2).compareTo(groupMap.get(o1)));

        int total = 0;
        int answer = 0;

        for (Integer i : keySet) {
            if(k <= total){
                break;
            }
            total += groupMap.get(i);
            answer++;
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
    }
}
