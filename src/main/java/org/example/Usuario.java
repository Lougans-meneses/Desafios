package org.example;

public abstract class Usuario {
    private String senha;
    protected String email;
    public String nome;

    public Usuario(String senha, String email, String nome) {
        this.senha = senha;
        this.email = email;
        this.nome = nome;
    }

    public abstract boolean autenticar(String senha);

    public final void exibirUsuario(){
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
    }

    protected String getSenha() {
        return senha;
    }

    protected void setSenha(String senha) {
        this.senha = senha;
    }
}
