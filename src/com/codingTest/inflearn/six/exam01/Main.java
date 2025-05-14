package com.codingTest.inflearn.six.exam01;
/*

1. 재귀 함수
설명
자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지 출력하는 함수를 작성하세요.



입력

첫 번째 줄에 정수 N (3<=N<=10)이 입력된다.

3

출력
첫째 줄에 출력한다.
1 2 3

* */

import java.util.Scanner;

public class Main {


    // 3
    public void solution(int n) {
        if(n == 0){
          return;
        } else{
            solution(n-1);
            System.out.print(n + " ");
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Main main = new Main();
        int n = in.nextInt();

        main.solution(n);
    }
}