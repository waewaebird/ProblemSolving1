import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BikeRacers {
    static class Location implements Comparable<Location>{
        int I;
        int J;
        public Location(int i, int j) {
            I = i;
            J = j;
        }

        @Override
        public String toString() {
            return "Location{" +
                    "I=" + I +
                    ", J=" + J +
                    '}';
        }

        @Override
        public int compareTo(Location o) {
            return Integer.compare(this.I + this.J, o.I + o.J);
        }
    }

    public static Integer calculate(List<Location> loc1,List<Location> loc2, int mid) {
        int cnt = 0;

        int index = 0;
        for (int i = 0; i < loc1.size(); i++) {
            for (int p = index; p < loc2.size(); p++) {
                double sum = 0;

                sum += Math.pow(loc1.get(i).I - loc2.get(p).I, 2);
                sum += Math.pow(loc1.get(i).J - loc2.get(p).J, 2);

                if(Math.sqrt(sum) <= mid) {
                    cnt++;
                    index++;
                    break;
                }
            }
        }

        return cnt;
    }

    public static Integer solution(int n,int m,int k,List<Location> loc1,List<Location> loc2,int min,int max) {
        int answer = Integer.MAX_VALUE;

        loc1.sort(null);
        loc2.sort(null);

        while(min <= max) {
            int mid = (min + max) / 2;

            int result = calculate(loc1, loc2, mid);

            if(result >= k) {
                answer = Math.min(answer, mid);
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return (int) Math.pow(answer, 2);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        List<Location> loc1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            min = Math.min(a, min);
            max = Math.max(a, max);

            int b = in.nextInt();
            min = Math.min(b, min);
            max = Math.max(b, max);

            loc1.add(new Location(a,b));
        }
        
        List<Location> loc2 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            min = Math.min(a, min);
            max = Math.max(a, max);

            int b = in.nextInt();
            min = Math.min(b, min);
            max = Math.max(b, max);

            loc2.add(new Location(a,b));
        }


        System.out.println(solution(n,m,k,loc1,loc2,min,max));
    }
}
