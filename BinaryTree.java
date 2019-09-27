class BinaryTree {
	Node root;
	BinaryTree(double value) {
		root = new Node(value);
	}

	BinaryTree() {
		root = null;
	}
    void printInorder(Node node) {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.value + ",");
        printInorder(node.right);
    }
}