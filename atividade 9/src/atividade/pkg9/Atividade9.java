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
public class Atividade9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Avião objA = new Avião("Avião de pequeno Porte, 50 pessoas", 209 , "Airbus A380");
        objA.exibirDados();
        
        System.out.println("");
        
        Onibus objO = new Onibus("123T-10", 40, "Ônibus Leito");
        objO.exibirDados();
        

    }
    
}