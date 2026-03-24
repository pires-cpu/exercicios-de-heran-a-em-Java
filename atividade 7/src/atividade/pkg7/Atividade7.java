/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg7;

/**
 *
 * @author aluno.saolucas
 */
public class Atividade7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente objCC = new ContaCorrente(979653,54568.50, 998000);
        objCC.exibirDados();
        
        System.out.println("");
        
        ContaPoupanca objCP = new ContaPoupanca(754754, 550, 1877);
        objCP.exibirDados();

    }
    
}
