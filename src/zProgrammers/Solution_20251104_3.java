package zProgrammers;

class Solution_20251104_3 {
    public int solution(String myString, String pat) {
        int answer = 0;

        String temp = "";
        for(char x : myString.toCharArray()) {
            temp += x;

            if(temp.length() == pat.length()) {
                if(temp.equals(pat)) {
                    answer++;
                }
                temp = temp.substring(1, temp.length());
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Solution_20251104_3 s = new Solution_20251104_3();
        System.out.println(s.solution("banana"	, "ana"));

    }
}