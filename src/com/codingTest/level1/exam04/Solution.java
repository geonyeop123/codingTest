package com.codingTest.level1.exam04;

/*
체육복
점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다.
다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다.
체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.

전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
*/

import java.util.Arrays;

// 1 / 3
public class Solution {

    public int solution(int n, int[] lost, int[] reserve) {

        Arrays.sort(lost);
        Arrays.sort(reserve);

        int lendCnt = 0;

        for(int i = 0; i < lost.length; i++){
            int lostNumber = lost[i];
            for(int j = 0; j < reserve.length; j++){
                int reserveNumber = reserve[j];
                if(lostNumber + 1 < reserveNumber){
                    break;
                }else if(lostNumber == reserveNumber){
                    lost[i] = -4;
                    reserve[j] = -2;
                    lendCnt++;
                    break;
                }
            }
        }

        for(int lostNumber : lost){
            for(int j = 0; j < reserve.length; j++){

                int reserveNumber = reserve[j];

                if(lostNumber + 1 < reserveNumber){
                    break;
                }

                if(canLend(lostNumber, reserveNumber)){
                    reserve[j] = -2;
                    lendCnt++;
                    break;
                }
            }
        }

        return n - lost.length + lendCnt;
    }

    private boolean canLend(int lostNumber, int reserveNumber){
        return lostNumber == reserveNumber - 1
                || lostNumber == reserveNumber
                || lostNumber == reserveNumber + 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution(5, new int[]{5, 3}, new int[]{4, 2}));
    }
}
