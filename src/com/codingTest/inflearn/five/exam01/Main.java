package com.codingTest.inflearn.five.exam01;
/*

1. 선택 정렬
설명

N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.

정렬하는 방법은 선택정렬입니다.


입력

첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.

두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.

6
13 5 11 7 23 15

* */

import java.util.Scanner;

public class Main {


    public int[] solution(int n, int[] arr) {

        for (int i = 0; i < n; i++) {
            int idx = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[idx]){
                    idx = j;
                }
            }
            int tmp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Main main = new Main();
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        for(int i : main.solution(n, arr)){
            System.out.print(i + " ");
        }

    }
}