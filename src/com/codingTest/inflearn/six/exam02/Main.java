package com.codingTest.inflearn.six.exam02;
/*

2. 재귀 함수를 이용한 이진수 출력
설명
10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요. 단, 재귀함수를 이용해서 출력해야 합니다.

10진수를 2진수로 변환하는 방법은, 몫이 0이 될때까지 2로 나눈 나머지를 출력하면 2진수가 된다.

입력

첫 번째 줄에 정수 N (1<=N<=1000)이 입력된다.

11

출력
첫 번째 줄에 이진수를 출력하세요.
1011

* */

import java.util.Scanner;

public class Main {


    // 3
    public void solution(int n) {
        if(n != 0){
            solution(n/2);
            System.out.print(n%2);
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Main main = new Main();
        int n = in.nextInt();

        main.solution(n);
    }
}