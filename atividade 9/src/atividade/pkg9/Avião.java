/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg9;

/**
 *
 * @author aluno.saolucas
 */
public class Avião extends Transporte{
    private String companhiaAerea;
    
    public Avião(String capacidade, double velocidade, String companhiaAerea) {
        super(capacidade, velocidade);
        this.companhiaAerea = companhiaAerea;
    }
    
    public void setCompanhiaAerea(String companhiaAerea){
        this.companhiaAerea = companhiaAerea;
    }
    
    public String getCompanhiaAerea(){
        return companhiaAerea;
    }
    
    public void exibirDados(){
        System.out.println("Companhia aerea: " + getCompanhiaAerea());
        System.out.println("Capacidade: " + getCapacidade());
        System.out.println("Velocidade: " + getVelocidade() + "Km/h");
    }
    
}