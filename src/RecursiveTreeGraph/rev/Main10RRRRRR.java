package RecursiveTreeGraph.rev;

import java.util.LinkedList;
import java.util.Queue;

public class Main10RRRRRR {
    Node root;

    public static int BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int level = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                Node current = queue.poll();

                if(current.lt == null && current.rt == null) {
                    return level;
                }

                if(current.lt != null) {
                    queue.offer(current.lt);
                }
                if(current.rt != null) {
                    queue.offer(current.rt);
                }
            }
            level++;
        }

        return level;
    }

    public static void main(String[] args) {
        Main10RRRRRR tree = new Main10RRRRRR();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.println(BFS(tree.root));

    }
}
