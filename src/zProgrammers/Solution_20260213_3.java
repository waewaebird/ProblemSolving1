package zProgrammers;

class Solution_20260213_3 {
    public String solution(String polynomial) {
        String answer = "";

        String[] arr = polynomial.split(" ");

        int xSum = 0;
        int sum = 0;
        for(String a : arr) {
            if(!a.equals("+")) {
                if(a.charAt(a.length()-1) == 'x') {
                    if(a.length() == 1) {
                        xSum++;
                    } else {
                        xSum += Integer.valueOf(a.substring(0,a.length()-1));
                    }
                } else {
                    sum += Integer.valueOf(a);
                }
            }
        }

        if(xSum > 0) {
            if(xSum == 1) {
                answer += "x";
            } else {
                answer += String.valueOf(xSum) + "x";
            }
        }

        if(sum > 0) {
            if(!answer.equals("")) {
                answer += " + ";
            }
            answer += String.valueOf(sum);
        }

        return answer.trim();
    }
}
