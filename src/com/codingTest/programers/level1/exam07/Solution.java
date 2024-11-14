package com.codingTest.programers.level1.exam07;

public class Solution {

    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        while(Math.min(wallet[0], wallet[1]) < Math.min(bill[0], bill[1]) ||
                Math.max(wallet[0], wallet[1]) < Math.max(bill[0], bill[1])){

            if(bill[0] > bill[1]){
                bill[0] = bill[0] / 2;
            }else{
                bill[1] = bill[1] / 2;
            }

            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("hi");
        System.out.println(solution.solution(new int[]{50,50}, new int[]{100, 241}));
    }
}
