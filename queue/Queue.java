public class ArrayList {

    private int primeiroASair;
    private int ultimoInserido;
    private int tamanho;
    private int[] data;

    public ArrayList(int tamanho){
        this.tamanho = tamanho;
        data = new int[tamanho];
        primeiroASair = 0;
        ultimoInserido = -1;
    }

    public boolean cheia(){

        return primeiroASair == 0 && ultimoInserido == tamanho - 1;

    }

    public boolean vazia(){

        return primeiroASair == -1;

    }

    public void insere(int valor){

        if(cheia()){

            for(int i = 0; i < ultimoInserido ; i++){
 
                data[i] = data[i + 1];

            }

            data[ultimoInserido] = valor;

        } else if(primeiroASair > 0){

            int ultimoTemporario = 0;

            for(int i = 0 ; i <= ultimoInserido ; i++){

                if(primeiroASair <= ultimoInserido){

                    data[i] = data[primeiroASair];

                    primeiroASair++;

                    ultimoTemporario = i;
                
                } else {

                    break;

                }

            } 

            ultimoInserido = ultimoTemporario + 1;

            data[ultimoInserido] = valor;

            primeiroASair = 0;

        } else {

            ultimoInserido++;

            data[ultimoInserido] = valor;

        }

    }

    public void remove(){

        if(primeiroASair + 1 == ultimoInserido){

            primeiroASair = -1;

        } else {

            primeiroASair++;

        }

    }

    public void imprime(){

        for(int i = primeiroASair ; i <= ultimoInserido ; i++){

            System.out.println("I: " + i + ", Value: " + data[i]);

        }

        System.out.println("Primeiro a sair: " + primeiroASair + ", Ultimo inserido: " + ultimoInserido);

    }
    
}
