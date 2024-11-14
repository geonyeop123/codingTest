package com.codingTest.programers.level2.exam11;

/*
* 영어 끝말잇기
* */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] solution(int n, String[] words) {
        List<String> answerList = new ArrayList<>();

        char lastchar = words[0].charAt(0);
        int idx = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char firstChar = word.charAt(0);

            if(firstChar != lastchar || answerList.contains(word)){
                idx = i;
                break;
            }else{
                answerList.add(word);
                lastchar = word.charAt(word.length() - 1);
            }
        }
        if(idx == 0){
            return new int[]{0, 0};
        }else{
            return new int[]{idx % n + 1, idx / n + 1};
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"})));
    }
}
