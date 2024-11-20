package com.codingTest.inflearn.two.exam01;

/*
1. 두 배열 합치기
설명

오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.


입력

첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.

두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.

세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.

네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.

각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.

3
1 3 5
5
2 3 6 7 9
*

Two Pointers algorithm [o(n)]
* */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<Integer> solution(int n, int[] arr1, int m, int[] arr2){
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        for(int k =0; k< n + m; k++){
            int first = i < n ? arr1[i] : Integer.MAX_VALUE;
            int second = j < m ? arr2[j] : Integer.MAX_VALUE;
            if(first < second){
                list.add(first);
                i++;
            }else{
                list.add(second);
                j++;
            }
        }

//        while(list.size() != n + m){
//            int first = i == n ? Integer.MAX_VALUE : arr1[i];
//            int second = j == m ? Integer.MAX_VALUE : arr2[j];
//            if(first <= second){
//                list.add(first);
//                i++;
//            }else{
//                list.add(second);
//                j++;
//            }
//        }

        return list;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Main main = new Main();
        int n = in.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }

        List<Integer> answer = main.solution(n, arr1, m, arr2);
        answer.forEach((i) -> System.out.print(i + " "));
    }
}
