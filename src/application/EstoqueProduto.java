package application;

public class EstoqueProduto {
	
	private int idEstoqueProduto;
	private Produto produto;
	private int qntEstoque;
	private Movimentacao movimentacao;
	
	public EstoqueProduto(int idEstoqueProduto, Produto produto, int qntEstoque, Movimentacao movimentacao) {
		super();
		this.idEstoqueProduto = idEstoqueProduto;
		this.produto = produto;
		this.qntEstoque = qntEstoque;
		this.movimentacao = movimentacao;
	}

	public void realizarCompra(int qntComprada) {
		if (qntComprada > 0) {
			this.qntEstoque += qntComprada;
			System.out.println(qntComprada + " unidades do produto " + produto.getNome() + " foram adicionadas ao estoque.");
		} else {
			System.out.println("Quantidade inválida para compra.");
		}
	}
	
	public void realizarVenda(int qntVendida) {
		if (qntVendida > 0 && qntVendida <= qntEstoque) {
			this.qntEstoque -= qntVendida;
			System.out.println(qntVendida + " unidades do produto " + produto.getNome() + " foram vendidas.");
		} else {
			System.out.println("Quantidade inválida para venda ou estoque insuficiente.");
		}
	}
	
	public int getIdEstoqueProduto() {
		return idEstoqueProduto;
	}

	public void setIdEstoqueProduto(int idEstoqueProduto) {
		this.idEstoqueProduto = idEstoqueProduto;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQntEstoque() {
		return qntEstoque;
	}

	public void setQntEstoque(int qntEstoque) {
		this.qntEstoque = qntEstoque;
	}

	public Movimentacao getMovimentacao() {
		return movimentacao;
	}

	public void setMovimentacao(Movimentacao movimentacao) {
		this.movimentacao = movimentacao;
	}
	
	
}
