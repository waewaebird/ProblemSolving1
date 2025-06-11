package RecursiveTreeGraph.rev;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main10RRRRRRR {
    // Tree 말단 노드까지의 가장 짧은 경로
    static class Node {
        int data;
        Node lt;
        Node rt;

        public Node(int data) {
            this.data = data;
            this.lt = null;
            this.rt = null;
        }
    }
    Node root;

    public static int BFS(Node tree) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(tree);

        int level = 0;
        boolean flag = false;
        while(!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node temp = queue.poll();

                if(temp.lt == null && temp.rt == null) {
                    flag = true;
                    break;
                }

                if(temp.lt != null) {
                    queue.offer(temp.lt);
                }

                if(temp.rt != null) {
                    queue.offer(temp.rt);
                }
            }

            if(flag) {
                break;
            }

            level++;
        }
        return level;
    }

    public static void main(String[] args) {
        Main10RRRRRRR tree = new Main10RRRRRRR();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(4);

        System.out.println(BFS(tree.root));
    }


}
