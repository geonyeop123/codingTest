package com.codingTest.inflearn.three.exam04;

/*
4. 모든 아나그램 찾기
설명

S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.

아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.


입력

첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.

S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.


bacaAacba
abc

* */

import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public int solution(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int answer = 0;
        for(char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < t.length() - 1; i++){
            map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i), 0) + 1);
        }

        int lt = 0;
        for (int rt = t.length() - 1; rt < s.length(); rt++) {
            map2.put(s.charAt(rt), map2.getOrDefault(s.charAt(rt), 0) + 1);
            if(map.equals(map2)){
                answer++;
            }

            char key = s.charAt(lt);
            map2.put(key, map2.get(key) - 1);
            if(map2.get(key) == 0){
                map2.remove(key);
            }
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Main main = new Main();
        String s = in.next();
        String t = in.next();

        System.out.println(main.solution(s, t));

    }
}