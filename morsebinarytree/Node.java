//TODO insercao
//TODO busca / busca multipla

// <-- DOT | LINE -->

public class Node {

    private String data;
    private Node left;
    private Node right;

    public Node(String data) {

        this.data = data;

    } 

    public String getCharacter(String morse) {

        if (morse == null || morse.length() < 1) {

            return data;

        }

        if (morse.substring(0, 1).contains("_")) {

            if (right != null) {

                return right.getCharacter(
                    morse.length() > 1 ? morse.substring(1) : null
                );

            }

        } else {

            if (left != null) {

                return left.getCharacter(
                    morse.length() > 1 ? morse.substring(1) : null
                );

            } 

        }

        return null;

    }

    public static Node createAndInsert(String morse, String newData) {

        Node node = new Node(null);

        String currentMove = morse.substring(0, 1);

        if (currentMove.contains("_")) {

            if (morse.length() > 1) {

                node.right(
                    createAndInsert(
                        morse.substring(1), 
                        newData
                    )
                );

            } else {

                node.right(
                    new Node(newData)
                );

            }
            
        } else {
            
            if (morse.length() > 1) {

                node.left(
                    createAndInsert(
                        morse.substring(1), 
                        newData
                    )
                );

            } else {

                node.left(
                    new Node(newData)
                );

            }

        }

        return node;

    }

    public void insert(String morse, String newData) {

        String currentMove = morse.substring(0, 1);

        if (currentMove.contains("_")) {

            if (morse.length() > 1) {

                if (right != null) {

                    right.insert(morse.substring(1), newData);

                } else {

                    right = new Node(null);

                    right.insert(morse.substring(1), newData);

                }

            } else {

                if (right != null) {

                    right.data(newData);

                } else {

                    right = new Node(newData);

                }

            }
            
        } else {

            if (morse.length() > 1) {

                if (left != null) {

                    left.insert(morse.substring(1), newData);

                } else {

                    left = new Node(null);

                    left.insert(morse.substring(1), newData);

                }

            } else {

                if (left != null) {

                    left.data(newData);

                } else {

                    left = new Node(newData);

                }

            }

        }

    }

    public void posOrder() {

        if (left != null) {

            left.posOrder();

        }

        if (right != null) {

            right.posOrder();

        }

        if (data != null) {

            System.out.print(data + ",");

        }

    }

    public void preOrder() {

        if (data != null) {

            System.out.print(data + ",");

        }

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

        if (data != null) {

            System.out.print(data + ",");

        }

        if (right != null) {

            right.inOrder();

        }

    }

    public void data(String data) {
        this.data = data;
    }

    public void right(Node right) {
        this.right = right;
    }

    public void left(Node left) {
        this.left = left;
    }

    public String data() {
        return data;
    }

    public Node right() {
        return right;
    }

    public Node left() {
        return left;
    }

    @Override
    public String toString() {
        return "data: " + data + ", right: " + right + ", left: " + left;
    }

}
