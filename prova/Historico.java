public class Historico extends Elemento {

    private String numeroDeIdentificacao;
    private String descricao;
    private String dataHora;

    public String dataHora() {
        return dataHora;
    }

    public String numeroDeIdentificacao() {
        return numeroDeIdentificacao;
    }

    public String descricao() {
        return descricao;
    }

    public Historico(String numeroDeIdentificacao, String descricao, String dataHora) {
        this.numeroDeIdentificacao = numeroDeIdentificacao;
        this.descricao = descricao;
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "numeroDeIdentificacao: " + numeroDeIdentificacao + ", descricao: " + descricao + ", dataHora: " + dataHora;
    } 
    
}
