package RecursiveTreeGraph.rev;

import java.util.LinkedList;
import java.util.Queue;

public class Main9RR {
    Node root;

    public int DFS(Node root, int level) {
        if(root.lt == null && root.rt == null) {
            return level;
        } else {
            return Math.min(DFS(root.lt, level+1), DFS(root.rt, level+1));
        }
    }

    public int BFS(Node root) {
        int level = 0;

        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node cn = queue.poll();
                if(cn.lt == null && cn.rt == null) {
                    return level;
                } else {
                    if(cn.lt != null) {
                        queue.offer(cn.lt);
                    }
                    if(cn.rt != null) {
                        queue.offer(cn.rt);
                    }
                }
            }
            level++;
        }

        return level;

    }

    public static void main(String[] args) {
        Main9RR tree = new Main9RR();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        System.out.println(tree.BFS(tree.root));
        System.out.println(tree.DFS(tree.root, 0));

    }
}
