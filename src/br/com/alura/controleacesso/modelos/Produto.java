//Desenvolva uma classe Produto com os atributos privados nome e preco.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
package br.com.alura.controleacesso.modelos;

public class Produto {
    private String nomeProduto;
    private double precoProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public void aplicarDesconto(double percentual){
        double desconto = (percentual/100) * precoProduto;
        precoProduto -= desconto;
        System.out.println("O preço do produto após descontos é: " + precoProduto);


    }
}
