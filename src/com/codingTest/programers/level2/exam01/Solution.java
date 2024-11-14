package com.codingTest.programers.level2.exam01;

public class Solution {

    boolean solution(String s) {
        int count = 0;

        for(String ss : s.split("")){
            if(ss.equals("(")){
                count++;
            }else{
                count--;
            }

            if(count < 0){
                return false;
            }
        }

        return count == 0;
    }

    /* Stack으로 풀이 */
//    boolean solution(String s) {
//        Stack<String> stack = new Stack<>();
//        for(String ss : s.split("")){
//            if(ss.equals("(")){
//                stack.push(ss);
//            }else if(stack.empty()){
//                return false;
//            }else{
//                stack.pop();
//            }
//        }
//        return stack.isEmpty();
//    }

    public static void main(String[] args) {

    }
}
