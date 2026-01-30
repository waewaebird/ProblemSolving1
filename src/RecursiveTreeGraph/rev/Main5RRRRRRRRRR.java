package RecursiveTreeGraph.rev;

public class Main5RRRRRRRRRR {
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

    public void DFS(Node root) {
        //System.out.print(root.data + " ");
        if(root.lt != null) {
            DFS(root.lt);
        }

        //System.out.print(root.data + " ");

        if(root.rt != null) {
            DFS(root.rt);
        }

        //System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Main5RRRRRRRRRR T = new Main5RRRRRRRRRR();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        T.root.rt.lt = new Node(6);
        T.root.rt.rt = new Node(7);

        T.DFS(T.root);
    }
}
