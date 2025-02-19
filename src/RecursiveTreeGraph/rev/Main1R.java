package RecursiveTreeGraph.rev;

public class Main1R {
    public static void DFS(int v) {
        if(v == 0) {
            return;
        } else {
            DFS(v-1);
            System.out.print(v + " ");
        }
    }

    public static void main(String[] args) {
        DFS(3);
    }
}
