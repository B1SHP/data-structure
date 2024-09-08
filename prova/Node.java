public class Node {

    private Elemento elemento;
    private Node node;

    public void node(Node node) {
        this.node = node;
    }

    public Node node() {
        return node;
    }

    public void elemento(Elemento elemento) {
        this.elemento = elemento;
    }

    public Elemento elemento() {
        return elemento;
    }

    public Node(Elemento elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "elemento: " + elemento.toString() + ", node: " + node.toString();
    }
    
}
