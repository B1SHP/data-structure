import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private static final ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {

        int[] tableSizes = {1000, 10000, 100000};

        int[] tiposHash = {1, 2, 3};

        Registro[][] registros = {
            Registro.build(1000000), 
            Registro.build(5000000), 
            Registro.build(20000000)
        };

        System.out.println("Starting the actual algorithim");

        for(int i : new int[]{1, 2, 3, 4}) {

            for (int tamanho : tableSizes) {

                HashTable tabela = new HashTable(tamanho);

                for (int tipoHash : tiposHash) {

                    for (Registro[] registro : registros) {

                        executorService.execute(() -> HashTable.test(tabela, registro, tipoHash, i));

                    }

                }

            }

        }

    }

}