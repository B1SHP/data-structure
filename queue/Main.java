public class Main {

    public static void main(String[] args){

        Queue queue = new Queue(10);

        for(int i = 0 ; i < 100 ; i++){

            if(i == 10 || i == 12 || i == 14){

                System.out.println("@===@Remove@===@\nI: " + i);

                queue.remove();

                queue.imprime();

            }

            System.out.println("@===@Insere@===@\nI: " + i);

            queue.insere(i);

            queue.imprime();

        }

        queue.imprime();

    }
    
}
