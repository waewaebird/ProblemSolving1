package RecursiveTreeGraph.rev;

import java.util.LinkedList;
import java.util.Queue;

public class Main7RR {
    Node root;

    public void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        System.out.print("레벨 탐색 순회 출력 : ");

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            System.out.print(temp.data + " ");

            if(temp.lt != null) {
                queue.offer(temp.lt);
            }
            if(temp.rt != null) {
                queue.offer(temp.rt);
            }
        }

    }


    public static void main(String[] args) {
        Main7RR tree = new Main7RR();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.BFS(tree.root);
    }
}
