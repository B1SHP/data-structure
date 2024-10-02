public class BinaryTree {

    private Node node;

    public BinaryTree(){}

    public String getCharacterArray(String[] morses) {

        if (node == null) {

            return null;

        }

        String string = new String();

        for (String morse : morses) {

            String character = node.getCharacter(morse);

            string += character == null ? "_" : character;

        }

        return string;

    }

    public String getCharacter(String... morses) {

        if (node == null) {

            return null;

        }

        String string = new String();

        for (String morse : morses) {

            String character = node.getCharacter(morse);

            string += character == null ? "_" : character;

        }

        return string;

    }

    public void insert(String morse, String newData) {

        if (node == null) {

            node = node.createAndInsert(morse, newData);

        } else {

            node.insert(morse, newData);

        }

    }

    public void print(Order order) {  

        if (node == null) {

            return;

        }

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
