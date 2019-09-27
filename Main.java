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
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        double targetVal = 0.5;
        tree.root = new Node(5);
        tree.root.left = new Node(3);
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
