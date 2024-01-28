//Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica
// calcular a idade do carro.
package br.com.alura.exerciciosobjetos;

public class Carro {
    String modeloCarro;
    int anoCarro;
    String corCarro;

    void exibeFichaCarro(){
        String fichaCarro = """
                \nO carro do modelo %s, da cor %s foi lançado no ano de %s
                """.formatted(modeloCarro, corCarro, anoCarro);
        System.out.print(fichaCarro);

    }

    int calculaIdadeCarro(){
        return 2024 - anoCarro;
    }
}
