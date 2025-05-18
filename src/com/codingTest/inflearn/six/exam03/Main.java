package com.codingTest.inflearn.six.exam03;
/*

3. 팩토리얼

설명
자연수 N이 들어오면 !N을 구하는 프로그램을 작성하시오


입력

첫 번째 줄에 정수 N (1<=N<=1000)이 입력된다.

5

출력
첫 번째 줄에 N팩토리얼 값을 출력합니다.

120

* */

import java.util.Scanner;

public class Main {


    // 3
    public int solution(int n) {
        if(n == 1) return 1;
        else return n * solution(n-1);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Main main = new Main();
        int n = in.nextInt();

        System.out.println(main.solution(n));
    }
}