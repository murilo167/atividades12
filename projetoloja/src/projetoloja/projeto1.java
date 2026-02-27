/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoloja;

/**
 *
 * @author aluno.saolucas
 */
public class projeto1 {
     String nome;
    double preco;
    int quantidadeEstoque;
    int quantidade; // variável auxiliar para vender/repor

    // Método para vender
    public void vender() {
        if (quantidade > quantidadeEstoque) {
            System.out.println("Não há estoque suficiente para vender " + quantidade + " unidades.");
        } else {
            quantidadeEstoque -= quantidade;
            System.out.println("Venda realizada: " + quantidade + " unidades de " + nome);
        }
    }

    // Método para repor
    public void repor() {
        quantidadeEstoque += quantidade;
        System.out.println("Reposto: " + quantidade + " unidades de " + nome);
    }

    // Mostrar estoque
    public void mostrarEstoque() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
        
    }
}

