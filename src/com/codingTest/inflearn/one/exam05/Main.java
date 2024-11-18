package com.codingTest.inflearn.one.exam05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
*
*
*
*
6. 뒤집은 소수
설명

N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.

예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.

첫 자리부터의 연속된 0은 무시한다.


입력

첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.

각 자연수의 크기는 100,000를 넘지 않는다.
*
* */

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        String[] arr = in.nextLine().split(" ");
        List<Integer> answer = new ArrayList<>();

        for (String s : arr) {
            int number = Integer.parseInt(s);
            int res = 0;
            while (number != 0) {
                int t = number % 10;
                res = res * 10 + t;
                number = number / 10;
            }
            if (isPrime(res)) {
                answer.add(res);
            }
        }
        answer.forEach((res) -> System.out.print(res + " "));
    }

    public static boolean isPrime(int number) {
        if(number == 1) return false;

        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }

        return true;
    }
}

