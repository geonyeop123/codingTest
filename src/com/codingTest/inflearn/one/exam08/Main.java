package com.codingTest.inflearn.one.exam08;

import java.util.Arrays;
import java.util.Scanner;

/*
*
*
*
*
9. 격자판 최대합
설명

5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.

Image1.jpg

N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.


입력

첫 줄에 자연수 N이 주어진다.(2<=N<=50)

두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.

5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19


출력

최대합을 출력합니다.

*
* */

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        String[][] arr1 = new String[n][n];
        int maxTotal = 0;

        for(int i = 0; i < n; i++) {
            arr1[i] = in.nextLine().split(" ");
        }

        // 가로, 세로의 최대 합
        for(int i = 0; i < n; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for(int j = 0; j < n; j++) {
                sum1 += Integer.parseInt(arr1[j][i]);
                sum2 += Integer.parseInt(arr1[j][i]);
            }
            maxTotal = Math.max(maxTotal, Math.max(sum1, sum2));
        }

        // 대각의 최대 합
        int leftCrossSum = 0;
        int rightCrossSum = 0;
        for(int i = 0; i < n; i++) {
            leftCrossSum += Integer.parseInt(arr1[i][i]);
            rightCrossSum += Integer.parseInt(arr1[i][n - 1 - i]);
        }
        maxTotal = Math.max(maxTotal, Math.max(leftCrossSum, rightCrossSum));
        System.out.println(maxTotal);
    }
}

