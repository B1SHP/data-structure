public class Main {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree(8);

//        binaryTree.insert(2);
//        binaryTree.insert(1);
//        binaryTree.insert(4);
//        binaryTree.insert(3);
//        binaryTree.insert(5);
//        binaryTree.insert(7);
//        binaryTree.insert(10);
//        binaryTree.insert(9);

        //15, 4, 9, 7, 18, 3, 5, 16, 20, 17, 9, 5 
        //8,3,11,1,5,9,14,6,10,12,15,7,13
        for (int i : new int[]{3,11,1,5,9,14,6,10,12,15,7,13}) {

            binaryTree.insert(i);

        }

        binaryTree.print(Order.IN_ORDER);

        binaryTree.deleteSpecific(11);

        binaryTree.print(Order.IN_ORDER);

    }

}
