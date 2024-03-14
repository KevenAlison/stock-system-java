package application;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private static int contId = 0;
	
	private int idUsuario;
    private String nome;
    private String email;
    private String senha;
    private Papel papel;
    private List<Permissao> permissoes;

    public Usuario(String nome, String email, String senha, Papel papel) {
    	this.idUsuario = ++contId;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.papel = papel;
        this.permissoes = new ArrayList<>();
        inicializarPermissoes();
    }

    private void inicializarPermissoes() {
        switch (papel) {
            case ADM:
                permissoes.add(new Permissao("CADASTRAR_PRODUTOS"));
                permissoes.add(new Permissao("ATUALIZACAO_ESTOQUE"));
                permissoes.add(new Permissao("GERENCIAR_USUARIOS"));
                permissoes.add(new Permissao("GERENCIAR_LOJAS"));
                break;
            case GERENTE:
                permissoes.add(new Permissao("RELATORIOS_ESTOQUE"));
                permissoes.add(new Permissao("HISTORICO_VENDAS"));
                break;
            case FUNCIONARIO:
            	permissoes.add(new Permissao("VENDA_PRODUTOS"));
                break;
        }
    }

    public void adicionarPermissao(Permissao permissao) {
        permissoes.add(permissao);
    }

    public void removerPermissao(Permissao permissao) {
        permissoes.remove(permissao);
    }

    public int getIdUsuario() {
        return idUsuario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Papel getPapel() {
        return papel;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }

    public List<Permissao> getPermissoes() {
        return permissoes;
    }
}
