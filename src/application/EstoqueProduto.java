package application;

import java.util.Date;

public class EstoqueProduto {
	private static int contId = 0;
	
	private int idEstoqueProduto;
	private Produto produto;
	private int qntEstoque;
	private Movimentacao movimentacao;
	
	public EstoqueProduto(Produto produto, int qntEstoque, Movimentacao movimentacao) {
		super();
		this.idEstoqueProduto = ++contId;
		this.produto = produto;
		this.qntEstoque = qntEstoque;
        
        movimentacao = new Movimentacao(TipoMovimentacao.ENTRADA, new Date());
	}

	public void realizarCompra(int qntComprada) {
		if (qntComprada > 0) {
			this.qntEstoque += qntComprada;
			System.out.println(qntComprada + " " + produto.getNome() + " foram adicionadas ao estoque.");
		} else {
			System.out.println("Quantidade de compra inválida.");
		}
	}
	
	public void realizarVenda(int qntVendida) {
		if (qntVendida > 0 && qntVendida <= qntEstoque) {
			this.qntEstoque -= qntVendida;
			System.out.println(qntVendida + " " + produto.getNome() + " foram vendidas.");
		} else {
			System.out.println("Quantidade de venda inválida, consultar estoque.");
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
