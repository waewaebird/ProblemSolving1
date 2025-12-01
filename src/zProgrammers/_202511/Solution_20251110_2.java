package zProgrammers._202511;

import java.util.Arrays;

class Solution_20251110_2 {
    /*public int solution(int[] people, int limit) {
        Arrays.sort(people);

        int answer = 0;
        int sum = 0;
        int index = 0;
        for (int i = people.length-1; i >= index; i--) {
            if(people[i] > limit) {
                continue;
            }

            sum += people[i];

            if(sum >= limit) {
                if(sum == limit) {
                    answer++;
                    sum = 0;
                } else {
                    sum = sum - people[i];
                    answer++;
                }
            } else {
                while(index < i) {
                    if(people[index] + sum <= limit) {
                        sum += people[index];
                        answer++;
                        sum = 0;
                        index++;
                        break;
                    } else {
                        sum = people[index];
                        index++;
                        answer++;
                        break;
                    }
                }
            }

        }

        if(sum > 0) {
            answer++;
        }


        return answer;
    }*/

    public int solution(int[] people, int limit) {
        Arrays.sort(people);

        int answer = 0;

        int lt = 0;
        int rt = people.length-1;

        while(lt <= rt) {
            if(people[lt] + people[rt] <= limit) {
                lt++;
            }
            rt--;
            answer++;
        }

        return answer;
    }
}