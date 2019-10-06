import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class Main {
    static boolean treeTraverse(double target, BinaryTree theTree, Node current) {
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
    static Queue<Node> assembleQueue(List<Node> nodelist) {
        Queue<Node> queue = new LinkedList();
        for (int i = 0;i<nodelist.size();i++) {
            queue.add(nodelist.get(i));
        }
        return queue;
    }
    static BinaryTree assembleTree(Queue<Node> queue,BinaryTree tree,Node current) {
        Node item = queue.peek();
        if (queue.isEmpty()) {
            return tree;
        }
        if (tree.root == null) {
            tree.root = queue.peek();
            queue.remove();
        }
        if (item.value < current.value) {
            current.left = item;
            queue.remove();
        } else if (item.value >= current.value) {
            current.right = item;
            queue.remove();
        }
        return assembleTree(queue,tree,current);
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        List<Double> items = Arrays.asList(10.0, 2.0, 3.0, 1.5, 0.5, 7.9);
        List<Node> listofnodes = assembleNodeList(items);
        Queue queue = assembleQueue(listofnodes);
        BinaryTree theTree = assembleTree(queue, tree, tree.root);
        // try {
        // System.out.println(treeTraverse(targetVal,tree,tree.root));
        // } catch (NullPointerException e) {
        // System.out.println(false);
        // }
    }
}
