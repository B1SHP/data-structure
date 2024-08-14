public class Node {

    private String valor;
    private int ponteiro;

    public Node(String valor){
        this.valor = value;
        this.ponteiro = -1;
    }

    public void alteraPonteiro(int ponteiro){
        this.ponteiro = ponteiro;
    }

    public String valor(){
        return valor;
    }

    public int ponteiro(){
        return ponteiro;
    }

    @Override
    public String toString(){
        return String.format("ponteiro=%d, valor=%s", ponteiro, value);
    }
    
}
