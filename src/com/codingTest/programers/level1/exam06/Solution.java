package com.codingTest.programers.level1.exam06;

/*
 *  [카카오 인턴] 성격 유형 검사하기
 * RT
 * CF
 * JM
 * AN
 * */


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    static class Type {
        String types;
        int[] scores = new int[]{0,0};

        public void plusScore(String type, int i){
            scores[types.indexOf(type)] += i;
        }

        public int[] getScores() {
            return scores;
        }

        public String getType() {
            int idx = 0;
            if(scores[1] > scores[0]){
                idx = 1;
            }
            return String.valueOf(types.charAt(idx));
        }
        public Type(String types){
            this.types = types;
        }
    }

    public String solution(String[] survey, int[] choices) {
        List<Type> types = List.of(new Type("RT"), new Type("CF"), new Type("JM"), new Type("AN"));

        for(int i = 0; i < survey.length; i++) {
            Type type = getSurvey(types, survey[i]);
            int score = Math.abs(choices[i] - 4);
            int idx = choices[i] > 4 ? 1 : 0;
            type.plusScore(String.valueOf(survey[i].charAt(idx)), score);
        }

        for(Type type : types) {
            System.out.println(Arrays.toString(type.getScores()));
        }

        return types.stream().map(Type::getType).collect(Collectors.joining());
    }

    public Type getSurvey(List<Type> types, String survey) {
        if(survey.contains("R") || survey.contains("T")){
            return types.get(0);
        }else if(survey.contains("C") || survey.contains("F")){
            return types.get(1);
        }else if(survey.contains("J") || survey.contains("M")){
            return types.get(2);
        }else{
            return types.get(3);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(1-4);
        System.out.println(5-4);
        System.out.println(solution.solution(new String[]{"RT", "TR", "MJ", "AN"}, new int[]{1,1,3,3}));
    }
}
