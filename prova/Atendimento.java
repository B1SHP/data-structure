public class Atendimento extends Elemento {

    private String idSolicitacao;
    private String nome;
    private String motivoDeAtendimento;

    public String nome() {
        return nome;
    }

    public String motivoDeAtendimento() {
        return motivoDeAtendimento;
    }

    public String idSolicitacao() {
        return idSolicitacao;
    }

    public Atendimento(String idSolicitacao, String nome, String motivoDeAtendimento) {
        this.idSolicitacao = idSolicitacao;
        this.nome = nome;
        this.motivoDeAtendimento = motivoDeAtendimento;
    }

    @Override
    public String toString() {
        return "idSolicitacao: " + idSolicitacao + ", nome: " + nome + ", motivoDeAtendimento: " + motivoDeAtendimento;
    }
    
}
