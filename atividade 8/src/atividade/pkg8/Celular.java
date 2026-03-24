/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg8;

/**
 *
 * @author aluno.saolucas
 */
public class Celular extends Dispositivo{
    private int memoria;
    
    public Celular(String marca, String modelo, int memoria) {
        super(marca, modelo);
        this.memoria = memoria;
    }
    
    public void setMemoria(int memoria){
        this.memoria = memoria;
    }
    
    public int getMemoria(){
        return memoria;
    }
    
    public void exibirDados(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Memoria: " + getMemoria() + "GB");
    }
    
}