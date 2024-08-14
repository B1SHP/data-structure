public class LinkedList {

    private Node[] nodes;
    private int primeiro;
    private int preenchidos;
    private int tamanho;


    public LinkedList(int tamanho){

        nodes = new Node[tamanho];
        this.tamanho = tamanho;
        preenchidos = 0;
        primeiro = -1;

    }

    public void insere(String valor){

        if(primeiro == -1){

            nodes[0] = new Node(valor);

            preenchidos++;

        } else {

            int slotVazio = procuraSlotVazio();

            if(slotVazio == -1){

                return;

            }

            nodes[coletaUltimoNode()].alteraPonteiro(slotVazio);

            nodes[slotVazio] = new Node(value);

            preenchidos++;

        }

    }

    public void remove(int index){

        if(index > tamanho - 1){

            return;

        }

        

    }

    public boolean cheio(){

        return preenchidos == tamanho;

    }

    public boolean vazio(){

        return preenchidos == 0;

    }

    public void imprime(){

        Node node = nodes[primeiro];

        int ponteiro = node.ponteiro();

        while(node != null){

            System.out.println(node.toString());
    
            if(ponteiro != -1){

                node = nodes[ponteiro];

                ponteiro = node.ponteiro();

            } else {

                node = null;

            }

        }

    }

    private int coletaPonteiroUltimoNode(){

        int ponteiro = node.ponteiro();

        while(ponteiro != -1){

            ponteiro = nodes[ponteiro].ponteiro();

        }

        return ponteiro;

    }

    private int procuraSlotVazio(){

        for(int i = 0 ; i < tamanho ; i++){

            if(nodes[i] == null){

                return i;

            }

        }

        return -1;
 
    }
    
}
