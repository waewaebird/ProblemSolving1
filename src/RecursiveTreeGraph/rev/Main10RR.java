package RecursiveTreeGraph.rev;

import java.util.*;

public class Main10RR {
    static Node root;

    public int BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();


        queue.offer(root);

        int L = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                Node current = queue.poll();

                if(current.lt == null && current.rt == null) {
                    return L;
                }

                if(current.lt != null) {
                    queue.offer(current.lt);
                }

                if(current.rt != null) {
                    queue.offer(current.rt);
                }
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        Main10RR T = new Main10RR();

        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        System.out.println(T.BFS(root));
    }

}
