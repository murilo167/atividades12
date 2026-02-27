e/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoloja;


public class Projetoloja {

  
    public static void main(String[] args) {   Produto p1 = new Produto();

        p1.nome = "Caneta";
        p1.preco = 2.50;
        p1.quantidadeEstoque = 10;

        // Vender 3 unidades
        p1.quantidade = 3;
        p1.vender();

        // Tentar vender mais do que tem
        p1.quantidade = 20;
        p1.vender();

        // Repor 5 unidades
        p1.quantidade = 5;
        p1.repor();

        // Mostrar estoque final
        p1.mostrarEstoque();
     
    }
    
}
