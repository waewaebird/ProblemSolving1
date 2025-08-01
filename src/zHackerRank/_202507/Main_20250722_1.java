package zHackerRank._202507;

import java.util.*;

public class Main_20250722_1 {
    // Almost Sorted
    public static void solution(int n, int[] arr) {
        List<Integer> group = new ArrayList<>();
        Set<Integer> group2 = new LinkedHashSet<>();

        int[] temp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(temp);

        int cnt = 0;
        for (int i = 1; i < n; i++) {
            if(arr[i-1] > arr[i]) {
                group.add(i-1);
                group.add(i);

                group2.add(arr[i-1]);
                group2.add(arr[i]);
                cnt++;
            }
        }

        if(cnt >= 1) {
            if(cnt == 1 || cnt == 2) {
                int before = group.get(0); // i-1
                int after = group.get(1); // i

                if(cnt == 2) {
                    after = group.get(group.size()-1);
                }

                int tempo = arr[before];
                arr[before] = arr[after];
                arr[after] = tempo;

                boolean flags = true;
                for (int i = 0; i < arr.length; i++) {
                    if(temp[i] != arr[i]) {
                        flags = false;
                        break;
                    }
                }

                if(flags) {
                    System.out.println("yes");
                    System.out.println("swap " + (before+1) + " " + (after+1));
                } else {
                    System.out.println("no");
                }

            } else {

                int minIndex = Collections.min(group);
                int maxIndex = Collections.max(group);

                int minVal = arr[minIndex];
                int maxVal = arr[maxIndex];


                boolean flag = true;
                int nowV = Integer.MAX_VALUE;
                for(Integer x : group2) {
                    if(nowV > x) {
                        nowV = x;
                    } else {
                        flag = false;
                        break;
                    }
                }

                if(flag) {
                    System.out.println("yes");
                    System.out.print("reverse ");

                    for (int i = 0; i < arr.length; i++) {
                        if(arr[i] == maxVal) {
                            System.out.print((i+1) + " ");
                        }
                        if(arr[i] == minVal) {
                            System.out.print((i+1) + " ");
                        }
                    }


                } else {
                    System.out.println("no");
                }


            }
        } else {
            System.out.println("yes");
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        solution(n, arr);
    }
}
