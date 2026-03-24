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
        ContaCorrente objCC = new ContaCorrente(3483653, 3420.50, 1000);
        objCC.exibirDados();
        
        System.out.println("");
        
        ContaPoupanca objCP = new ContaPoupanca(4239857, 3000, 12);
        objCP.exibirDados();

    }
    
}
