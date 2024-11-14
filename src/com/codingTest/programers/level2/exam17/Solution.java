package com.codingTest.programers.level2.exam17;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
*
* 할인 행사
* */
public class Solution {


    // 1, 2 -> 5
    // 2, 1, 1 -> 3 2 2 2 -> 9
    // 2, 1, 1, 1 -> 3 2 2 2 2 2
    // 1 + 2 + 1 * 2
    // 2, 1, 1, 1
    //
    public int solution(String[][] clothes) {
        Map<String, Long> collect = Arrays.stream(clothes).collect(Collectors.groupingBy(wear -> wear[1], Collectors.counting()));
        System.out.println(collect);
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new String[][]{new String[]{"yellow_hat", "headgear"}, new String[]{"blue_sunglasses", "eyewear"}, new String[]{"green_turban", "headgear"}});
    }
}
