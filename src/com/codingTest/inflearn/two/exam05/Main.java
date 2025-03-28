package com.codingTest.inflearn.two.exam05;

/*
5. 연속된 자연수의 합
설명

N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.

만약 N=15이면

7+8=15

4+5+6=15

1+2+3+4+5=15

와 같이 총 3가지의 경우가 존재한다.


입력

첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.

15


* */

import java.util.Scanner;

public class Main {

    public int solution(int n){

        int answer = 0;
        int leftPoint = 1;
        int sum = 1;

        for(int rightPoint = 2; rightPoint <= n / 2 + 1; rightPoint++){
            sum += rightPoint;
            if(sum == n){
                answer++;
            }

            while(sum >= n){
                sum -= leftPoint++;
                if(sum == n){
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Main main = new Main();
        int n = in.nextInt();

        System.out.println(main.solution(n));
    }
}