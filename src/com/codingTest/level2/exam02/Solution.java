package com.codingTest.level2.exam02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);

        // sort B
        Arrays.sort(B);
        for(int i = 0; i < B.length / 2; i++){
            int temp = B[i];
            B[i] = B[B.length - i - 1];
            B[B.length - i - 1] = temp;
        }

        for(int i = 0; i < A.length; i++){
            answer += A[i] * B[i];
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
