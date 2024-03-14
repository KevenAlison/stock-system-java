package application;

public class EstoqueLoja {
    private static int contId = 0;

    private int idEstoqueLoja;
    private Produto produto;
    private Movimentacao movimentacao;

    public EstoqueLoja(Produto produto, Movimentacao movimentacao) {
        this.idEstoqueLoja = ++contId;
        this.produto = produto;
        this.movimentacao = movimentacao;
    }

    public int getIdEstoqueLoja() {
        return idEstoqueLoja;
    }

    public void setIdEstoqueLoja(int idEstoqueLoja) {
        this.idEstoqueLoja = idEstoqueLoja;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Movimentacao getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(Movimentacao movimentacao) {
        this.movimentacao = movimentacao;
    }
}
