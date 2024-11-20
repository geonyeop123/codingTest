package com.codingTest.inflearn.two.exam04;

/*
4. 연속 부분수열
설명

N개의 수로 이루어진 수열이 주어집니다.

이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.

만약 N=8, M=6이고 수열이 다음과 같다면

1 2 1 3 1 1 1 2

합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.


입력

첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.

수열의 원소값은 1,000을 넘지 않는 자연수이다.

8 6
1 2 1 3 1 1 1 2

* */

import java.util.Scanner;

public class Main {

    public int solution(int n, int m, int[] arr){

        int cnt = 0;
        int leftPoint = 0;
        int rightPoint = 0;
        int sum = arr[0];

        while(true){
            if(sum == m){
                cnt++;
            }
            if(sum >= m){
                sum -= arr[leftPoint++];
            }else{
                rightPoint++;
                if(rightPoint == n) break;
                sum += arr[rightPoint];
            }
        }

        // 선생님 풀이
//        int cnt = 0;
//        int leftPoint = 0;
//        int sum = 0;
//        for(int rightPoint = 0; rightPoint < n; rightPoint++){
//            sum += arr[rightPoint];
//            if(sum == m){
//                cnt++;
//            }
//
//            while(sum >= m){
//                sum -= arr[leftPoint++];
//                if(sum == m){
//                    cnt++;
//                }
//            }
//        }


        return cnt;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Main main = new Main();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(main.solution(n, m, arr));
    }
}