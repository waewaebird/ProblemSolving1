package RecursiveTreeGraph.rev;

public class Main5RRRRR {
    Node root;

    public static void DFS(Node root) {
        if(root == null) {
            return;
        } else {
            DFS(root.lt);
            DFS(root.rt);
            System.out.print(root.data + " ");
        }
    }


    public static void main(String[] args) {
        Main5RRRRR tree = new Main5RRRRR();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        System.out.print("후위순회 : ");
        DFS(tree.root);
    }
}
