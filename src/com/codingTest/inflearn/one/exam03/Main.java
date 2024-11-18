package com.codingTest.inflearn.one.exam03;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
*
*
* 피보나치 수열
*
설명

1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.

2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.


입력

첫 줄에 총 항수 N(3<=N<=45)이 입력된다.


출력


*
* */

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {

            if(i < 2){
                arr[i] = 1;
                continue;
            }

            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.println(Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
