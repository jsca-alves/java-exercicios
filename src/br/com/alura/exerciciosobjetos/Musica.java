//Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes,
// e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
package br.com.alura.exerciciosobjetos;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int somaAvaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica(){
        String mensagem = """
                \nA música %s, foi criada pelo(a) artista %s e lançada no ano de %s
                """.formatted(titulo,artista,anoLancamento );
        System.out.println(mensagem);
    }

    void avaliaMusica(double nota){
        somaAvaliacao += nota;
        numAvaliacoes ++;
    }

    double calculaMediaAvaliacoes(){
        return somaAvaliacao / numAvaliacoes;
    }

}
