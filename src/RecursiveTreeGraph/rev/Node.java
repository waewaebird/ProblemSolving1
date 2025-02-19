package RecursiveTreeGraph.rev;

public class Node {
    int data;
    Node lt;
    Node rt;

    public Node(int val) {
        data = val;
        this.lt = null;
        this.rt = null;
    }
}
