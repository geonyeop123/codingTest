package com.codingTest.level2.exam16;


import java.util.*;

/*
*
* 할인 행사
* */
public class Solution {

    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> wantMap = new HashMap<>();
        for(int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        Map<String, Integer> discountMap = new HashMap<>();
        for(int i = 0; i < discount.length; i++) {
            String inProduct = discount[i];
            if(i > 9){
                String outProduct = discount[i - 10];
                discountMap.put(outProduct, discountMap.get(outProduct) - 1);
            }

            if(!discountMap.containsKey(inProduct)){
                discountMap.put(inProduct, 1);
            }else {
                discountMap.put(inProduct, discountMap.get(inProduct) + 1);
            }

            if(valid(wantMap, discountMap)){
                answer++;
            };
        }
        return answer;
    }

    private boolean valid(Map<String, Integer> wantMap, Map<String, Integer> discountMap) {
        for (String s : wantMap.keySet()) {
            int wantCount = wantMap.get(s);
            int discountCount = discountMap.getOrDefault(s, 0);

            if(wantCount > discountCount){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution
                    .solution(
                new String[]{"banana", "apple", "rice", "pork", "pot"},
                new int[]{3, 2, 2, 2, 1},
                new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}));
    }
}
