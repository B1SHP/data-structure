public class BinaryTree {

    private Node node;

    public BinaryTree(int i) {

        this.node = new Node(i);
    }

    public void deleteSpecific(int valueToBeDeleated) {

        node.deleteSpecific(valueToBeDeleated);

    }

    public void removeBiggest() {

        node.removeBiggest();

    }

    public void removeSmallest() {

        node.removeSmallest();

    }

    public void insert(int i) {

        node.insert(i);

    }

    public void print(Order order) {

        System.out.println("@========================@");

        if (order == Order.IN_ORDER) {

            node.inOrder();

        } else if (order == Order.POS_ORDER) {

            node.posOrder();

        } else if (order == Order.PRE_ORDER) {

            node.preOrder();

        }

        System.out.println();
        
    }

}
