package zProgrammers._202510;

class Solution_20251024_3 {

    public String solution(String number, int k) {
        StringBuilder stack = new StringBuilder();
        int removeCount = k;

        for(char digit : number.toCharArray()) {
            while(removeCount > 0 && stack.length() > 0 && stack.charAt(stack.length() - 1) < digit) {
                stack.deleteCharAt(stack.length() - 1);
                removeCount--;
            }
            stack.append(digit);
        }

        return stack.substring(0, stack.length() - removeCount);
    }

    public String solution2(String number, int k) {
        StringBuilder answer = new StringBuilder();

        int len = number.length() - k;
        //만들수 있는 len자리 수
        int[] arr = new int[number.length()];

        int cnt = 0;
        for(Character x : number.toCharArray()) {
            arr[cnt] = Integer.valueOf(String.valueOf(x));
            cnt++;
        }

        int end = number.length() - (len - 1);
        int index = -1;
        while(end <= number.length()) {
            if(answer.length() >= len) {
                break;
            }

            int max = 0;
            for (int i = index+1; i < end; i++) {
                if(arr[i] > max) {
                    index = i;
                    max = arr[index];
                }
            }
            answer.append(max);
            end++;
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution_20251024_3 s = new Solution_20251024_3();
        //System.out.println(s.solution("1924", 2));
        //System.out.println(s.solution("1231234", 3));
        System.out.println(s.solution("4177252841", 4));

    }
}