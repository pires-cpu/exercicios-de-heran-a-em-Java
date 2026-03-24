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
public class Transporte {
     private String capacidade;
    private double velocidade;
    
    public Transporte(String capacidade, double velocidade){
        this.capacidade = capacidade;
        this.velocidade = velocidade;
    }
    
    public void setCapacidade(String capacidade){
        this.capacidade = capacidade;
    }
    
    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }
    
    public String getCapacidade(){
        return capacidade;
    }
    
    public double getVelocidade(){
        return velocidade;
    }
    
    public void exibirDados(){
        System.out.println("Capacidade: " + getCapacidade());
        System.out.println("Velocidade: " + getVelocidade() + "Km/h");
    }
    
}