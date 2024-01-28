package br.com.alura.controleacesso;

import br.com.alura.controleacesso.modelos.*;

public class Main {
    public static void main(String[] args) {

        //Objeto conta bancária
        ContaBancaria minhaConta = new ContaBancaria();

        minhaConta.setNumeroConta(2253);
        minhaConta.setSaldo(6000);
        minhaConta.titular = "Jéssica Alves";

        System.out.println("Número da conta: " + minhaConta.getNumeroConta());
        System.out.println("Saldo: " + minhaConta.getSaldo());
        System.out.println("Titular: " + minhaConta.titular);


        //Objeto Idade Pessoa
        IdadePessoa minhaIdade = new IdadePessoa();

        minhaIdade.setNome("Jéssica Pereira");
        minhaIdade.setIdade(26);

        System.out.println("\nO nome da pessoa é " + minhaIdade.getNome());
        System.out.println("A idade da pessoa é " + minhaIdade.getIdade());

        minhaIdade.verificarIdade();

        //Objeto Produto
        Produto meuProduto = new Produto();
        meuProduto.setNomeProduto("Chaveiro");
        meuProduto.setPrecoProduto(10.0);

        System.out.println("\nO produto é: " + meuProduto.getNomeProduto());
        System.out.println("O preço do produto é: " + meuProduto.getPrecoProduto());

        meuProduto.aplicarDesconto(5);

        //Objeto Aluno

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.setNome("Jéssica Alves");
        aluno1.setNota1(10.0);
        aluno1.setNota2(7.5);
        aluno1.setNota3(8.0);

        System.out.println("\nAluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println();

        aluno2.setNome("Rafael Paludetti");
        aluno2.setNota1(8.0);
        aluno2.setNota2(9.5);
        aluno2.setNota3(10.0);

        System.out.println("Aluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Média: " + aluno2.calcularMedia());


        //Objeto Livro
        Livro meuLivro = new Livro();
        meuLivro.setTitulo("Linguagem de Programação");
        meuLivro.setAutor("Paulo Silveira");

        meuLivro.exibirDetalhes();
    }
}

