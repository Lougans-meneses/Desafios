package org.example;

public class Administrador extends Usuario {

    public Administrador(String senha, String email, String nome) {
        super(senha, email, nome);
    }

    @Override
    public boolean autenticar(String senha){
        return getSenha().equals(senha);
    }

    public void redefinirSenha(String senha){
        setSenha(senha);
        System.out.println("Senha redefinida com sucesso!");
    }
}
