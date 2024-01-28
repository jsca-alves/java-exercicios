package br.com.alura.exerciciosobjetos;

public class Main {
    public static void main(String[] args) {

        //objeto Pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.exibeFrase();

        //objeto Calculadora
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.calculaDobro(8);
        System.out.println(resultado);

        //Objeto Musica
        Musica musica = new Musica();
        musica.titulo = "Hello You";
        musica.artista = "Arctic Monkeys";
        musica.anoLancamento = 2022;

        musica.exibeFichaTecnica();

        musica.avaliaMusica(10);
        musica.avaliaMusica(9);
        musica.avaliaMusica(10);

        System.out.println("A soma das avaliações para a música é " + musica.somaAvaliacao);
        System.out.println("O total de avaliações para a música é " + musica.numAvaliacoes);
        System.out.println("A média de avaliações para música é " + musica.calculaMediaAvaliacoes());


        //Objeto Carro
        Carro meuCarro = new Carro();
        meuCarro.modeloCarro = "Polo";
        meuCarro.corCarro = "Vermelho";
        meuCarro.anoCarro = 2023;

        meuCarro.exibeFichaCarro();
        System.out.println("A idade atual do carro é " + meuCarro.calculaIdadeCarro() + " ano(s)");

        //Objeto Aluno
        Aluno aluno = new Aluno();
        aluno.nomeAluno = "Rafael";
        aluno.idadeAluno = 26;

        aluno.exibeAluno();

    }
}
