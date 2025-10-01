package zProgrammers._202509;

import java.util.ArrayList;
import java.util.List;

class Solution_20250924_1 {
    static class Employee2 implements Comparable<Employee2> {
        int a;
        int b;
        boolean is;

        public Employee2(int a, int b, boolean is) {
            this.a = a;
            this.b = b;
            this.is = is;
        }

        @Override
        public int compareTo(Employee2 o) {
            if(o.a == this.a) {
                return Integer.compare(this.b, o.b);
            } else {
                return Integer.compare(o.a, this.a);
            }

        }
    }

    static class Employee implements Comparable<Employee> {
        int a;
        int b;
        int is;

        public Employee(int a, int b, int is) {
            this.a = a;
            this.b = b;
            this.is = is;
        }

        @Override
        public int compareTo(Employee o) {
            if(o.a + o.b == this.a + this.b) {
                return Integer.compare(this.is, o.is);
            } else {
                return Integer.compare(o.a + o.b, this.a + this.b);
            }
        }
    }

    public int solution(int[][] scores) {
        int answer = 0;

        List<Employee> list = new ArrayList<>();
        List<Employee2> list2 = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            boolean flags = false;
            if(i == 0) {
                flags = true;
            }
            list2.add(new Employee2(scores[i][0],  scores[i][1], flags));
        }

        list2.sort(null);
        int max = 0;


        for(Employee2 e : list2) {
            int me = 99;
            if(e.b >= max) {
                max = e.b;

                if(e.is == true) {
                    me = 1;
                }
                list.add(new Employee(e.a,  e.b, me));
            } else {
                if(e.is == true) {
                    answer = -1;
                }
            }
        }

        if(answer == -1) {
            return answer;
        } else {
            list.sort(null);
            int cnt = 1;

            for(Employee e : list) {
                if(e.is == 1) {
                    break;
                }
                cnt++;
            }

            answer = cnt;
            return answer;
        }
    }
}