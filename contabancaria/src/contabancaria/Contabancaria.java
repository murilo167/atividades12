        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria;

/**
 *
 * @author aluno.saolucas
 */
     public class Contabancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        
        Contabancaria MinhaConta = new Conta();

        MinhaConta.titular = "Felipe";
        MinhaConta.saldo = 0;

        MinhaConta.valor = 1000;
        MinhaConta.depositar();

        MinhaConta.valor = 500;
        MinhaConta.sacar();

        MinhaConta.valor = 600; // maior que o saldo
        MinhaConta.sacar();

        MinhaConta.mostrarSaldo();

    }
    
}
