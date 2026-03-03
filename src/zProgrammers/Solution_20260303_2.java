package zProgrammers;

class Solution_20260303_2 {
    public int[] solution(String myString) {
        String[] arr = myString.split("x");

        int length = arr.length;
        if(myString.charAt(myString.length() -1) == 'x') {
            length++;
        }

        int[] answer = new int[length];
        int index = 0;
        for(String temp : arr) {
            answer[index] = temp.length();
            index++;
        }

        if(myString.charAt(myString.length() -1) == 'x') {
            answer[index] = 0;
        }

        return answer;
    }

}