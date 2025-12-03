package zProgrammers;

class Solution_20251203_4 {
    public int solution(int[] nums) {
        int answer = 0;

        int len = nums.length;

        int sum = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                for (int k = j+1; k < len; k++) {
                    sum = nums[i] + nums[j] + nums[k];

                    boolean flag = true;
                    for (int l = 2; l < sum/2 + 1; l++) {
                        if(sum % l == 0) {
                            flag = false;
                            break;
                        }
                    }

                    if(flag) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}