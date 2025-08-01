## Desafio — Controle de Acesso com Modificadores
	Objetivo: Criar uma estrutura que use todos os principais modificadores (acesso e outros) corretamente.

Descrição:
	Você foi contratado para implementar uma parte do sistema de uma empresa que cuida do controle de usuários. A estrutura deve permitir o uso seguro de herança, acesso controlado a dados sensíveis e o uso de métodos utilitários globais.

Regras:

	Crie a classe abstrata Usuario com:

		Atributo private String senha
		Atributo protected String email
		Atributo public String nome

		Método abstrato boolean autenticar(String senha)
		Método final void exibirUsuario() que imprime nome e email

	Crie a classe Administrador que herda de Usuario e:
		Implementa o método autenticar(String senha) validando com this.senha
		Adiciona um método public void redefinirSenha(String novaSenha)

	Crie a classe utilitária SegurancaUtils com:
		Um método public static boolean validarSenhaForte(String senha) que retorna true se a senha tiver mais de 8 caracteres e pelo menos um número.
		Teste as funcionalidades na classe Sistema:
		Instancie um Administrador;
		Tente acessar todos os atributos de forma direta e anote os que são acessíveis;
		Use os métodos para autenticar e redefinir a senha;
		Use SegurancaUtils.validarSenhaForte().

