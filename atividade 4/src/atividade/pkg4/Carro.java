/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg4;

/**
 *
 * @author aluno.saolucas
 */
public class Carro extends Veiculo{
    private int numeroPortas;
    
    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }
    
    public void setNumeroPortas(int numeroPortas){
        this.numeroPortas = numeroPortas;
    }
    
    public int getNumeroPortas(){
        return numeroPortas;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Numero de portas: " + getNumeroPortas());
    }
}