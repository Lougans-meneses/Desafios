package org.example;

public class Main {
    public static void main(String[] args) {
        Administrador admin = new Administrador("nub123","Luan_dev@gmail.com", "Luan" );

        System.out.println("Acesso direto ao nome: " + admin.nome);
        System.out.println("E-mail: " + admin.email);
        System.out.println("Senha: " + admin.getSenha());

        admin.exibirUsuario();

        boolean autentcado = admin.autenticar("nub123");
        System.out.println("Autenticado: " + autentcado);

        String novaSenha = "novaSenha";
        if (SegurancaUtils.validarSenha(novaSenha)){
            admin.redefinirSenha(novaSenha);
        } else {
            System.out.println("Senha fraca!");
        }

        boolean novaAutenticado = admin.autenticar("novaSenha");
        System.out.println("Autenticado com nova senha: " + novaAutenticado);


    }
}