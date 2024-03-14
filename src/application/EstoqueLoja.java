package application;

public class EstoqueLoja {
	private static int contId = 0;
	
	private int idEstoqueLoja;
	private EstoqueProduto estoqueProduto;
	private Movimentacao Movimentacao;
	
	public EstoqueLoja(EstoqueProduto estoqueProduto, application.Movimentacao movimentacao) {
		super();
		this.idEstoqueLoja = ++contId;
		this.estoqueProduto = estoqueProduto;
		Movimentacao = movimentacao;
	}

	public int getIdEstoqueLoja() {
		return idEstoqueLoja;
	}

	public void setIdEstoqueLoja(int idEstoqueLoja) {
		this.idEstoqueLoja = idEstoqueLoja;
	}

	public EstoqueProduto getEstoqueProduto() {
		return estoqueProduto;
	}

	public void setEstoqueProduto(EstoqueProduto estoqueProduto) {
		this.estoqueProduto = estoqueProduto;
	}

	public Movimentacao getMovimentacao() {
		return Movimentacao;
	}

	public void setMovimentacao(Movimentacao movimentacao) {
		Movimentacao = movimentacao;
	}
	
	
}
