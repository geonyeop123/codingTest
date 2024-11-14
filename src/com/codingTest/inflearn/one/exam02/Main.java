package com.codingTest.inflearn.one.exam02;

import java.util.Scanner;

/*
*
* A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.

    가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
*
* */

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int cnt = 0;

        int input1 = Integer.parseInt(in.nextLine());
        String[] arr1 = in.nextLine().split(" ");
        String[] arr2 = in.nextLine().split(" ");
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < input1; i++) {
            int a = Integer.parseInt(arr1[i]);
            int b = Integer.parseInt(arr2[i]);

            if(a == b){
                sb.append("D");
            }else if(a == 1){
                sb.append(b == 3 ? "A" : "B");
            }else if(a == 2){
                sb.append(b == 1 ? "A" : "B");
            }else{
                sb.append(b == 2 ? "A" : "B");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
