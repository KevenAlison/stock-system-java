package application;

public class Permissao {
    private static int contId = 0;

    private int idPermissao;
    private String nome;

    public Permissao(String nome) {
        this.idPermissao = ++contId;
        this.nome = nome;
    }

    public int getId() {
        return idPermissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
