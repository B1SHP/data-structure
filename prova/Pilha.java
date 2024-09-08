public class Pilha {

    private Node node;

    public Pilha() {
        this.node = null;
    }

    public void insere(Elemento elemento) {

        Node novoNode = new Node(elemento);

        novoNode.node(node);

        node = novoNode;

    }

    public Elemento coleta() {

        if (node == null) {

            return null;

        }

        Elemento elemento = node.elemento();

        node = node.node();

        return elemento;

    }

    public boolean estaVazio() {
        return node == null;
    }

    public void print() {

        Node nodeAtual = node;

        while (nodeAtual != null) {

            System.out.println(nodeAtual.elemento().toString());

            nodeAtual = nodeAtual.node();

        }

    }

    public static void teste() {

        Elemento[] historicos = new Elemento[] {
            new Historico("REQ001", "Instalação de software", "2024-08-20 10:30"),
            new Historico("REQ002", "Manutenção preventiva", "2024-08-20 11:00"),
            new Historico("REQ003", "Atualização de sistema", "2024-08-20 11:30"),
            new Historico("REQ004", "Suporte técnico", "2024-08-20 12:00"),
            new Historico("REQ005", "Troca de equipamento", "2024-08-20 12:30"),
            new Historico("REQ006", "Consulta de garantia", "2024-08-20 13:00"),
            new Historico("REQ007", "Reparo de impressora", "2024-08-20 13:30"),
            new Historico("REQ008", "Configuração de rede", "2024-08-20 14:00"),
            new Historico("REQ009", "Restauração de dados", "2024-08-20 14:30"),
            new Historico("REQ010", "Consulta técnica", "2024-08-20 15:00")
        };

        Pilha pilha = new Pilha();

        for (Elemento elemento : historicos) {

            pilha.insere(elemento);

        }

        for (int i = 0 ; i < historicos.length ; i++) {

            System.out.println("@=============================@");

            pilha.print();

            System.out.println("@=============================@");

            System.out.println(pilha.coleta());

        }

    }
    
}
