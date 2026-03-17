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
public class Atividade4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Veiculo objveiculo = new Veiculo("Hyundai", "HB20", 2012);
        objveiculo.exibirDados();
        System.out.println("");
        
        Carro objcarro = new Carro("Toyota", "Corolla Cross", 2025, 4);
        objcarro.exibirDados();
        System.out.println("");
        
        Moto objmoto = new Moto("Yamaha", "Street", 2026, "125cc");
        objmoto.exibirDados();

    }
    
}