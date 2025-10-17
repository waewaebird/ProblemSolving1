package RecursiveTreeGraph.rev;

public class Main1RRRRRRR {
    // 재귀함수
    public static void DFS(int v) {
        if(v == 1) {
            System.out.print(v + " ");
        } else {
            DFS(v-1);
            System.out.print(v + " ");
        }

    }

    public static void main(String[] args) {
        DFS(3);
    }
}
