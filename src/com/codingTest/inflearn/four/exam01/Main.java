package com.codingTest.inflearn.four.exam01;

/*
1. 올바른 괄호
설명

괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.

(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.


입력

첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.

(()(()))(()


* */

import java.util.Scanner;
import java.util.Stack;

public class Main {


    public String solution(String n) {
        Stack<Character> stack = new Stack<>();

        for(char c : n.toCharArray()) {
            if(c == '('){
                stack.push(c);
            }else if(stack.isEmpty()){
                return "NO";
            }else{
                stack.pop();
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Main main = new Main();
        String n = in.next();

        System.out.println(main.solution(n));

    }
}