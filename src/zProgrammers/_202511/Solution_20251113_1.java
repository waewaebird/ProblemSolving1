package zProgrammers._202511;

class Solution_20251113_1 {
    static int[] Ns;
    static int answer = 0;
    static int arr[] = new int[3];
    static int len = 0;

    public static void DFS(int v,int start) {
        if(v == 3) {
            int sum = 0;
            for(int x : arr) {
                sum += x;
            }

            if(sum == 0) {
                answer++;
            }

        } else {
            for (int i = start; i < len; i++) {
                arr[v] = Ns[i];
                DFS(v+1, i+1);
            }
        }
    }

    public int solution(int[] number) {
        len = number.length;
        Ns = number;

        DFS(0,0);

        return answer;
    }
}