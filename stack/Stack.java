public class Stack {

    private int tamanho;
    private int topo;
    private int[] data;

    public Stack(int tamanho){
        topo = -1;
        this.tamanho = tamanho;
        data = new int[tamanho];
    }

    public void insere(int valor){

        if(topo + 1 < tamanho){

            topo++;
            
            data[topo] = valor;

        }

    }

    public boolean cheia(){

        return topo == tamanho - 1;

    }

    public boolean vazia(){

        return topo == -1;

    }

    public void remove(){

        if(topo >= 0){

            topo--;

        }

    }

    public void imprime(){

        System.out.print("Values: ");

        for(int i = 0 ; i <= topo ; i++){

            System.out.print(data[i] + ", ");

        }

        System.out.println();

    }
    
}
