package com.codingTest.inflearn.two.exam02;

/*
2. 공통원소 구하기
설명

A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.


입력

첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.

두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.

세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.

네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.

각 집합의 원소는 1,000,000,000이하의 자연수입니다.

5
1 3 9 5 2
5
3 2 5 7 8


Two Pointers algorithm [o(n)]
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<Long> solution(int n, long[] arr1, int m, long[] arr2){
        List<Long> list = new ArrayList<>();
        int i = 0, j = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while(i < n &&  j < m){
            long first = arr1[i];
            long second = arr2[j];

            if(first == second){
                list.add(first);
                i++;
                j++;
            }else if(first < second){
                i++;
            }else{
                j++;
            }
        }
        return list;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Main main = new Main();
        int n = in.nextInt();
        long[] arr1 = new long[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = in.nextLong();
        }
        int m = in.nextInt();
        long[] arr2 = new long[m];
        for(int i = 0; i < m; i++) {
            arr2[i] = in.nextLong();
        }

        List<Long> answer = main.solution(n, arr1, m, arr2);
        answer.forEach((i) -> System.out.print(i + " "));
    }
}
