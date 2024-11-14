package com.codingTest.programers.level2.exam03;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
* JadenCase
*
* */

public class Solution {

    public String solution(String s) {
        s += "1";
        String answer = Arrays.stream(s.split(" ")).map(this::parseJadenCase).collect(Collectors.joining(" "));
        return answer.substring(0, answer.length() - 1);
    }

    public String parseJadenCase(String str){
        StringBuilder sb = new StringBuilder();
        System.out.println("&" + str + "&");
        if(str.isEmpty()){
            return "";
        }else{
            char upperC = Character.toUpperCase(str.charAt(0));
            sb.append(upperC);
            sb.append(str.substring(1).toLowerCase());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("\"" + solution.solution("  for the what 1what  ") +"\"");
    }
}
