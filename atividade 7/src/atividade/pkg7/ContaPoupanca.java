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
public class ContaPoupanca extends ContaBancaria{
    private double taxaRendimento;
    
    public ContaPoupanca(int numeroconta, double saldo, double taxaRendimento) {
        super(numeroconta, saldo);
        this.taxaRendimento = taxaRendimento;
    }
    
    public void setTaxaRendimento(double taxaRendimento){
        this.taxaRendimento = taxaRendimento;
    }
    
    public double getTaxaRendimento(){
        return taxaRendimento;
    }
    
    public void exibirDados(){
        System.out.println("Numero da conta: " + getNumeroConta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Taxa de rendimento: " + getTaxaRendimento() + "%");
    }    
    
}