package com.codingTest.inflearn.four.exam02;

/*
2. 괄호문자제거
설명

입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.


입력

첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

(A(BC)D)EF(G(H)(IJ)K)LM(N)

* */

import java.util.Scanner;
import java.util.Stack;

public class Main {


    public String solution(String n) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char c : n.toCharArray()) {
            if(c == '('){
                stack.push(c);
            }else if(c == ')'){
                stack.pop();
            }else if(stack.isEmpty()){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Main main = new Main();
        String n = in.next();

        System.out.println(main.solution(n));

    }
}