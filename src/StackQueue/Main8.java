package StackQueue;


import java.util.*;


public class Main8 {
    public static int solution2(int n,  int m, int[] arr){
        int answer = 0;
        Queue<Map<Integer,Integer>> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            map.put(i,arr[i]);
            queue.offer(map);
        }

        while(!queue.isEmpty()) {
            Map<Integer, Integer> temp = queue.poll();
            boolean flag = true;

            for(Map<Integer, Integer> map : queue) {

                List<Integer> valuesList = new ArrayList<>(map.values());
                List<Integer> tempList = new ArrayList<>(temp.values());


                if(valuesList.get(0) > tempList.get(0)) {
                    queue.offer(temp);
                    flag = false;
                    break;
                }
            }

            if(flag == true) {
                answer++;
                if(temp.containsKey(m)) {
                    break;
                }
            }
        }
        return answer;
    }


    static class Person{
        int id;
        int priority;

        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    public static int solution(int n,  int m, int[] arr){
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Q.offer(new Person(i, arr[i]));
        }

        while(!Q.isEmpty()) {
            Person tmp = Q.poll();
            for(Person x : Q) {
                if(x.priority > tmp.priority) {
                    Q.offer(tmp);
                    tmp =null;
                    break;
                }
            }
            if(tmp != null){
                answer++;
                if(tmp.id == m) {
                    return answer;
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution2(n,m,arr));
    }
}
