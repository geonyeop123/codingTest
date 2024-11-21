package com.codingTest.inflearn.two.exam07;

/*
6. 최대 길이 연속부분수열
설명

0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.

만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면

1 1 0 0 1 1 0 1 1 0 1 1 0 1

여러분이 만들 수 있는 1이 연속된 연속부분수열은

Image1.jpg

이며 그 길이는 8입니다.


입력

첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다.

두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.

14 2
1 1 0 0 1 1 0 1 1 0 1 1 0 1

* */

import java.util.Scanner;

public class Main {

    // 내 풀이
    public int solution(int n, int k, int[] arr){

        int answer = 0;
        int maxLength = 0;
        int cnt = 0;
        int leftPoint = 0;

        for(int rightPoint = 0; rightPoint < n; rightPoint++){
            if(arr[rightPoint] == 0){
                cnt++;
                answer++;
                if(cnt > k){
                    maxLength = Math.max(maxLength, answer - 1);
                    while(cnt > k){
                        if(arr[leftPoint] == 0){
                            cnt--;
                        }
                        leftPoint++;
                        answer--;
                    }
                }
            }else{
                answer++;
            }
        }

        return Math.max(answer, maxLength);
    }

    // 선생님 풀이
    public int solution2(int n, int k, int[] arr){

        int answer = 0;
        int cnt = 0;
        int leftPoint = 0;

        for(int rightPoint = 0; rightPoint < n; rightPoint++){
            if(arr[rightPoint] == 0){
                cnt++;
            }
            while(cnt > k){
                if(arr[leftPoint] == 0){
                    cnt--;
                }
                leftPoint++;
            }
            answer = Math.max(answer, rightPoint - leftPoint + 1);
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Main main = new Main();
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }


        System.out.println(main.solution(n, k, arr));
    }
}