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
public class Notebook extends Dispositivo{
    private int processador;
    
    public Notebook(String marca, String modelo, int processador) {
        super(marca, modelo);
        this.processador = processador;
    }
    
    public void setProcessador(int processador){
        this.processador = processador;
    }
    
    public int getProcessador(){
        return processador;
    }
    
    public void exibirDados(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Processador: i" + getProcessador());
    }
    
}