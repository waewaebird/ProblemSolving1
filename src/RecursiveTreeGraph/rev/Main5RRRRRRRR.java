package RecursiveTreeGraph.rev;

public class Main5RRRRRRRR {
    // 이진트리 순회(깊이우선탐색)
    static class Node {
        int data;
        Node lt;
        Node rt;

        public Node(int data) {
            this.data = data;
        }
    }

    Node root;

    public static void DFS(Node root) {
        if(root == null) {
            return;
        } else {
            if(root.data == 1) {
                System.out.print("전위순회 : ");
            }
            System.out.print(root.data + " ");
            DFS(root.lt);
            DFS(root.rt);
        }
    }

    public static void main(String[] args) {
        Main5RRRRRRRR T = new Main5RRRRRRRR();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        T.root.rt.lt = new Node(6);
        T.root.rt.rt = new Node(7);

        DFS(T.root);
    }
}
