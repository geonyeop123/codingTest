package com.codingTest.inflearn.one.exam04;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
*
*
*
*
5. 소수(에라토스테네스 체)
설명

자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.


입력

첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
*
* */

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n + 1];
        int cnt = 0;

        for(int i = 2; i <= n; i++) {
            if(arr[i] == 0) {
                cnt++;
            }else{
                continue;
            }

            // i의 배수 제거
            for(int j = i; j <= n;j = j + i) {
                arr[j] = 1;
            }

        }

        System.out.println(cnt);
    }
}
