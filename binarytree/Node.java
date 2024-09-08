public class Node {

    private int data;
    private Node left;
    private Node right;

    private void change(Node node) {
        this.data = node.data();
        this.right = node.right();
    }

    public void deleteSpecific(int valueToBeDeleted) {

        if (valueToBeDeleted > data) {

            if (right != null) {

                right.deleteSpecific(valueToBeDeleted);

            } else {

                return;

            }

        } else if (valueToBeDeleted < data){

            if (left != null) {

                left.deleteSpecific(valueToBeDeleted);

            } else {

                return;

            }

        } else {

            Node smallestNode = right.smallestNode(); 

            this.data = smallestNode.data();

        }

    }

    public Node smallestNode() {

        if (left != null) {

            return left.smallestNode();

        }

        Node node = new Node(data);

        System.out.println(data);

        change(right);

        return node;

    }

    public Node(int data) {

        this.data = data;

    } 

    public void insert(int newData) {

        if (newData >= data) {

            if (right != null) {

                right.insert(newData);

            } else {

                right = new Node(newData);

            }
            
        } else {

            if (left != null) {

                left.insert(newData);

            } else {

                left = new Node(newData);

            }

        }

    }

    public void removeSmallest() {

        if (left != null) {

            if (left.amITheSmallest()) {

                left = null;

            } else {

                left.removeSmallest();

            }

        }

    }

    public boolean amITheSmallest() {

        return left == null;

    }

    public void removeBiggest(){

        if (right != null) {

            if (right.amITheBiggest()) {

                right = null;

            } else {

                right.removeBiggest();

            }

        }

    }

    public boolean amITheBiggest() {

        return right == null;

    }

    public void posOrder() {

        if (left != null) {

            left.posOrder();

        }

        if (right != null) {

            right.posOrder();

        }

        System.out.print(data + ",");

    }

    public void preOrder() {

        System.out.print(data + ",");

        if (left != null) {

            left.preOrder();

        }

        if (right != null) {

            right.preOrder();

        }

    }

    public void inOrder() {

        if (left != null) {

            left.inOrder();

        }

        System.out.print(data + ",");

        if (right != null) {

            right.inOrder();

        }

    }

    public int data() {
        return data;
    }

    public Node right() {
        return right;
    }

}
