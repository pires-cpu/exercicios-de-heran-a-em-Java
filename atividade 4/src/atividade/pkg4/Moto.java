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
public class Moto extends Veiculo{
    private String cilindradas;
    
    public Moto(String marca, String modelo, int ano, String cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }
    
    public void setCilindradas(String cilindradas){
        this.cilindradas = cilindradas;
    }
    
    public String getCilindradas(){
        return cilindradas;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Cilindradas: " + getCilindradas());
    }     
}