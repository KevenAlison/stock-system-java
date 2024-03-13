package application;

import java.util.Date;

public class Movimentacao {
    private int idMovimentacao;
    private TipoMovimentacao tipo;
    private Date date;
    
	public Movimentacao(int idMovimentacao, TipoMovimentacao tipo, Date date) {
		super();
		this.idMovimentacao = idMovimentacao;
		this.tipo = tipo;
		this.date = date;
	}

	public int getIdMovimentacao() {
		return idMovimentacao;
	}

	public void setIdMovimentacao(int idMovimentacao) {
		this.idMovimentacao = idMovimentacao;
	}

	public TipoMovimentacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

    
}