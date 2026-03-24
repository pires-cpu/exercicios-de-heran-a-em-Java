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
public class ContaBancaria {
    private int numeroconta;
    private double saldo;
    
    public ContaBancaria(int numeroconta, double saldo){
        this.numeroconta = numeroconta;
        this.saldo = saldo;
    }
    
    public void setNumeroConta(int numeroconta){
        this.numeroconta = numeroconta;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public int getNumeroConta(){
        return numeroconta;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void exibirDados(){
        System.out.println("Numero da conta: " + getNumeroConta());
        System.out.println("Saldo: " + getSaldo());
    }
}