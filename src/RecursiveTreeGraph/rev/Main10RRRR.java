package RecursiveTreeGraph.rev;

import java.util.LinkedList;
import java.util.Queue;

public class Main10RRRR {
    Node root;

    public int BFS(Node tree) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(tree);

        int level = 0;

        while(!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                Node cur = queue.poll();

                if(cur.lt == null && cur.rt == null) {
                    return level;
                }

                if(cur.lt != null) {
                    queue.offer(cur.lt);
                }
                if(cur.rt != null) {
                    queue.offer(cur.rt);
                }
            }
            level++;
        }

        return level;
    }


    public static void main(String[] args) {
        Main10RRRR tree = new Main10RRRR();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.println(tree.BFS(tree.root));

    }

}
