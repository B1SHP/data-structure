public class Fila {

    private Node frente;
    private Node tras;

    public void insere(Elemento elemento) {

        Node novoNode = new Node(elemento);

        if (tras == null) {

            tras = novoNode;
            frente = tras;

        } else {

            tras.node(novoNode);
            tras = novoNode;

        }

    }

    public Elemento coleta() {

        if (frente == null) {

            return null;

        }

        Elemento elemento = frente.elemento();

        frente = frente.node();

        if (frente == null) {
            tras = null;
        }

        return elemento;

    }

    public boolean estaVazio() {

        return frente == null;

    }

    public void print() {

        Node nodeAtual = frente;

        while (nodeAtual != null) {

            System.out.println(nodeAtual.elemento());
            nodeAtual = nodeAtual.node();

        }

    }

    public static void teste() {

        Elemento[] atendimentos = new Elemento[] {
            new Atendimento("CLI001", "Maria Silva", "Dúvida sobre produto"),
            new Atendimento("CLI002", "João Souza", "Reclamação de serviço"),
            new Atendimento("CLI003", "Ana Costa", "Solicitação de reembolso"),
            new Atendimento("CLI004", "Pedro Alves", "Informações de entrega"),
            new Atendimento("CLI005", "Carla Dias", "Agendamento de visita"),
            new Atendimento("CLI006", "Lucas Martins", "Alteração de pedido"),
            new Atendimento("CLI007", "Patrícia Rocha", "Cancelamento de contrato"),
            new Atendimento("CLI008", "Rafael Lima", "Renovação de assinatura"),
            new Atendimento("CLI009", "Fernanda Gomes", "Suporte para instalação"),
            new Atendimento("CLI010", "Carlos Eduardo", "Pedido de orçamento")
        };

        Fila fila = new Fila();

        for(Elemento elemento : atendimentos) {

            fila.insere(elemento);

        }

        for (int i = 0 ; i < atendimentos.length ; i++) {

            System.out.println("@=============================@");

            fila.print();

            System.out.println("@=============================@");

            System.out.println(fila.coleta());

        }

    }
    
}
