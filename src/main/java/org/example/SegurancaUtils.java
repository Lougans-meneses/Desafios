package org.example;

public class SegurancaUtils {

    public static boolean validarSenha(String senha){
        if (senha.length() <= 8){
            return false;
        }

        boolean temNumero = false;
        for (char c : senha.toCharArray()){
            if (Character.isDigit(c)){
                temNumero = true;
                break;
            }
        }
        return temNumero;
    }
}
