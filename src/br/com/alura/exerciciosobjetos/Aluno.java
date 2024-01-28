//Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.
// Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
package br.com.alura.exerciciosobjetos;

public class Aluno {
    String nomeAluno;
    int idadeAluno;

    void exibeAluno(){
        String fichaAluno = """
                \nO aluno %s tem %s anos de idade
                """.formatted(nomeAluno, idadeAluno);
        System.out.println(fichaAluno);
    }

}
