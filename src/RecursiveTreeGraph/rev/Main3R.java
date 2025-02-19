package RecursiveTreeGraph.rev;

public class Main3R {
    public static int DFS(int v) {
        if(v == 0) {
            return 1;
        } else {
            if(v == 1) {
                System.out.print(v + "=");
            } else {
                System.out.print(v + "*");
            }
            int n = DFS(v-1);
            return n*v;
        }
    }


    public static void main(String[] args) {
        System.out.println(DFS(5));
    }
}
