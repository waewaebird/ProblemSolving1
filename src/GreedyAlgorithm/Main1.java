package GreedyAlgorithm;

import java.util.*;

class Person implements Comparable<Person>{
    int height;
    int weight;
    public Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }
    @Override
    public int compareTo(Person o) {
        return o.height-this.height;
    }
}

public class Main1 {
    public static int solution2(List<Person> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);

        int max = Integer.MIN_VALUE;

        for(Person p : arr) {
            if(p.weight > max) {
                max = p.weight;
                cnt++;
            }
        }
        return cnt;
    }

    public static int solution(int n, Person[] arr) {
        int tal = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i != j) {
                    if(arr[j].height > arr[i].height && arr[j].weight > arr[i].weight) {
                        tal++;
                        break;
                    }
                }
            }
        }
        return n-tal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Person[] arr = new Person[n];
        List<Person> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int h = in.nextInt();
            int w = in.nextInt();

            list.add(new Person(h,w));
            arr[i] = new Person(h,w);
        }

        System.out.println(solution(n,arr));
        System.out.println(solution2(list,n));
    }
}
