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

public class ContaCorrente extends ContaBancaria{
    private double limite;
    
    public ContaCorrente(int numeroconta, double saldo, double limite) {
        super(numeroconta, saldo);
        this.limite = limite;
    }
    
    public void setLimite(double limite){
        this.limite = limite;
    }
    
    public double getLimite(){
        return limite;
    }
    
    public void exibirDados(){
        System.out.println("Numero da conta: " + getNumeroConta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Limite: " + getLimite());
    }    
    
}