package com.codingTest.level1.exam05;

/*

카카오에 입사한 신입 개발자 네오는 "카카오계정개발팀"에 배치되어, 카카오 서비스에 가입하는 유저들의 아이디를 생성하는 업무를 담당하게 되었습니다. "네오"에게 주어진 첫 업무는 새로 가입하는 유저들이 카카오 아이디 규칙에 맞지 않는 아이디를 입력했을 때, 입력된 아이디와 유사하면서 규칙에 맞는 아이디를 추천해주는 프로그램을 개발하는 것입니다.
다음은 카카오 아이디의 규칙입니다.

*/


public class Solution {

    StringBuffer sb = new StringBuffer();

    public String solution(String new_id) {
        // new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        new_id = new_id.toLowerCase();

        // new_id에서 알파벳 소문자, 숫자, 빼기, 밑줄, 마침표를 제외한 모든 문자를 제거합니다.
        new_id = new_id.replaceAll("[^a-zA-Z-_.0-9]", "");

        // 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표로 치환합니다.
        new_id = new_id.replaceAll("\\.+", ".");

        // 마침표가 처음이나 끝에 위치한다면 제거합니다.
        StringBuilder sb = new StringBuilder(new_id);
        if(sb.charAt(0) == '.'){
            sb.deleteCharAt(0);
        }

        if(!sb.isEmpty() && sb.charAt(sb.length()-1) == '.'){
            sb.deleteCharAt(sb.length()-1);
        }

        // new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        int length = sb.length();
        if(length == 0){
            sb.append("a");
        }else if(length >= 16){
            sb.delete(15, sb.length());
        }

        if(sb.charAt(sb.length()-1) == '.'){
            sb.deleteCharAt(sb.length()-1);
        }

        while(sb.length() <= 2){
            sb.append(sb.charAt(sb.length()-1));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution("=.="));
    }

}
