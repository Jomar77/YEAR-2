package binaryTree;

public class TestBinary {

    public static void main(String args[]) {
        System.out.println("Test run by: John Sebastian Ablay");
        BinaryTree tree = new BinaryTree();
        System.out.println("Empty\t: " + tree.isEmpty());
        // node instantiation through BinaryTree object
        // addinq Node to a tree
        tree.addNode(12);
        tree.addNode(40);
        tree.addNode(50);
        // This MUST be true
        // Display Nodes via
        // end of main
        // end of class
        System.out.println("Empty\t: " + tree.isEmpty());
        Node node = new Node();
        node = tree.getRoot();
        
        System.out.println("Level Order\t: " + tree.printLevelOrder(node));
    }
}
