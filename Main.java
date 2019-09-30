import java.util.List;
import java.util.ArrayList;
class Main {
    static boolean treeTraverse(double target,BinaryTree theTree,Node current) {
        if (target == current.value) {
            return true;
        } else if (target < current.value) {
            current = current.left;
        } else if (target >= current.value) {
            current = current.right;
        }
        return treeTraverse(target, theTree, current);
    }
    static List<Node> assembleNodeList(List<Double> items) {
        ArrayList<Node> nodelist = new ArrayList<Node>();
        for (int i = 0; i < items.size(); i++) {
            nodelist.add(new Node(items.get(i)));
        }
        return nodelist;
    }
    static Queue assembleQueue(List<Node> nodelist) {
        Queue<Node> queue = new LinkedList();
        for (int i = 0;i<nodelist.size();i++) {
            queue.add(nodelist.get(i));
        }
        return queue;
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        double targetVal = 0.5;
        tree.root = new Node(5);
        turee.root.left = new Node(3);
        tree.root.right = new Node(7);
        tree.root.left.left = new Node(1);
        tree.root.left.left.left = new Node(0.5);
        tree.printInorder(tree.root);
        try {
            System.out.println(treeTraverse(targetVal,tree,tree.root));
        } catch (NullPointerException e) {
            System.out.println(false);
        }
    }
}
