package com.codingTest.inflearn.five.exam07;
/*

7. 좌표 정렬
설명

N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.

정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.

입력

첫째 줄에 좌표의 개수인 N(3<=N<=100,000)이 주어집니다.

두 번째 줄부터 N개의 좌표가 x, y 순으로 주어집니다. x, y값은 양수만 입력됩니다.

출력

N개의 좌표를 정렬하여 출력하세요.

* */


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public Point[] solution(int n, Point[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Main main = new Main();
        int n = in.nextInt();
        Point[] arr = new Point[n];

        for(int i = 0; i < n; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            arr[i] = new Point(x, y);
        }

        for(Point p : main.solution(n, arr)){
            System.out.println(p);
        }
    }

    public static class Point implements Comparable<Point>{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if(this.x == o.x) return this.y - o.y;
            else return this.x - o.x;
        }

        @Override
        public String toString() {
            return x + " " + y;
        }
    }
}