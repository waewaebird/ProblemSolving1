package RecursiveTreeGraph.rev;

public class Main5R {
    Node root;

    public void DFS(Node root) {
        if(root == null) { //말단 노드
            return;
        } else {
            DFS(root.lt);
            DFS(root.rt);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Main5R T = new Main5R();
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
