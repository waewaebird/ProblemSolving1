package RecursiveTreeGraph.rev;

import java.util.LinkedList;
import java.util.Queue;

public class Main7RRRR {
    //이진트리 순회(넓이우선탑색 : 레벨탐색)

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

    public static void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        System.out.print("레벨 탐색 순회 출력 : ");

        while(!queue.isEmpty()) {
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
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        BFS(root);
    }

}
