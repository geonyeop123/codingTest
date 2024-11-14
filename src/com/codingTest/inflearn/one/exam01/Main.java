package com.codingTest.inflearn.one.exam01;


import java.util.Scanner;

/*
*
* 2. 보이는 학생
설명

선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는

선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)


입력

첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.


* */

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int cnt = 0;

        int input1 = Integer.parseInt(in.nextLine());

        int max = 0;

        String s = in.nextLine();
        for(String length : s.split(" ")){
            int length1 = Integer.parseInt(length);
            if(max < length1){
                max = length1;
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}