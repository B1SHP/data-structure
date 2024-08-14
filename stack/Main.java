public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack(10);

        boolean cheia = false;

        for(int i = 0 ; i < 100 ; i++){

            if(stack.cheia()){

                cheia = true;
                stack.remove();

            } else if(stack.vazia()){

                cheia = false;
                stack.insere(i);

            } else if(cheia){

                stack.remove();

            } else if(!cheia){

                stack.insere(i);

            } 

            stack.imprime();

        }
        
    }
    
}
